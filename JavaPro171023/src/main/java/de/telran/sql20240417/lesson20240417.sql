-- CRUD
-- Create - create database, create table
-- Read - select
-- Update - alter table, update
-- Delete - drop database, drop table, delete

-- create table(..)

-- not null
-- unique
-- check
-- default
-- primary key = not null + unique

-- varchar
-- char
-- int
-- decimal
-- boolean

-- insert into table_name(...)
-- values(...)

-- select column_name..,...
-- from table_name
-- [where ...]
-- limit
-- order by
-- inner join
-- group by
-- having


-- [not] between min and max
-- [not] in ('','','')
-- [not] like '%_'
-- > < >= <= = != <>
-- is [not] null

-- alter table
-- add
-- drop
-- modify
-- rename/change

-- set sql_safe_updates = 0;

-- update table_name
-- set ...
-- [where ..]

-- delete from table_name
-- [where ...]

-- inner join
-- self join
-- left join
-- right join

-- union/union all
-- ЗАДАЧИ
-- 1. Создать базу данных tasks.
create database tasks;

-- 2. Переключится на бд tasks.
use tasks;

--3. Создать таблицу с названием Employees, которая будет содержать информацию о сотрудниках компании. Таблица должна иметь следующие поля:
--
--employee_id - уникальный идентификатор сотрудника (Primary Key, автозаполнение)
--first_name - имя сотрудника (Not Null)
--last_name - фамилия сотрудника (Not Null)
--email - адрес электронной почты сотрудника (Unique, Not Null)
--age - возраст сотрудника (больше или равно 18)
create table Employees(
	employee_id int primary key auto_increment,
    first_name varchar(128) not null,
    last_name varchar(128) not null,
    email varchar(128) unique not null,
    age int check(age>=18)
);

--4. Заполнить таблицу данными с помощью следующих записей:
--
--Сотрудник с именем "John", фамилией "Doe", адресом электронной почты "john.doe@example.com" и возрастом 30 лет.
--Сотрудник с именем "Jane", фамилией "Smith", адресом электронной почты "jane.smith@example.com" и возрастом 25 лет.
--Сотрудник с именем "Michael", фамилией "Johnson", адресом электронной почты "michael.johnson@example.com" и возрастом 22 года.
--Сотрудник с именем "Emily", фамилией "Brown", адресом электронной почты "emily.brown@example.com" и возрастом 19 лет.
insert into Employees(first_name, last_name, email, age)
values 
('John', 'Doe', 'john.doe@example.com', 30),
('Jane', 'Smith', 'jane.smith@example.com', 25),
('Michael', 'Johnson', 'michael.johnson@example.com', 22),
('Emily', 'Brown', 'emily.brown@example.com', 19);

select * from Employees;
--1	John	Doe	john.doe@example.com	30
--2	Jane	Smith	jane.smith@example.com	25
--3	Michael	Johnson	michael.johnson@example.com	22
--4	Emily	Brown	emily.brown@example.com	19

--5. Найти всех сотрудников в возрасте от 20 до 30 лет.
select * from Employees
where age between 20 and 30;
--1	John	Doe	john.doe@example.com	30
--2	Jane	Smith	jane.smith@example.com	25
--3	Michael	Johnson	michael.johnson@example.com	22

--6. Найти сотрудников с именами "John", "Jane" и "Michael".
select * from Employees
where first_name in ('John', 'Jane', 'Michael');
--1	John	Doe	john.doe@example.com	30
--2	Jane	Smith	jane.smith@example.com	25
--3	Michael	Johnson	michael.johnson@example.com	22

--7. Найти всех сотрудников, у которых адрес электронной почты заканчивается на ".com".
select * from Employees
where email like '%.com';
--1	John	Doe	john.doe@example.com	30
--2	Jane	Smith	jane.smith@example.com	25
--3	Michael	Johnson	michael.johnson@example.com	22
--4	Emily	Brown	emily.brown@example.com	19

