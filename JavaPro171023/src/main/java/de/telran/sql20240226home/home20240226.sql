--1.Напишите запрос, который выводит идентификатор сотрудника, его имя и фамилию, а также категорию зарплаты на основе следующих условий:
--Если зарплата меньше 5000, категория "Низкая".
--Если зарплата от 5000 до 10000, категория "Средняя".
--Если зарплата больше 10000, категория "Высокая".
--Write a query that displays the employee ID, first and last name, and salary category based on the following conditions:
--If the salary is less than 5000, the category is "Low".
--If the salary is from 5000 to 10000, the category is “Average”.
--If the salary is more than 10,000, the category is “High”.
select
	employee_id,
    first_name,
    last_name,
		case 
			when salary < 5000 then 'Lower'
			when salary between 5000 and 10000 then 'Middle'
			else 'Higher'
		end as salary_category
from	
	employees;

--2.Определение размера премии сотрудникам:
--Напишите запрос, который выводит идентификатор сотрудника, его имя и фамилию, а также размер премии на основе следующих условий:
--Если зарплата меньше 5000, премия составляет 10% от зарплаты.
--Если зарплата от 5000 до 10000, премия составляет 15% от зарплаты.
--Если зарплата больше 10000, премия составляет 20% от зарплаты.
--Determination of bonus amount for employees:
--Write a query that displays the employee ID, first and last name, and bonus amount based on the following conditions:
--If the salary is less than 5000, the bonus is 10% of the salary.
--If the salary is from 5000 to 10000, the bonus is 15% of the salary.
--If the salary is more than 10,000, the bonus is 20% of the salary.
select
	employee_id,
    first_name,
    last_name,
		case
			when salary < 5000 then salary * 0.1
			when salary between 5000 and 10000 then salary * 0.15
            else salary * 0.2
        end as bonus_amount
from
	employees;


--3.Получить список стран с указанием их региона и обозначением страны "EU" для стран Европейского союза, "Non-EU" для остальных стран.
--Get a list of countries indicating their region and country designation "EU" for European Union countries, "Non-EU" for other countries.
select
	t1.country_name,
    t2.region_name,
    case
		when t2.region_name = 'Europe' then 'EU'
			else 'Non-EU'
		end as country_designation
	from
		countries t1
		inner join regions t2
		on t1.region_id = t2.region_id;
--4.Получить список стран с указанием количества символов в их названиях.
--Get a list of countries indicating the number of characters in their names.
select 
	country_name, length(country_name) as number_of_characters
from countries;
--5.Получить список стран и их первые три символа в названии
--Get a list of countries and their first three characters in the name
select
	country_name, left(country_name, 3) as characters_country
from countries;
--6.Получить список сотрудников с заменой их email на "Confidential", если он содержит слово "sqltutorial"
--Get a list of employees, replacing their email with "Confidential" if it contains the word "sqltutorial"
select
	 first_name, 
     last_name,
	case
		when email like 'sqltutorial' then 'Confidential' else email 
	end as email
from employees;

--7.Получить список сотрудников и указать их email в нижнем регистре.
--Get a list of employees and indicate their email in lowercase.
select
	 first_name, 
     last_name,
	LOWER(email) as lowercase
from employees;
--8.Получить список сотрудников(firstname, lastname) с указанием их должности(job_title).
--Get a list of employees (firstname, lastname) indicating their position (job_title).
select
	 t1.first_name, 
     t1.last_name,
     t2.job_title
from employees t1
inner join jobs t2
on t1.job_id = t2.job_id;
--9.Получить список отделов(department_name) и их названий с указанием местоположения(city).
--Get a list of departments (department_name) and their names indicating the location (city).
select
	t1.department_name,
	t2.city
from departments t1
inner join locations t2
on t1.location_id = t2.location_id;
--10.Получить список отделов(departmentname) и их менеджеров(firstname, last_name).
--Get a list of departments (departmentname) and their managers (firstname, last_name).
select
	t1.department_name,
    t2.first_name, 
	t2.last_name
from departments t1
inner join employees t2
on t1.department_id = t2.department_id;
--11.Получить список сотрудников(firstname, lastname) с указанием их департамента(department_name), отсортированный по департаменту.
--Get a list of employees (firstname, lastname) indicating their department (department_name), sorted by department.
select
	t1.first_name, 
	t1.last_name,
	t2.department_name
from employees t1
inner join departments t2
on t1.department_id = t2.department_id
order by t2.department_name;
--12.Получить список сотрудников(firstname, lastname)  и их менеджеров(firstname, lastname) 
--Get a list of employees(firstname, lastname) and their managers(firstname, lastname)
select
	t1.first_name as e_firstname,
    t1.last_name as e_lastname,
    t2.first_name as m_firstname,
    t2.last_name as m_lastname
from employees t1
left join employees t2 
on t1.employee_id = t2.manager_id;
--13.Получить список стран, где местоположение находится в США.
--Get a list of countries where the location is in the US.
select 
	t1.country_name
from countries t1
inner join locations t2
on t1.country_id = t2.country_id
where t1.country_id = 'US';