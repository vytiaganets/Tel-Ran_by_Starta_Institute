--Создать базу данных airport:
--https://github.com/NelliEfr/MySQL_databases/blob/main/airport.txt

use airport;

select * from airliners;
select * from trips;
select * from clients;
select * from tickets;

--1. Посчитать количество рейсов по каждой модели самолета. Вывести model_name и flightcount.
--1. Count the number of flights for each aircraft model. Print model_name and flightcount.
select t1.model_name, count(t2.id) as flightcount
from airliners t1
inner join trips t2
on t1.id = t2.airliner_id
group by t1.model_name;
--Airbus A321-200	30
--Airbus A320-200	26
--Boeing 777-300	39
--Sukhoi Superjet-100	5

--2. Вычислить среднюю стоимость билета по классам обслуживания. Вывести service_class и average_price.
--2. Calculate the average cost of a ticket by class of service. Print service_class and average_price.
select service_class, avg(price) as average_price 
from tickets
group by service_class;
--PremiumEconomy	49980
--Economy	28845,2778
--Business	121060
--FirstClass	325120

--3. Определить средний возраст клиентов, сгруппированных по классу обслуживания. Вывести service_class и average_age.
--3. Determine the average age of customers grouped by service class. Print service_class and average_age.
select t1.service_class, avg(t2.age) as average_age
from tickets t1
inner join clients t2
on t1.client_id = t2.id
group by t1.service_class;
--PremiumEconomy	47
--Economy	49,8611
--Business	70
--FirstClass	58,6667

--4. Получить общее количество билетов, купленных каждым клиентом. Вывести name и ticket_count.
--4. Get the total number of tickets purchased by each customer. Print name and ticket_count.
select t1.name, count(t2.id) as ticket_count
from clients t1
inner join tickets t2
on t1.id = t2.client_id
group by t1.name;
--Denis Stepanov	4
--Daria Volkova	4
--Anna Morozova	2
--Boris Sokolov	3
--Angelina Petrova	1
--Aleksandra Stepanova	3
--Vyacheslav Petrov	6
--Victor Volkov	3
--Tatiana Volkova	2
--Maria Fedorova	2
--Dmitry Petrov	2
--Elizaveta Egorova	2
--Maria Egorova	5
--Ludmila Ivanova	3
--Nadezhda Ivanova	3
--Daria Novikova	1
--Nadezhda Popova	2
--Ivan Egorov	1
--Aleksandr Nikolaev	1

--5. Определить количество рейсов, отправленных из каждого аэропорта. Вывести departure и departure_count.
--5. Determine the number of flights departing from each airport. Print departure and departure_count.
select departure, count(departure) as departure_count
from trips
group by departure;
--UCT	2
--TOX	1
--VKT	1
--MMK	1
--MCX	1
--KYZ	1
--PVS	2
--CEE	1
--IJK	2
--BWO	1
--RVH	2
--CEK	1
--UUD	1
--HTA	1
--KUF	2
--AMV	1
--PKC	1
--BCX	3
--SVO	1
--NAL	3
--MQF	2
--PEE	1
--IKS	2
--ACS	3
--OSW	1
--PKV	3
--ABA	2
--BQS	1
--TOF	1
--RZN	1
--BZK	2
--KSZ	2
--MJZ	2
--DME	5
--VKO	2
--AER	1
--NSK	3
--NNM	2
--OMS	1
--DKS	2
--KRR	1
--KJA	1
--PEZ	1
--STW	1
--RTW	3
--PYJ	2
--KHV	2
--TJM	1
--KZN	1
--DYR	1
--KEJ	3
--PES	1
--OVB	1
--SVX	1
--CNN	1
--ARH	1
--UFA	1
--NUX	1
--ESL	2
--UUS	1
--BKA	1
--SGC	1
--MRV	1
--LED	1
--KRO	1

--6. Вычислить общий доход от продажи билетов для каждой страны производителя самолетов. Вывести country и total_sum.
--6. Calculate total ticket revenue for each aircraft manufacturing country. Print country and total_sum.
select t1.country, sum(t3.price) as total_sum
from airliners t1
inner join trips t2
on t1.id = t2.airliner_id
inner join tickets t3
on t2.id = t3.trip_id
group by t1.country;
--Germany	352580
--Russia	1757330
--France	595820