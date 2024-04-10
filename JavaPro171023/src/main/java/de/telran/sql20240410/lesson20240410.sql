-- Группировка

use hr;

select * from employees;

select max(salary)
from employees;
-- group by
-- select столбцы
-- from таблцы
-- [where условие]
-- group by столбец
-- [order by столбцы]
-- Найти максимальную зарплату по департаментам
select max(salary) as max_salary, department_id
from employees
group by department_id;
--24000	90
--9000	60
--12000	100
--11000	30
--8200	50
--14000	80
--7000	
--4400	10
--13000	20
--6500	40
--10000	70
--12000	110
-- Найти среднее зарплат по департаментам
 select avg (salary) as avg_salary, department_id 
 from employees 
 group by department_id;
 --19333,333333	90
 --5760	60
 --8600	100
 --4150	30
 --3475,555556	50
 --8955,882353	80
 --7000	
 --4400	10
 --9500	20
 --6500	40
 --10000	70
 --10150	110
-- Найти имена и фамилии сотрудников с максимальной зарплатой в каждом департаменте
select t1.first_name, t1.last_name, t1.salary, t1.department_id from employees t1
join (select max(salary) as max_salary, department_id
from employees
group by department_id) t2
on t1.department_id = t2.department_id
where t1.salary = t2.max_salary;
--Steven	King	24000	90
--Alexander	Hunold	9000	60
--Nancy	Greenberg	12000	100
--Den	Raphaely	11000	30
--Adam	Fripp	8200	50
--John	Russell	14000	80
--Jennifer	Whalen	4400	10
--Michael	Hartstein	13000	20
--Susan	Mavris	6500	40
--Hermann	Baer	10000	70
--Shelley	Higgins	12000	110
-- Найти минимальную зарплату для каждой должности. Вывести min_salary, job_id
select min(salary) as min_salary, job_id from employees group by job_id;
--24000	AD_PRES
--17000	AD_VP
--4200	IT_PROG
--12000	FI_MGR
--6900	FI_ACCOUNT
--11000	PU_MAN
--2500	PU_CLERK
--5800	ST_MAN
--2100	ST_CLERK
--10500	SA_MAN
--6100	SA_REP
--2500	SH_CLERK
--4400	AD_ASST
--13000	MK_MAN
--6000	MK_REP
--6500	HR_REP
--10000	PR_REP
--12000	AC_MGR
--8300	AC_ACCOUNT
-- Найти сотрудников с минимальной зарплатой для каждой должности. Вывести first_name, last_name, salary, job_id

select t1.first_name, t1.last_name, t1.salary, t1.job_id
from employees t1
join (select min(salary) as min_salary, job_id
	from employees
	group by job_id) t2
on t1.job_id = t2.job_id and t1.salary = t2.min_salary;
--Steven	King	24000	AD_PRES
--Neena	Kochhar	17000	AD_VP
--Lex	De Haan	17000	AD_VP
--Diana	Lorentz	4200	IT_PROG
--Nancy	Greenberg	12000	FI_MGR
--Luis	Popp	6900	FI_ACCOUNT
--Den	Raphaely	11000	PU_MAN
--Karen	Colmenares	2500	PU_CLERK
--Kevin	Mourgos	5800	ST_MAN
--TJ	Olson	2100	ST_CLERK
--Eleni	Zlotkey	10500	SA_MAN
--Sundita	Kumar	6100	SA_REP
--Martha	Sullivan	2500	SH_CLERK
--Randall	Perkins	2500	SH_CLERK
--Jennifer	Whalen	4400	AD_ASST
--Michael	Hartstein	13000	MK_MAN
--Pat	Fay	6000	MK_REP
--Susan	Mavris	6500	HR_REP
--Hermann	Baer	10000	PR_REP

