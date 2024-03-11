create database school;
use school;

create table Students( 
id integer primary key auto_increment, 
name varchar(128) not null, 
age integer ); 

create table Teachers( 
id integer primary key auto_increment, 
name varchar(128) not null, 
age integer ); 

create table Competencies( 
id integer primary key auto_increment, 
title varchar(128) not null );

create table Teachers2Competencies( 
id integer primary key auto_increment, 
teacher_id integer, 
competencies_id integer); 

create table Courses( 
id integer primary key auto_increment, 
teacher_id integer, 
title varchar(128) not null, 
headman_id integer); 

create table Students2Courses( 
id integer primary key auto_increment, 
student_id integer, 
course_id integer);

-- Добавить 6 записей в таблицу Students

-- Анатолий 29
-- Олег 25
-- Семен 27
-- Олеся 28
-- Ольга 31
-- Иван 22

insert into Students (name, age)
values ('Анатолий', 29),
	('Олег', 25),
    ('Семен', 27),
    ('Олеся', 28),
    ('Ольга', 31),
    ('Иван', 22);

--2) Добавить 6 записей в таблицу Teachers
--
--Петр 39
--Максим 35
--Антон 37
--Всеволод 38
--Егор 41
--Светлана 32

insert into Teachers (name, age)
values ('Петр', 39),
	('Максим', 35),
    ('Антон', 37),
    ('Всеволод', 38),
    ('Егор', 41),
    ('Светлана', 32);

--3) Добавить 4 записей в таблицу Competencies
--
--Математика
--Информатика
--Программирование
--Графика

insert into Competencies (title)
values ('Математика'),
	('Информатика'),
    ('Программирование'),
    ('Графика');

--4) Добавьте 6 записей в таблицу Teachers2Competencies
--
--1 1
--2 1
--2 3
--3 2
--4 1
--5 3
insert into Teachers2Competencies (teacher_id, competencies_id)
values (1, 1),
	(2, 1),
    (2, 3),
    (3, 2),
    (4, 1),
    (5, 3);
--5) Добавьте 5 записей в таблицу Courses
--
--1 Алгебра логики 2
--2 Математическая статистика 3
--4 Высшая математика 5
--5 Javascript 1
--5 Базовый Python 1
insert into Courses (teacher_id, title, headman_id)
values (1, 'Алгебра логики', 2),
	(2,'Математическая статистика', 3),
    (3,'Высшая математика', 5),
    (4,'Javascript', 1),
    (5,'Базовый Python', 1);

--6) Добавьте 5 записей в таблицу Students2Courses
--
--1 1
--2 1
--3 2
--3 3
--4 5
insert into Students2Courses (student_id, course_id)
values (1, 1),
	(2, 1),
    (3, 2),
    (3, 3),
    (4, 5);