--8. Добавить столбец salary, тип int, где значение по умолчанию будет 0.
alter table Employees
add salary int default 0;

select *  from Employees;
--1	John	Doe	john.doe@example.com	30	0
--2	Jane	Smith	jane.smith@example.com	25	0
--3	Michael	Johnson	michael.johnson@example.com	22	0
--4	Emily	Brown	emily.brown@example.com	19	0

--9. Удалить столбец email, который больше не нужен.
alter table Employees drop email;

select *  from Employees;
--1	John	Doe	30	0
--2	Jane	Smith	25	0
--3	Michael	Johnson	22	0
--4	Emily	Brown	19	0

--10. Изменить тип данных столбца salary на DECIMAL(10,2), 
--чтобы хранить зарплату с точностью до двух знаков после запятой.
alter table Employees
modify salary DECIMAL(10, 2);

select *  from Employees;
--1	John	Doe	30	0
--2	Jane	Smith	25	0
--3	Michael	Johnson	22	0
--4	Emily	Brown	19	0

-- 11. обновить возраст сотрудника с именем "John" на 32 года.
update employees
set age = 32
where first_name = 'John';

select *  from Employees;
--1	John	Doe	32	0
--2	Jane	Smith	25	0
--3	Michael	Johnson	22	0
--4	Emily	Brown	19	0

--12. Изменить фамилию сотрудника с именем "Emily" на "Jameson".
update employees
set last_name = 'Jameson'
where first_name = 'Emily';

select *  from Employees;
--1	John	Doe	32	0
--2	Jane	Smith	25	0
--3	Michael	Johnson	22	0
--4	Emily	Jameson	19	0

--13. Обновить имя и фамилию сотрудника с именем "Jane" и фамилией "Smith" на "Jessica" и "Williams" соответственно.
update employees
set first_name = 'Jessica', last_name = 'Williams'
where first_name = 'Jane' and last_name = 'Smith';

select *  from Employees;
--1	John	Doe	32	0
--2	Jessica	Williams	25	0
--3	Michael	Johnson	22	0
--4	Emily	Jameson	19	0

--14. Создать столбец status (int)
alter table employees 
add status int;

--15. Изменить тип данных столбца на varchar
alter table employees
modify status varchar(128);

--16. Обновить столбец status для сотрудников в зависимости от их возраста. 
--Если возраст сотрудника меньше 25, установить статус "Junior", иначе установить статус "Senior".
update employees
set status = case
				when age < 25 then 'Junior'
                else 'Senior'
			end;

select *  from Employees;
--1	John	Doe	32	0	Senior
--2	Jessica	Williams	25	0	Senior
--3	Michael	Johnson	22	0	Junior
--4	Emily	Jameson	19	0	Junior

--17. Создать столбец full_name, который содержит полное имя сотрудника в формате "Имя Фамилия".	
alter table employees
add full_name varchar(128);

update employees
set full_name = concat(first_name, ' ', last_name);

--18. Удалить таблицу employees
drop table employees;

-- 19. Удалить базу данных tasks.
drop database tasks;

--20. Создать базу данных shop
https://github.com/NelliEfr/MySQL_databases/blob/main/shop.txt

create DATABASE shops;

use shops;

create TABLE SELLERS(
       SELL_ID    INTEGER, 
       SNAME   VARCHAR(20), 
       CITY    VARCHAR(20), 
       COMM    NUMERIC(2, 2),
             BOSS_ID  INTEGER
);
                                            
create TABLE CUSTOMERS(
       CUST_ID    INTEGER, 
       CNAME   VARCHAR(20), 
       CITY    VARCHAR(20), 
       RATING  INTEGER
);

create TABLE ORDERS(
       ORDER_ID  INTEGER, 
       AMT     NUMERIC(7,2), 
       ODATE   DATE, 
       CUST_ID    INTEGER,
       SELL_ID    INTEGER 
);

