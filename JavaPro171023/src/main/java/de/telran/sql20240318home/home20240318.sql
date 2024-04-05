
use Shop;
--Таблица - customers

--Вывести максимальный и минимальный credit_limit.
select max(CREDIT_LIMIT) as max_credit_limit,
min(CREDIT_LIMIT) as min_credit_limit
from customers;
--5000	100

--Вывести покупателей у которых creditlimit выше среднего creditlimit.
select CUST_FIRST_NAME
from customers
where credit_limit > (select avg(CREDIT_LIMIT) from customers);
--Fred	Reynolds
--Fred	Lithgow
--Irene	Laughton
--Prem	Cardinale
--Prem	Walken
--Kyle	Schneider
--Meg	Derek
--Shelley	Peckinpah
--Prem	Garcia
--Bob	McCarthy
--Dom	McQueen
--Dom	Hoskins

--Найти кол/во покупателей имя которых начинается на букву 'D' и credit_limit больше 500.
select count(*) as number_of_customers
from customers
where CUST_FIRST_NAME like 'D%' and CREDIT_LIMIT > 500;
--7

--Таблица - order_items
--
--Найти среднее значение unit_price
select avg(unit_price) as unit_average_price
from order_items;
--180,32391

--Таблицы - orderitems, productinformation
--
--Вывести имена продуктов(PRODUCT_NAME), кол/во(QUANTITY) которых меньше среднего.
select
	t1.QUANTITY,
    t2.PRODUCT_NAME
from order_items t1
join product_information t2
on t1.PRODUCT_ID = t2.PRODUCT_ID
where t1.QUANTITY < (select avg(t1.QUANTITY) from order_items t1);
--26	Monitor 19/SD/M
--21	Inkjet B/6
--23	LaserPro 600/6/BW
--20	Monitor 17/HR/F
--27	Monitor 17/HR/F
--12	LaserPro 600/6/BW

--Таблицы - orders, customers
--
--Вывести имя и фамилию покупателя с максимальной общей суммой покупки(ORDER_TOTAL).
select t1.CUST_FIRST_NAME,
t1.CUST_LAST_NAME
from customers t1
inner join orders t2
on t1.CUSTOMER_ID = t2.CUSTOMER_ID
where t2.ORDER_TOTAL = (select max(ORDER_TOTAL) from orders);
--Ishwarya	Roberts

--Найти сумму общей суммы покупок(ORDER_TOTAL) всех женатых мужчин покупателей.
select sum(t1.ORDER_TOTAL) as total_sum
from orders t1
inner join customers t2
on t1.CUSTOMER_ID = t2.CUSTOMER_ID
where t2.MARITAL_STATUS like 'married';
--781004,3