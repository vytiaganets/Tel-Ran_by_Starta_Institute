--Ссылка на создание БД HR: https://github.com/NelliEfr/hr_data/blob/master/script.sql
--1. Отсортировать сотрудников по фамилии в алфавитном порядке.

 select * 
 from sql.employees
 order by last_name;
 
--2. Отсортировать сотрудников по зарплате - от самой большой зарплаты до самой маленькой.

select * 
from sql.employees
order by salary desc;

--3. Вывести сотрудников, работающих в департаментах с id 60, 90 и 110, отсортированными в алфавитном порядке по фамилии 

select *
from sql.employees
where department_id IN (60,90,110)
order by last_name;

--4. Вывести трех сотрудников, чьи имена начинаются на букву D и отсортировать их в алфавитном порядке по фамилии

select * 
from sql.employees
where first_name LIKE 'D%'
order by last_name
limit 3;

--5. Вывести сотрудника с самой низкой зарплатой.

select * 
from sql.employees
order by salary 
limit 1;