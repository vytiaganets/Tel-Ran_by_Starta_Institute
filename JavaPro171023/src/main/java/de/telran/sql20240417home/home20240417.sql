--Из базы данных shop:
--https://github.com/NelliEfr/MySQL_databases/blob/main/shop.txt

use shops;

--Найти общую сумму заказов для каждого клиента.
--Find the total amount of orders for each customer.

select t1.CNAME, sum(t2.AMT) as total_amount
from customers t1
inner join orders t2
on t1.CUST_ID = t2.CUST_ID
group by t1.CNAME;
--Юлия	5900,1
--Андрей	767,19
--Иван	5160,45
--Дмитрий	1385,7
--Артём	14614,88
--Михаил	1713,23

--Получить количество заказов для каждого продавца.
--Get the number of orders for each seller.
select t1.SNAME, count(t2.ORDER_ID) as orders_amount
from sellers t1
inner join orders t2
on t1.SELL_ID = t2.SELL_ID
group by t1.SNAME;
--Екатерина	1
--Олег	3
--Лев	2
--Арсений	2

--Получить количество клиентов с рейтингом выше среднего.
--Get the number of clients with above-average ratings.
select count(*), RATING
from customers
group by RATING
having RATING > (select avg(RATING) from customers);
--2	200
--2	300

--Получить количество клиентов в каждом городе с рейтингом выше 200.
--Get the number of clients in each city with a rating above 200.
select CITY, count(*) as customers_amount
from customers
where RATING > 200
group by CITY;
--Ярославль	1
--Сочи	1

--Получить количество заказов, сделанных в каждый месяц.
--Get the number of orders made in each month.
select ODATE, count(*) as order_amount
from orders
group by ODATE;
--10 бер. 2022 р., 00:00:00	5
--10 квіт. 2022 р., 00:00:00	2
--10 трав. 2022 р., 00:00:00	1
--10 черв. 2022 р., 00:00:00	2

--Найти клиентов, у которых сумма заказов превышает среднюю сумму заказов всех клиентов.
--Find customers whose order total exceeds the average order total of all customers.
select t1.CNAME, sum(t2.AMT) as total_amount
from customers t1
inner join orders t2
on t1.CUST_ID = t2.CUST_ID
group by t1.CNAME
having sum(t2.AMT) > (select avg(AMT) from orders);
--Юлия	5900,1
--Иван	5160,45
--Артём	14614,88