insert into SELLERS values(201,'Олег','Москва',0.12,202);
insert into SELLERS values(202,'Лев','Сочи',0.13,204);
insert into SELLERS values(203,'Арсений','Владимир',0.10,204);
insert into SELLERS values(204,'Екатерина','Москва',0.11,205);
insert into SELLERS values(205,'Леонид ','Казань',0.15,null);


insert into CUSTOMERS values(301,'Андрей','Москва',100);
insert into CUSTOMERS values(302,'Михаил','Тула',200);
insert into CUSTOMERS values(303,'Иван','Сочи',200);
insert into CUSTOMERS values(304,'Дмитрий','Ярославль',300);
insert into CUSTOMERS values(305,'Руслан','Москва',100);
insert into CUSTOMERS values(306,'Артём','Тула',100);
insert into CUSTOMERS values(307,'Юлия','Сочи',300);


insert into ORDERS values(101,18.69,'2022-03-10',308,207);
insert into ORDERS values(102,5900.1,'2022-03-10',307,204);
insert into ORDERS values(103,767.19,'2022-03-10',301,201);
insert into ORDERS values(104,5160.45,'2022-03-10',303,202);
insert into ORDERS values(105,1098.16,'2022-03-10',308,207);
insert into ORDERS values(106,75.75,'2022-04-10',304,202); 
insert into ORDERS values(107,4723,'2022-05-10',306,201);
insert into ORDERS values(108,1713.23,'2022-04-10',302,203);
insert into ORDERS values(109,1309.95,'2022-06-10',304,203);
insert into ORDERS values(110,9891.88,'2022-06-10',306,201);

--21. Получить информацию о заказах, включая имена продавцов и их города. ORDER_ID, AMT, ODATE, SNAME, CITY
select t1.ORDER_ID, t1.AMT, t1.ODATE, t2.SNAME, t2.CITY
from orders t1
join sellers t2
on t1.sell_id = t2.sell_id;
--102	5900,1	10 бер. 2022 р., 00:00:00	Екатерина	Москва
--103	767,19	10 бер. 2022 р., 00:00:00	Олег	Москва
--104	5160,45	10 бер. 2022 р., 00:00:00	Лев	Сочи
--106	75,75	10 квіт. 2022 р., 00:00:00	Лев	Сочи
--107	4723	10 трав. 2022 р., 00:00:00	Олег	Москва
--108	1713,23	10 квіт. 2022 р., 00:00:00	Арсений	Владимир
--109	1309,95	10 черв. 2022 р., 00:00:00	Арсений	Владимир
--110	9891,88	10 черв. 2022 р., 00:00:00	Олег	Москва

--22. Вывести имя покупателя(CNAME), даты его заказа(ODATE) и имя продавца товара(SNAME).
select t2.CNAME, t1.ODATE, t3.SNAME
from orders t1
join customers t2
on t1.CUST_ID = t2.CUST_ID
join sellers t3
on t1.SELL_ID = t3.SELL_ID;
--Андрей	10 бер. 2022 р., 00:00:00	Олег
--Михаил	10 квіт. 2022 р., 00:00:00	Арсений
--Иван	10 бер. 2022 р., 00:00:00	Лев
--Дмитрий	10 черв. 2022 р., 00:00:00	Арсений
--Дмитрий	10 квіт. 2022 р., 00:00:00	Лев
--Артём	10 черв. 2022 р., 00:00:00	Олег
--Артём	10 трав. 2022 р., 00:00:00	Олег
--Юлия	10 бер. 2022 р., 00:00:00	Екатерина

--23. Вывести кол/во продавцов.
select count(*) as sellers_count
from sellers;
--5

-- 24. Найти общее количество продавцов в каждом городе. Вывести город и кол/во.
select city, count(*) as sellers_count
from sellers
group by city;
--Москва	2
--Сочи	1
--Владимир	1
--Казань	1

--25. Получить среднюю комиссию для продавцов в каждом городе.
select city, avg(comm) as avg_comm
from sellers
group by city;

