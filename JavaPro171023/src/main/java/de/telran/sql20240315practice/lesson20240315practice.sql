--1. Выбрать airport
use airport;
-- 2. Вывести имя пассажира и service_class, которым он/она летал(-а). Вывести только тех пассажиров, у которых есть service_class

select
	t1.name,
    t2.service_class
from clients t1
inner join tickets t2
on t1.id = t2.client_id
where service_class is not null;

-- 3. Вывести имя пассажира и service_class, которым он/она летал(-а). Если у пассажира нет инфо о service_class, то подставить null

select
	t1.name,
    t2.service_class
from clients t1
left join tickets t2
on t1.id = t2.client_id;

-- 4. Выведите имена пассажиров, летавших на борту (airliner_id) 00095579.
-- В выборке должен присутствовать один атрибут — name.

select
	t1.name
from clients t1
inner join tickets t2
on t1.id = t2.client_id
inner join trips t3
on t2.trip_id = t3.id
where t3.airliner_id = "00095579";

-- 5. Выведите имена пассажиров, летавших на самолетах белого цвета.
-- В выборке должен присутствовать один атрибут — name.

select
	t1.name
from clients t1
inner join tickets t2
on t1.id = t2.client_id
inner join trips t3
on t2.trip_id = t3.id
inner join airliners t4
on t3.airliner_id = t4.id
where t4.color = 'white';


-- 6. Выведите список имен пассажиров, чей рейс был отложен. Предусмотрите в выборке аэропорт отправления.
-- В выборке должно присутствовать два атрибута — name, departure.

-- 7. Определитель модель самолета, который не совершил ни одного рейса.
-- В выборке должен присутствовать один атрибут — model_name.