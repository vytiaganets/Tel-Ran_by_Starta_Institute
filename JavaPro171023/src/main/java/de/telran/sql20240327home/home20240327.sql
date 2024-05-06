--Создать БД SimpleShop, используя следующие данные: https://github.com/NelliEfr/MySQL_databases/blob/main/shop.txt
create DATABASE store;

use store;

create TABLE SELLERS(
       SELL_ID    INTEGER, 
       SNAME   VARCHAR(20), 
       CITY    VARCHAR(20), 
       COMM    NUMERIC(2, 2),
             BOSS_ID  INTEGER
);
                                            
create TABLE CUSTOMERS(
       CUST_ID    INTEGER, 
       CNAME   VARCHAR(20), 
       CITY    VARCHAR(20), 
       RATING  INTEGER
);

create TABLE ORDERS(
       ORDER_ID  INTEGER, 
       AMT     NUMERIC(7,2), 
       ODATE   DATE, 
       CUST_ID    INTEGER,
       SELL_ID    INTEGER 
);

insert into SELLERS values(201,'Олег','Москва',0.12,202);
insert into SELLERS values(202,'Лев','Сочи',0.13,204);
insert into SELLERS values(203,'Арсений','Владимир',0.10,204);
insert into SELLERS values(204,'Екатерина','Москва',0.11,205);
insert into SELLERS values(205,'Леонид ','Казань',0.15,null);


insert into CUSTOMERS values(301,'Андрей','Москва',100);
insert into CUSTOMERS values(302,'Михаил','Тула',200);
insert into CUSTOMERS values(303,'Иван','Сочи',200);
insert into CUSTOMERS values(304,'Дмитрий','Ярославль',300);
insert into CUSTOMERS values(305,'Руслан','Москва',100);
insert into CUSTOMERS values(306,'Артём','Тула',100);
insert into CUSTOMERS values(307,'Юлия','Сочи',300);


insert into ORDERS values(101,18.69,'2022-03-10',308,207);
insert into ORDERS values(102,5900.1,'2022-03-10',307,204);
insert into ORDERS values(103,767.19,'2022-03-10',301,201);
insert into ORDERS values(104,5160.45,'2022-03-10',303,202);
insert into ORDERS values(105,1098.16,'2022-03-10',308,207);
insert into ORDERS values(106,75.75,'2022-04-10',304,202); 
insert into ORDERS values(107,4723,'2022-05-10',306,201);
insert into ORDERS values(108,1713.23,'2022-04-10',302,203);
insert into ORDERS values(109,1309.95,'2022-06-10',304,203);
insert into ORDERS values(110,9891.88,'2022-06-10',306,201);
--
--Определить какие из покупок были совершены в июне
select ORDER_ID
from orders
where monthname(ODATE) = 'June';
--109
--110
select order_id
from orders
where month(odate) = 6;
--109
--110
--Определить какие из покупок были совершены в интервале от 10 апреля 2022 до 10 мая 2022 года
select ORDER_ID
from orders
where ODATE between '2022-04-10' and '2022-05-10';
--106
--107
--108

--Определить сколько покупок было совершено в марте
select count(*) as total_amount
from orders
where monthname(ODATE) = 'March';
--5
select
	count(order_id) as count_order
from orders
where month(odate) = 3;
--5
--Определить среднюю стоимость покупок в марте
select avg(AMT) as avarage_price
from orders
where monthname(ODATE) = 'March';
--2588,918
select
	avg(amt) as avg_amt
from orders
where month(odate) = 3;
--2588,918

--Выведите минимальный рейтинг(rating) покупателя среди сделавших заказ в апреле 2022 года.
select t1.RATING
 from customers t1
 inner join orders t2
 on t1.CUST_ID = t2.CUST_ID
 where monthname(ODATE) = 'April' and year(ODATE) = '2022'
 order by t1.RATING limit 1;
--200
select
    min(rating) as min_rating
from orders t1
join customers t2
on t1.cust_id = t2.cust_id
where month(t1.odate) = 4;
--200

--Выведите продавцов, которые оформили заказ на наибольшую сумму в период с 1 марта по 1 май 2022 года.
--Вывести : sell_id, amt
select t1.sell_id, t2.amt
from sellers t1
inner join orders t2
on t1.SELL_ID = t2.SELL_ID
where t2.ODATE between '2022-03-01' and '2022-05-01'
order by t2.amt desc limit 1;
--204	5900,1