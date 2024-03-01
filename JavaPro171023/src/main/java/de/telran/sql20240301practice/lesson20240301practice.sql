use hr;
show tables;
--UNION / UNION ALL - вертикальное
--INNER JOIN - горизонтальное

-- 1. Вывести имя/фамилию сотрудника и айди департамента, в котором он работает
select
	first_name,
    last_name,
    department_id
from employees;

-- 2. Вывести имя/фамилию сотрудника и название департамента, в котором он работает
select
 t1.first_name,
 t1.last_name,
 t2.department_name
 from employees t1
inner join departments t2
on t1.department_id = t2.department_id;

-- 3. Вывести имя/фамилию сотрудника и название его должности
select
	t1.first_name,
    t1.last_name,
    t2.job_title
from employees t1
inner join jobs t2
on t1.job_id = t2.job_id;
-- 4. Вывести имя/фамилию сотрудников, которые работают в департаментах Finance и Sales

select
	t1.first_name,
    t1.last_name
from employees t1
inner join departments t2
on t1.department_id = t2.department_id
where t2.department_name in ('Finance', 'Sales');

select * from  employees;
select * from  jobs;
select * from  countries;
select * from  departments;
select * from  locations;
select * from  regions;

-- 5. Вывести имя/фамилию и город сотрудников, которые работают в городах Roma, Tokyo, Toronto
select
	t1.first_name,
    t1.last_name,
    t3.city
from employees t1
inner join departments t2
on t1.department_id = t2.department_id
inner join locations t3
on t2.location_id = t3.location_id
where t3.city in ('Roma', 'Tokyo', 'Toronto');

-- 6. Вывести имя/фамилию, работающих в Canada

select
	t1.first_name,
    t1.last_name
from employees t1
inner join departments t2
on t1.department_id = t2.department_id
inner join locations t3
on t2.location_id = t3.location_id
inner join countries t4
on t3.country_id = t4.country_id
where t4.country_name = 'Canada';