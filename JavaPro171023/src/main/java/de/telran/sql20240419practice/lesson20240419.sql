--https://drive.google.com/file/d/1Wx7YUvnp3a8wFp0yPOIfBaCYqxLXwC_q/view?usp=sharing

use airport;

-- 1. Выведите среднюю цену билета для каждого класса обслуживания. 
-- Исключите из рассмотрения билеты, для которых класс обслуживания неизвестен (NULL). 
-- Исключите из выборки билеты рейсов FYHVSSGY и FYMKPDZC. Отсортируйте выборку по возрастанию средней цены.
-- В выборке должно присутствовать два атрибута — service_class, avg_price.

select
	service_class,
    avg(price) as avg_price
from tickets
where service_class is not null
and trip_id not in ('FYHVSSGY', 'FYMKPDZC')
group by service_class
order by avg_price;
--Economy	28845,2778
--PremiumEconomy	49980
--Business	121060
--FirstClass	325120

select
	t1.service_class,
    avg(t1.price) as avg_price
from tickets t1
inner join trips t2
on t1.trip_id = t2.id
where t1.service_class is not null
and t2.trip_code not in ('FYHVSSGY', 'FYMKPDZC')
group by t1.service_class
order by avg_price;
--Economy	28634,5161
--PremiumEconomy	49980
--Business	121060
--FirstClass	325120

-- 2. Выведите модели самолетов, у которых разность наибольшего и наименьшего значений максимальной дальности полета среди всех самолетов данной модели больше 1000. 
-- Отсортируйте выборку по убыванию этой разности. Если значение разности одинаковое для моделей, отсортировать в алфавитном порядке.
-- В выборке должен присутствовать один атрибут — model_name.

select 
	model_name,
    max(range_) - min(range_) as result
from airliners
group by model_name
having max(range_) - min(range_) > 1000
order by max(range_) - min(range_) desc, model_name;
--Airbus A320-200	4100
--Boeing 777-300	4100
--Airbus A321-200	3200

-- 3. Разделите самолеты на ближне-, средне- и дальнемагистральные. 
-- Ближнемагистральными будем считать самолеты, дальность полета которых > 1000 км и <= 2500 км. 
-- Среднемагистральными — с дальностью полета > 2500 км и <= 6000 км. 
-- Дальнемагистральными — с дальностью полета > 6000 км. 
-- Для каждой категории определите средний год выпуска самолетов.
-- Исключите из выборки самолеты, у которых максимальная дальность полета <= 1000 км или данных о дальности полета нет.
-- В столбце с категорией самолета укажите значения short-haul, medium-haul, long-haul для ближне-, средне- и дальнемагистральных самолетов соответственно. 
-- В выборке должны присутствовать три атрибута — category, avg_year.

select
	case
		when range_ > 1000 and range_ <= 2500 then 'short-haul'
        when range_ > 2500 and range_ <= 6000 then 'medium-haul'
        when range_ > 6000 then 'long-haul'
    end as category,
    avg(production_year) as avg_year
from airliners
group by category;
--long-haul	2009,3571
--short-haul	1978
--medium-haul	2013