use hr;
-- 1. Вывести самую высокую зарплату в компании

select
	max(salary) as max_salary
from employees;
--24000

-- 2. Вывести самую высокую зарплату в каждом департаменте

select
	department_id,
	max(salary) as max_salary
from employees
group by department_id;
--90	24000
--60	9000
--100	12000
--30	11000
--50	8200
--80	14000
--	7000
--10	4400
--20	13000
--40	6500
--70	10000
--110	12000
-- 3. Вывести среднюю зарплату в каждом департаменте. Вывести информацию только о тех департаментах, где макс зарплата больше 10000

select
	department_id,
	avg(salary) as avg_salary
from employees
group by department_id
having avg_salary > 10000;
--90	19333,333333
--110	10150
-- 4. Вывести максимальную зарплату в каждом департаменте. Вывести информацию только о тех департаментах, где макс зарплата больше 10000

select
	department_id,
	max(salary) as max_salary
from employees
where salary > 10000
group by department_id;
--90	24000
--100	12000
--30	11000
--80	14000
--20	13000
--110	12000

select
	department_id,
	max(salary) as max_salary
from employees
group by department_id
having max_salary > 10000;
--90	24000
--100	12000
--30	11000
--80	14000
--20	13000
--110	12000

-- 5. Вывести среднюю зарплату в каждом департаменте. 
-- Вывести department_name и avg_salary

select 
	t2.department_name,
    avg(t1.salary) as avg_salary
from employees t1
inner join departments t2
on t1.department_id = t2.department_id
group by t2.department_name;
--Executive	19333,333333
--IT	5760
--Finance	8600
--Purchasing	4150
--Shipping	3475,555556
--Sales	8955,882353
--Administration	4400
--Marketing	9500
--Human Resources	6500
--Public Relations	10000
--Accounting	10150

-- 6. Вывести среднюю зарплату по каждой должности 
-- Вывести job_title и avg_salary

select
	t2.job_title,
    avg(t1.salary) as avg_salary
from employees t1
inner join jobs t2
on t1.job_id = t2.job_id
group by t2.job_title;
--President	24000
--Administration Vice President	17000
--Programmer	5760
--Finance Manager	12000
--Accountant	7920
--Purchasing Manager	11000
--Purchasing Clerk	2780
--Stock Manager	7280
--Sales Manager	12200
--Sales Representative	8350
--Shipping Clerk	3215
--Administration Assistant	4400
--Marketing Manager	13000
--Marketing Representative	6000
--Human Resources Representative	6500
--Public Relations Representative	10000
--Accounting Manager	12000
--Public Accountant	8300

-- 7. Вывести названия должностей, у которых минимальная зарплата больше 10000
-- Вывести только job_title

select
	t2.job_title
from employees t1
inner join jobs t2
on t1.job_id = t2.job_id
group by t2.job_title
having min(t1.salary) > 10000;
--President
--Administration Vice President
--Finance Manager
--Purchasing Manager
--Sales Manager
--Marketing Manager
--Accounting Manager
-- 8. Вывести города, в которых сотрудники в среднем получают более 9000
-- Вывести city
select
	t2.job_title
from employees t1
inner join jobs t2
on t1.job_id = t2.job_id
group by t2.job_title
having min(t1.salary) > 10000;

-- 8. Вывести города, в которых сотрудники в среднем получают более 9000
-- Вывести city
-- 8. Вывести города, в которых сотрудники в среднем получают более 9000
-- Вывести city

select
	t3.city
from employees t1
inner join departments t2
on t1.department_id = t2.department_id
inner join locations t3
on t2.location_id = t3.location_id
group by t3.city
having avg(t1.salary) > 9000;
--Toronto
--Munich