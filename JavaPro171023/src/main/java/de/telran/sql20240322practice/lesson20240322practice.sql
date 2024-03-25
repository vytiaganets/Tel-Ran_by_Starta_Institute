--Check BD
use hr;
-- АГРЕГАЦИОННЫЕ ФУНКЦИИ 

-- 2. Найти самую маленькую зарплату среди всех сотрудников 

select
	min(salary) as min_salary
from employees;
--2100

-- 3. Найти самую большую зарплату среди всех сотрудников 

select
	max(salary) as max_salary
from employees;
--24000

-- 4. Найти среднюю зарплату среди всех сотрудников
select
avg (salary) as avg_salary from employees;
--6461,682243
-- 5. Найти сумму зарплат всех сотрудников 

select
	sum(salary) as sum_salary
from employees;
--691400

-- 6. Найти кол-во сотрудников 

select
	count(*) as employees_cnt
from employees;
--107

-- 7. Найти сотрудников (имя, фамилия, зарплата), которые зарабатывают больше всех в компании
-- 7. Найти сотрудников (имя, фамилия, зарплата), чья зарплата равна максимальной в компании

select
	first_name,
    last_name,
    salary
from employees
where salary = (select max(salary) from employees);

-- 8. Найти сотрудников (имя, фамилия, зарплата), 
--которые зарабатывают выше среднего

select first_name,
        last_name, 
        salary 
from employees
where salary > (select avg(salary) from employees);

-- 9. Найти сотрудников (имя, фамилия, зарплата, название департамента), которые зарабатывают выше среднего
select t1.first_name,
        t1.last_name, 
        t1.salary,
        t2.department_id
from employees t1
inner join departments t2
on t1.department_id = t2.department_id
where t1.salary > (select avg(salary) from employees);

use airport;

-- 11. Определите имена пассажиров и цену билета, класс обслуживания который эконом-премиум.
-- Примечание: цена билета не должна превышать средние значение среди всех купленных билетов.
-- В выборке должно присутствовать два атрибута — name, price.

select
	t1.name,
    t2.price
from clients t1
inner join tickets t2
on t1.id = t2.client_id
where t2.service_class = 'PremiumEconomy'
and t2.price < (select avg(price) from tickets);

--Boris Sokolov	22390
--Aleksandra Stepanova	33820
--Dmitry Petrov	48900
--Boris Sokolov	53580
--Victor Volkov	31340

select * from clients;

-- 12. Выведите максимальную цену билета на самолет до Домодедово ('DME')
-- Вывести: max_price

select
	max(t1.price) as max_price
from tickets t1
inner join trips t2
on t1.trip_id = t2.id
where t2.arrival = 'DME';
--null
-- 13. Вывести количество рейсов, 
--сделанных на белых самолетах.
-- Вывести : count
select
count(*) as trips_cnt
from airliners t1
inner join trips t2
on t1.id=t2.airliner_id
where t1.color='white';
--90

