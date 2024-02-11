--1. Создать таблицу employees;
--employeeid целое число первичный ключ автоинкремент;
--fname строка не null,
--lastname строка не null,
--email строка не null,
--phone строка не null

create table mysql.employees(
	id int primary key auto_increment,
	fname varchar(128) not null,
    lname varchar(128) not null,
    email varchar(128) not null,
    phone varchar(128) not null
);


--2. Ой, забыли про зарплату)) Добавить поле salary numeric(9, 2),

alter table mysql.employees
add column salary numeric(9,2);

--3. Ойййй, нет, зарплата должна быть целым числом. Изменить тип salary на integer 

alter table mysql.employees
modify column salary int;

--4. Переименовать поле fname на first_name

alter table mysql.employees
rename column fname to first_name;

--5. Удалить поле phone

alter table mysql.employees
drop column phone;

--6. Добавить поле department строка не null 

alter table mysql.employees
add column department varchar(128) not null;

--7. Заполнить таблицу (7 строк)

insert into employees 
(first_name,lname,email,salary,department)
values
('Bob', 'Marley', 'bob@gmail.com', 1000, 'IT'),
('Kob', 'Beeb', 'kob@gmail.com', 6000, 'TA'),
('Lob', 'Deel', 'lob@gmail.com', 3000, 'QA'),
('Mob', 'Smith', 'mob@gmail.com', 9000, 'BA'),
('Pob', 'Back', 'pob@gmail.com', 2000, 'II'),
('Tob', 'Noord', 'tob@gmail.com', 7000, 'HR'),
('Zob', 'Marke', 'zob@gmail.com', 3000, 'IT');

select * from employees;