-- count c group_by
-- Кол/во строк в таблице employees
select count(*) as emp_count from employees;
--107
-- Посчитать кол/во людей в каждом департаменте
select department_id, count(*) as emp_count from employees group by department_id;
--90	3
--60	5
--100	6
--30	6
--50	45
--80	34
--	1
--10	1
--20	2
--40	1
--70	1
--110	2
-- Посчитать кол/во городов в каждой стране из таблицы locations. Вывести city_count, country_id
select count(city) as city_count, country_id
from locations
group by country_id;

--having
-- select столбцы
-- from таблцы 
-- [where условие]
-- group by столбец
-- [having условие]
-- [order by столбцы]

select department_id, count(*) as emp_count from employees
group by department_id having count(*)>5;
--100	6
--30	6
--50	45
--80	34
-- Вывести те депатраменты, в которых максимальная зарплата выше 10000
select department_id, max(salary) as max_salary from employees group by department_id having max(salary) > 10000;
--90	24000
--100	12000
--30	11000
--80	14000
--20	13000
--110	12000
-- Вывести название департаментов с кол/во сотрудников больше 5. Вывести department_name.
select department_name from departments t1
join (select department_id, count(*) as emp_count from employees group by department_id having count(*)>5) t2
on t1.department_id = t2.department_id;
--Purchasing
--Shipping
--Sales
--Finance

-- Вывести название должности(job_title) и маскимальную зарплату этой должности.
select t1.job_title, t2.max_salary
from jobs t1
join (
	select job_id, max(salary) as max_salary
    from employees
    group by job_id
) t2
on t1.job_id = t2.job_id;
--President	24000
--Administration Vice President	17000
--Administration Assistant	4400
--Finance Manager	12000
--Accountant	9000
--Accounting Manager	12000
--Public Accountant	8300
--Sales Manager	14000
--Sales Representative	11500
--Purchasing Manager	11000
--Purchasing Clerk	3100
--Stock Manager	8200
--Shipping Clerk	4200
--Programmer	9000
--Marketing Manager	13000
--Marketing Representative	6000
--Human Resources Representative	6500
--Public Relations Representative	10000

-- Вывести название должности и максимальную зарплату, если она больше 8000.
select t1.job_title, t2.max_salary
from jobs t1
join (
	select job_id, max(salary) as max_salary
    from employees
    group by job_id
    having max(salary) > 8000
) t2
on t1.job_id = t2.job_id;
--President	24000
--Administration Vice President	17000
--Finance Manager	12000
--Accountant	9000
--Accounting Manager	12000
--Public Accountant	8300
--Sales Manager	14000
--Sales Representative	11500
--Purchasing Manager	11000
--Stock Manager	8200
--Programmer	9000
--Marketing Manager	13000
--Public Relations Representative	10000

-- Найти кол/во сотрудников у каждого менеджера. Вывести manager_id и emp_count. 
select manager_id, count(employee_id) as emp_count
from employees
where manager_id is not null
group by manager_id;
--100	14
--102	1
--103	4
--101	5
--108	5
--114	5
--120	8
--121	8
--122	8
--123	8
--124	8
--145	6
--146	6
--147	6
--148	6
--149	6
--201	1
--205	1

-- Найти департамент с наибольшим кол/вом сотрудников.

-- 1. Найти кол/во сотрудников в каждом департаменте
select department_id, count(*) as emp_conut
from employees
group by department_id;
--90	3
--60	5
--100	6
--30	6
--50	45
--80	34
--	1
--10	1
--20	2
--40	1
--70	1
--110	2
-- 2. Найти максимальное кол/во сотрудников среди департаментов
select max(emp_conut) as max_emp_count
from (select department_id, count(*) as emp_conut
	from employees
	group by department_id) t1;
--45
-- 3. Найти ИД департманета с максимальным кол/вом сотрудников
select department_id, count(*)
from employees
group by department_id
having count(*) = (select max(emp_conut) as max_emp_count
from (select department_id, count(*) as emp_conut
	from employees
	group by department_id) t1);
--50	45
