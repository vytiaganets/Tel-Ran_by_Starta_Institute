-- Создать таблицу fruits
-- id целое число первичный ключ авто заполнение
-- name строка(128) не пустое
-- quantity число с плав. точкой 2, 1

create table mysql.fruits(
id int primary key auto_increment,
    name varchar(128) not null,
    quantity decimal(2, 1)
);

select * from mysql.fruits;
-- Поменять тип у quantity на целое число
ALTER TABLE mysql.fruits MODIFY quantity INT;

-- Переименовать поле name на fruit_name
ALTER TABLE mysql.fruits CHANGE COLUMN name fruit_name;
--insert
insert into products(fruit_name, price, quantity)
values ('Apple', 30, 20),
('Banana', 36, 50),
('Kiwi', 10, 2),
('Pineapple', 65, 60),
('Avocado', 60, 0),
('Grapes', 25, 2),
('Mango', 45, 0),
('Apricot', 40, 10),
('Orange', 35, 3),
('Lime', 20, 65);

insert into fruits(fruit_name, price, quantity)
values ('Apple', 30, 20),
('Banana', 36, 50),
('Kiwi', 10, 2),
('Pineapple', 65, 60),
('Avocado', 60, 0),
('Grapes', 25, 2),
('Mango', 45, 0),
('Apricot', 40, 10),
('Orange', 35, 3),
('Lime', 20, 65);

-- вывести фрукты и которых кол/во больше 30
select * from fruits
where quantity > 30;

-- Удаление данных
delete from table_name
where ...;


-- Error Code: 1175. You are using safe update mode and you tried to update a table without a WHERE that uses a KEY column.  To disable safe mode, toggle the option in Preferences -> SQL Editor and reconnect.	0.016 sec
-- Используем безопасный режим обновлений
-- Чтобы удалить или обновить данные нужно отключить этот режим
set sql_safe_updates = 0;

-- Удалить фрукты с кол/во 0
delete from fruits
where quantity = 0;

-- Update - изменение/обновление данных
-- update table_name
-- set column1 = new_value, column2 = new_value
-- where...

-- Увеличить кол/во яблоки на 2
update fruits
set quantity = quantity + 2
where fruit_name = 'Apple';
-- Увеличить кол/во яблоки на 2
update fruits
set quantity = quantity + 2
where fruit_name = 'Apple';

-- Изменить цену киви на 15
update fruits
set price = 15
where fruit_name = 'Kiwi';

-- Изменить кол/во бананы на 20, и увеличить цену в два раза

update fruits
set quantity = 20, price =  price * 2
where fruit_name = 'Banana';

-- После изменений включаем режим безопасных обновлений
set sql_safe_updates = 1;

-- 1. создать таблицу Employees с полями 

-- employee_id целое число,
--  , first_name текст
--  , last_name текст
--  , email текст
--  , phone текст
--  , job_id текст
--  , salary целое число
--  , commission_pct целое число
--  , manager_id целое число
--  , department_id целое число

drop table mysql.Employees;

create table mysql.Employees(
	employee_id int
 , first_name varchar(128)
 , last_name varchar(128)
 , email varchar(128)
 , phone varchar(128)
 , job_id varchar(128)
 , salary int
 , commission_pct int
 , manager_id int
 , department_id int
);

select * from Employees;

insert into employees values 
        ( 100
        , 'Steven'
        , 'King'
        , 'SKING'
        , '515.123.4567'
        , 'AD_PRES'
        , 24000
        , null
        , null
        , 90
        );

insert into employees values 
        ( 101
        , 'Neena'
        , 'Kochhar'
        , 'NKOCHHAR'
        , '515.123.4568'
        , 'AD_VP'
        , 17000
        , null
        , 100
        , 90
        );

insert into employees values 
        ( 102
        , 'Lex'
        , 'De Haan'
        , 'LDEHAAN'
        , '515.123.4569'
        , 'AD_VP'
        , 17000
        , null
        , 100
        , 90
        );

insert into employees values 
        ( 103
        , 'Alexander'
        , 'Hunold'
        , 'AHUNOLD'
        , '590.423.4567'
        , 'IT_PROG'
        , 9000
        , null
        , 102
        , 60
        );

insert into employees values 
        ( 104
        , 'Bruce'
        , 'Ernst'
        , 'BERNST'
        , '590.423.4568'
        , 'IT_PROG'
        , 6000
        , null
        , 103
        , 60
        );

insert into employees values 
        ( 105
        , 'David'
        , 'Austin'
        , 'DAUSTIN'
        , '590.423.4569'
        , 'IT_PROG'
        , 4800
        , null
        , 103
        , 60
        );

insert into employees values 
        ( 106
        , 'Valli'
        , 'Pataballa'
        , 'VPATABAL'
        , '590.423.4560'
        , 'IT_PROG'
        , 4800
        , null
        , 103
        , 60
        );

insert into employees values 
        ( 107
        , 'Diana'
        , 'Lorentz'
        , 'DLORENTZ'
        , '590.423.5567'
        , 'IT_PROG'
        , 4200
        , null
        , 103
        , 60
        );

insert into employees values 
        ( 108
        , 'Nancy'
        , 'Greenberg'
        , 'NGREENBE'
        , '515.124.4569'
        , 'FI_MGR'
        , 12000
        , null
        , 101
        , 100
        );

insert into employees values 
        ( 109
        , 'Daniel'
        , 'Faviet'
        , 'DFAVIET'
        , '515.124.4169'
        , 'FI_ACCOUNT'
        , 9000
        , null
        , 108
        , 100
        );

insert into employees values 
        ( 110
        , 'John'
        , 'Chen'
        , 'JCHEN'
        , '515.124.4269'
        , 'FI_ACCOUNT'
        , 8200
        , null
        , 108
        , 100
        );

insert into employees values 
        ( 111
        , 'Ismael'
        , 'Sciarra'
        , 'ISCIARRA'
        , '515.124.4369'
        , 'FI_ACCOUNT'
        , 7700
        , null
        , 108
        , 100
        );

insert into employees values 
        ( 112
        , 'Jose Manuel'
        , 'Urman'
        , 'JMURMAN'
        , '515.124.4469'
        , 'FI_ACCOUNT'
        , 7800
        , null
        , 108
        , 100
        );

insert into employees values 
        ( 113
        , 'Luis'
        , 'Popp'
        , 'LPOPP'
        , '515.124.4567'
        , 'FI_ACCOUNT'
        , 6900
        , null
        , 108
        , 100
        );

insert into employees values 
        ( 114
        , 'Den'
        , 'Raphaely'
        , 'DRAPHEAL'
        , '515.127.4561'
        , 'PU_MAN'
        , 11000
        , null
        , 100
        , 30
        );

insert into employees values 
        ( 115
        , 'Alexander'
        , 'Khoo'
        , 'AKHOO'
        , '515.127.4562'
        , 'PU_CLERK'
        , 3100
        , null
        , 114
        , 30
        );

insert into employees values 
        ( 116
        , 'Shelli'
        , 'Baida'
        , 'SBAIDA'
        , '515.127.4563'
        , 'PU_CLERK'
        , 2900
        , null
        , 114
        , 30
        );

insert into employees values 
        ( 117
        , 'Sigal'
        , 'Tobias'
        , 'STOBIAS'
        , '515.127.4564'
        , 'PU_CLERK'
        , 2800
        , null
        , 114
        , 30
        );

insert into employees values 
        ( 118
        , 'Guy'
        , 'Himuro'
        , 'GHIMURO'
        , '515.127.4565'
        , 'PU_CLERK'
        , 2600
        , null
        , 114
        , 30
        );

insert into employees values 
        ( 119
        , 'Karen'
        , 'Colmenares'
        , 'KCOLMENA'
        , '515.127.4566'
        , 'PU_CLERK'
        , 2500
        , null
        , 114
        , 30
        );

insert into employees values 
        ( 120
        , 'Matthew'
        , 'Weiss'
        , 'MWEISS'
        , '650.123.1234'
        , 'ST_MAN'
        , 8000
        , null
        , 100
        , 50
        );

insert into employees values 
        ( 121
        , 'Adam'
        , 'Fripp'
        , 'AFRIPP'
        , '650.123.2234'
        , 'ST_MAN'
        , 8200
        , null
        , 100
        , 50
        );

insert into employees values 
        ( 122
        , 'Payam'
        , 'Kaufling'
        , 'PKAUFLIN'
        , '650.123.3234'
        , 'ST_MAN'
        , 7900
        , null
        , 100
        , 50
        );

insert into employees values 
        ( 123
        , 'Shanta'
        , 'Vollman'
        , 'SVOLLMAN'
        , '650.123.4234'
        , 'ST_MAN'
        , 6500
        , null
        , 100
        , 50
        );

insert into employees values 
        ( 124
        , 'Kevin'
        , 'Mourgos'
        , 'KMOURGOS'
        , '650.123.5234'
        , 'ST_MAN'
        , 5800
        , null
        , 100
        , 50
        );

insert into employees values 
        ( 125
        , 'Julia'
        , 'Nayer'
        , 'JNAYER'
        , '650.124.1214'
        , 'ST_CLERK'
        , 3200
        , null
        , 120
        , 50
        );

insert into employees values 
        ( 126
        , 'Irene'
        , 'Mikkilineni'
        , 'IMIKKILI'
        , '650.124.1224'
        , 'ST_CLERK'
        , 2700
        , null
        , 120
        , 50
        );

insert into employees values 
        ( 127
        , 'James'
        , 'Landry'
        , 'JLANDRY'
        , '650.124.1334'
        , 'ST_CLERK'
        , 2400
        , null
        , 120
        , 50
        );

insert into employees values 
        ( 128
        , 'Steven'
        , 'Markle'
        , 'SMARKLE'
        , '650.124.1434'
        , 'ST_CLERK'
        , 2200
        , null
        , 120
        , 50
        );

insert into employees values 
        ( 129
        , 'Laura'
        , 'Bissot'
        , 'LBISSOT'
        , '650.124.5234'
        , 'ST_CLERK'
        , 3300
        , null
        , 121
        , 50
        );

insert into employees values 
        ( 130
        , 'Mozhe'
        , 'Atkinson'
        , 'MATKINSO'
        , '650.124.6234'
        , 'ST_CLERK'
        , 2800
        , null
        , 121
        , 50
        );

insert into employees values 
        ( 131
        , 'James'
        , 'Marlow'
        , 'JAMRLOW'
        , '650.124.7234'
        , 'ST_CLERK'
        , 2500
        , null
        , 121
        , 50
        );

insert into employees values 
        ( 132
        , 'TJ'
        , 'Olson'
        , 'TJOLSON'
        , '650.124.8234'
        , 'ST_CLERK'
        , 2100
        , null
        , 121
        , 50
        );

insert into employees values 
        ( 133
        , 'Jason'
        , 'Mallin'
        , 'JMALLIN'
        , '650.127.1934'
        , 'ST_CLERK'
        , 3300
        , null
        , 122
        , 50
        );

insert into employees values 
        ( 134
        , 'Michael'
        , 'Rogers'
        , 'MROGERS'
        , '650.127.1834'
        , 'ST_CLERK'
        , 2900
        , null
        , 122
        , 50
        );

insert into employees values 
        ( 135
        , 'Ki'
        , 'Gee'
        , 'KGEE'
        , '650.127.1734'
        , 'ST_CLERK'
        , 2400
        , null
        , 122
        , 50
        );

insert into employees values 
        ( 136
        , 'Hazel'
        , 'Philtanker'
        , 'HPHILTAN'
        , '650.127.1634'
        , 'ST_CLERK'
        , 2200
        , null
        , 122
        , 50
        );

insert into employees values 
        ( 137
        , 'Renske'
        , 'Ladwig'
        , 'RLADWIG'
        , '650.121.1234'
        , 'ST_CLERK'
        , 3600
        , null
        , 123
        , 50
        );

insert into employees values 
        ( 138
        , 'Stephen'
        , 'Stiles'
        , 'SSTILES'
        , '650.121.2034'
        , 'ST_CLERK'
        , 3200
        , null
        , 123
        , 50
        );

insert into employees values 
        ( 139
        , 'John'
        , 'Seo'
        , 'JSEO'
        , '650.121.2019'
        , 'ST_CLERK'
        , 2700
        , null
        , 123
        , 50
        );

insert into employees values 
        ( 140
        , 'Joshua'
        , 'Patel'
        , 'JPATEL'
        , '650.121.1834'
        , 'ST_CLERK'
        , 2500
        , null
        , 123
        , 50
        );

insert into employees values 
        ( 141
        , 'Trenna'
        , 'Rajs'
        , 'TRAJS'
        , '650.121.8009'
        , 'ST_CLERK'
        , 3500
        , null
        , 124
        , 50
        );

insert into employees values 
        ( 142
        , 'Curtis'
        , 'Davies'
        , 'CDAVIES'
        , '650.121.2994'
        , 'ST_CLERK'
        , 3100
        , null
        , 124
        , 50
        );

insert into employees values 
        ( 143
        , 'Randall'
        , 'Matos'
        , 'RMATOS'
        , '650.121.2874'
        , 'ST_CLERK'
        , 2600
        , null
        , 124
        , 50
        );

insert into employees values 
        ( 144
        , 'Peter'
        , 'Vargas'
        , 'PVARGAS'
        , '650.121.2004'
        , 'ST_CLERK'
        , 2500
        , null
        , 124
        , 50
        );

insert into employees values 
        ( 145
        , 'John'
        , 'Russell'
        , 'JRUSSEL'
        , '011.44.1344.429268'
        , 'SA_MAN'
        , 14000
        , .4
        , 100
        , 80
        );

insert into employees values 
        ( 146
        , 'Karen'
        , 'Partners'
        , 'KPARTNER'
        , '011.44.1344.467268'
        , 'SA_MAN'
        , 13500
        , .3
        , 100
        , 80
        );

insert into employees values 
        ( 147
        , 'Alberto'
        , 'Errazuriz'
        , 'AERRAZUR'
        , '011.44.1344.429278'
        , 'SA_MAN'
        , 12000
        , .3
        , 100
        , 80
        );

insert into employees values 
        ( 148
        , 'Gerald'
        , 'Cambrault'
        , 'GCAMBRAU'
        , '011.44.1344.619268'
        , 'SA_MAN'
        , 11000
        , .3
        , 100
        , 80
        );

insert into employees values 
        ( 149
        , 'Eleni'
        , 'Zlotkey'
        , 'EZLOTKEY'
        , '011.44.1344.429018'
        , 'SA_MAN'
        , 10500
        , .2
        , 100
        , 80
        );

insert into employees values 
        ( 150
        , 'Peter'
        , 'Tucker'
        , 'PTUCKER'
        , '011.44.1344.129268'
        , 'SA_REP'
        , 10000
        , .3
        , 145
        , 80
        );

insert into employees values 
        ( 151
        , 'David'
        , 'Bernstein'
        , 'DBERNSTE'
        , '011.44.1344.345268'
        , 'SA_REP'
        , 9500
        , .25
        , 145
        , 80
        );

insert into employees values 
        ( 152
        , 'Peter'
        , 'Hall'
        , 'PHALL'
        , '011.44.1344.478968'
        , 'SA_REP'
        , 9000
        , .25
        , 145
        , 80
        );

insert into employees values 
        ( 153
        , 'Christopher'
        , 'Olsen'
        , 'COLSEN'
        , '011.44.1344.498718'
        , 'SA_REP'
        , 8000
        , .2
        , 145
        , 80
        );

insert into employees values 
        ( 154
        , 'Nanette'
        , 'Cambrault'
        , 'NCAMBRAU'
        , '011.44.1344.987668'
        , 'SA_REP'
        , 7500
        , .2
        , 145
        , 80
        );

insert into employees values 
        ( 155
        , 'Oliver'
        , 'Tuvault'
        , 'OTUVAULT'
        , '011.44.1344.486508'
        , 'SA_REP'
        , 7000
        , .15
        , 145
        , 80
        );

insert into employees values 
        ( 156
        , 'Janette'
        , 'King'
        , 'JKING'
        , '011.44.1345.429268'
        , 'SA_REP'
        , 10000
        , .35
        , 146
        , 80
        );

insert into employees values 
        ( 157
        , 'Patrick'
        , 'Sully'
        , 'PSULLY'
        , '011.44.1345.929268'
        , 'SA_REP'
        , 9500
        , .35
        , 146
        , 80
        );

insert into employees values 
        ( 158
        , 'Allan'
        , 'McEwen'
        , 'AMCEWEN'
        , '011.44.1345.829268'
        , 'SA_REP'
        , 9000
        , .35
        , 146
        , 80
        );

insert into employees values 
        ( 159
        , 'Lindsey'
        , 'Smith'
        , 'LSMITH'
        , '011.44.1345.729268'
        , 'SA_REP'
        , 8000
        , .3
        , 146
        , 80
        );

insert into employees values 
        ( 160
        , 'Louise'
        , 'Doran'
        , 'LDORAN'
        , '011.44.1345.629268'
        , 'SA_REP'
        , 7500
        , .3
        , 146
        , 80
        );

insert into employees values 
        ( 161
        , 'Sarath'
        , 'Sewall'
        , 'SSEWALL'
        , '011.44.1345.529268'
        , 'SA_REP'
        , 7000
        , .25
        , 146
        , 80
        );

insert into employees values 
        ( 162
        , 'Clara'
        , 'Vishney'
        , 'CVISHNEY'
        , '011.44.1346.129268'
        , 'SA_REP'
        , 10500
        , .25
        , 147
        , 80
        );

insert into employees values 
        ( 163
        , 'Danielle'
        , 'Greene'
        , 'DGREENE'
        , '011.44.1346.229268'
        , 'SA_REP'
        , 9500
        , .15
        , 147
        , 80
        );

insert into employees values 
        ( 164
        , 'Mattea'
        , 'Marvins'
        , 'MMARVINS'
        , '011.44.1346.329268'
        , 'SA_REP'
        , 7200
        , .10
        , 147
        , 80
        );

insert into employees values 
        ( 165
        , 'David'
        , 'Lee'
        , 'DLEE'
        , '011.44.1346.529268'
        , 'SA_REP'
        , 6800
        , .1
        , 147
        , 80
        );

insert into employees values 
        ( 166
        , 'Sundar'
        , 'Ande'
        , 'SANDE'
        , '011.44.1346.629268'
        , 'SA_REP'
        , 6400
        , .10
        , 147
        , 80
        );

insert into employees values 
        ( 167
        , 'Amit'
        , 'Banda'
        , 'ABANDA'
        , '011.44.1346.729268'
        , 'SA_REP'
        , 6200
        , .10
        , 147
        , 80
        );

insert into employees values 
        ( 168
        , 'Lisa'
        , 'Ozer'
        , 'LOZER'
        , '011.44.1343.929268'
        , 'SA_REP'
        , 11500
        , .25
        , 148
        , 80
        );

insert into employees values 
        ( 169  
        , 'Harrison'
        , 'Bloom'
        , 'HBLOOM'
        , '011.44.1343.829268'
        , 'SA_REP'
        , 10000
        , .20
        , 148
        , 80
        );

insert into employees values 
        ( 170
        , 'Tayler'
        , 'Fox'
        , 'TFOX'
        , '011.44.1343.729268'
        , 'SA_REP'
        , 9600
        , .20
        , 148
        , 80
        );

insert into employees values 
        ( 171
        , 'William'
        , 'Smith'
        , 'WSMITH'
        , '011.44.1343.629268'
        , 'SA_REP'
        , 7400
        , .15
        , 148
        , 80
        );

insert into employees values 
        ( 172
        , 'Elizabeth'
        , 'Bates'
        , 'EBATES'
        , '011.44.1343.529268'
        , 'SA_REP'
        , 7300
        , .15
        , 148
        , 80
        );

insert into employees values 
        ( 173
        , 'Sundita'
        , 'Kumar'
        , 'SKUMAR'
        , '011.44.1343.329268'
        , 'SA_REP'
        , 6100
        , .10
        , 148
        , 80
        );

insert into employees values 
        ( 174
        , 'Ellen'
        , 'Abel'
        , 'EABEL'
        , '011.44.1644.429267'
        , 'SA_REP'
        , 11000
        , .30
        , 149
        , 80
        );

insert into employees values 
        ( 175
        , 'Alyssa'
        , 'Hutton'
        , 'AHUTTON'
        , '011.44.1644.429266'
        , 'SA_REP'
        , 8800
        , .25
        , 149
        , 80
        );

insert into employees values 
        ( 176
        , 'Jonathon'
        , 'Taylor'
        , 'JTAYLOR'
        , '011.44.1644.429265'
        , 'SA_REP'
        , 8600
        , .20
        , 149
        , 80
        );

insert into employees values 
        ( 177
        , 'Jack'
        , 'Livingston'
        , 'JLIVINGS'
        , '011.44.1644.429264'
        , 'SA_REP'
        , 8400
        , .20
        , 149
        , 80
        );

insert into employees values 
        ( 178
        , 'Kimberely'
        , 'Grant'
        , 'KGRANT'
        , '011.44.1644.429263'
        , 'SA_REP'
        , 7000
        , .15
        , 149
        , null
        );

insert into employees values 
        ( 179
        , 'Charles'
        , 'Johnson'
        , 'CJOHNSON'
        , '011.44.1644.429262'
        , 'SA_REP'
        , 6200
        , .10
        , 149
        , 80
        );

insert into employees values 
        ( 180
        , 'Winston'
        , 'Taylor'
        , 'WTAYLOR'
        , '650.507.9876'
        , 'SH_CLERK'
        , 3200
        , null
        , 120
        , 50
        );

insert into employees values 
        ( 181
        , 'Jean'
        , 'Fleaur'
        , 'JFLEAUR'
        , '650.507.9877'
        , 'SH_CLERK'
        , 3100
        , null
        , 120
        , 50
        );

insert into employees values 
        ( 182
        , 'Martha'
        , 'Sullivan'
        , 'MSULLIVA'
        , '650.507.9878'
        , 'SH_CLERK'
        , 2500
        , null
        , 120
        , 50
        );

insert into employees values 
        ( 183
        , 'Girard'
        , 'Geoni'
        , 'GGEONI'
        , '650.507.9879'
        , 'SH_CLERK'
        , 2800
        , null
        , 120
        , 50
        );

insert into employees values 
        ( 184
        , 'Nandita'
        , 'Sarchand'
        , 'NSARCHAN'
        , '650.509.1876'
        , 'SH_CLERK'
        , 4200
        , null
        , 121
        , 50
        );

insert into employees values 
        ( 185
        , 'Alexis'
        , 'Bull'
        , 'ABULL'
        , '650.509.2876'
        , 'SH_CLERK'
        , 4100
        , null
        , 121
        , 50
        );

insert into employees values 
        ( 186
        , 'Julia'
        , 'Dellinger'
        , 'JDELLING'
        , '650.509.3876'
        , 'SH_CLERK'
        , 3400
        , null
        , 121
        , 50
        );

insert into employees values 
        ( 187
        , 'Anthony'
        , 'Cabrio'
        , 'ACABRIO'
        , '650.509.4876'
        , 'SH_CLERK'
        , 3000
        , null
        , 121
        , 50
        );

insert into employees values 
        ( 188
        , 'Kelly'
        , 'Chung'
        , 'KCHUNG'
        , '650.505.1876'
        , 'SH_CLERK'
        , 3800
        , null
        , 122
        , 50
        );

insert into employees values 
        ( 189
        , 'Jennifer'
        , 'Dilly'
        , 'JDILLY'
        , '650.505.2876'
        , 'SH_CLERK'
        , 3600
        , null
        , 122
        , 50
        );

insert into employees values 
        ( 190
        , 'Timothy'
        , 'Gates'
        , 'TGATES'
        , '650.505.3876'
        , 'SH_CLERK'
        , 2900
        , null
        , 122
        , 50
        );

insert into employees values 
        ( 191
        , 'Randall'
        , 'Perkins'
        , 'RPERKINS'
        , '650.505.4876'
        , 'SH_CLERK'
        , 2500
        , null
        , 122
        , 50
        );

insert into employees values 
        ( 192
        , 'Sarah'
        , 'Bell'
        , 'SBELL'
        , '650.501.1876'
        , 'SH_CLERK'
        , 4000
        , null
        , 123
        , 50
        );

insert into employees values 
        ( 193
        , 'Britney'
        , 'Everett'
        , 'BEVERETT'
        , '650.501.2876'
        , 'SH_CLERK'
        , 3900
        , null
        , 123
        , 50
        );

insert into employees values 
        ( 194
        , 'Samuel'
        , 'McCain'
        , 'SMCCAIN'
        , '650.501.3876'
        , 'SH_CLERK'
        , 3200
        , null
        , 123
        , 50
        );

insert into employees values 
        ( 195
        , 'Vance'
        , 'Jones'
        , 'VJONES'
        , '650.501.4876'
        , 'SH_CLERK'
        , 2800
        , null
        , 123
        , 50
        );

insert into employees values 
        ( 196
        , 'Alana'
        , 'Walsh'
        , 'AWALSH'
        , '650.507.9811'
        , 'SH_CLERK'
        , 3100
        , null
        , 124
        , 50
        );

insert into employees values 
        ( 197
        , 'Kevin'
        , 'Feeney'
        , 'KFEENEY'
        , '650.507.9822'
        , 'SH_CLERK'
        , 3000
        , null
        , 124
        , 50
        );

insert into employees values 
        ( 198
        , 'Donald'
        , 'OConnell'
        , 'DOCONNEL'
        , '650.507.9833'
        , 'SH_CLERK'
        , 2600
        , null
        , 124
        , 50
        );

insert into employees values 
        ( 199
        , 'Douglas'
        , 'Grant'
        , 'DGRANT'
        , '650.507.9844'
        , 'SH_CLERK'
        , 2600
        , null
        , 124
        , 50
        );

insert into employees values 
        ( 200
        , 'Jennifer'
        , 'Whalen'
        , 'JWHALEN'
        , '515.123.4444'
        , 'AD_ASST'
        , 4400
        , null
        , 101
        , 10
        );

insert into employees values 
        ( 201
        , 'Michael'
        , 'Hartstein'
        , 'MHARTSTE'
        , '515.123.5555'
        , 'MK_MAN'
        , 13000
        , null
        , 100
        , 20
        );

insert into employees values 
        ( 202
        , 'Pat'
        , 'Fay'
        , 'PFAY'
        , '603.123.6666'
        , 'MK_REP'
        , 6000
        , null
        , 201
        , 20
        );

insert into employees values 
        ( 203
        , 'Susan'
        , 'Mavris'
        , 'SMAVRIS'
        , '515.123.7777'
        , 'HR_REP'
        , 6500
        , null
        , 101
        , 40
        );

insert into employees values 
        ( 204
        , 'Hermann'
        , 'Baer'
        , 'HBAER'
        , '515.123.8888'
        , 'PR_REP'
        , 10000
        , null
        , 101
        , 70
        );

insert into employees values 
        ( 205
        , 'Shelley'
        , 'Higgins'
        , 'SHIGGINS'
        , '515.123.8080'
        , 'AC_MGR'
        , 12000
        , null
        , 101
        , 110
        );

insert into employees values 
        ( 206
        , 'William'
        , 'Gietz'
        , 'WGIETZ'
        , '515.123.8181'
        , 'AC_ACCOUNT'
        , 8300
        , null
        , 205
        , 110
        );
insert into employees values 
        ( 207
        , 'Shelley'
        , 'Higgins'
        , 'SHIGGINS'
        , '515.123.8080'
        , 'AC_MGR'
        , 12000
        , null
        , 101
        , 110
        );

insert into employees values 
        ( 208
        , 'William'
        , 'Gietz'
        , 'WGIETZ'
        , '515.123.8181'
        , 'AC_ACCOUNT'
        , 8300
        , null
        , 205
        , 110
        );
select * from employees;

--Контроль транзакций
--Выберите контроль транзакций, который больше подходит вашей работе. Эта настройка есть в свойствах источника данных. В автоматическим режиме (флажок Auto) вам не надо каждый раз фиксировать транзакцию, а вот в ручном режиме (Manual), очевидно, надо.

-- Найти всех ИТ(IT_PROG) работников с зарплатой выше 12000

select * from employees where salary >5000 and job_id = 'IT_PROG';

-- Найти всех ИТ(IT_PROG) работников с зарплатой выше 5000
select * from employees
where salary > 5000 and job_id = 'IT_PROG';
-- Повысить зарплату работников отдела Human Resources в 5 раз
set sql_safe_updates = 0;
update employees set salary = salary * 5 where job_id = 'HR_REP';

select * from employees
where salary > 5000 and job_id = 'HR_REP';

--Найти работников отдела FI_ACCOUNT с зарплатой ниже 2850.
select * from employees where salary <2850 and job_id ='FI_ACCOUNT';

set sql_safe_updates = 1;

--У руководителя родились близнецы Лаура и Давид, в честь праздника он решил повысить 
--зарплату работников с именами Лаура и Давид в 10 раз.
update employees set salary = salary * 10 where first_name = 'David' or first_name = 'Laura';
--where first_name in ('Laura' or 'David');
select * from employees where first_name = 'David' or first_name = 'Laura';

-- Julia Nayer вышла замуж и поменяла фамилию на King. Поменяйте у  Julia Nayer фамилию на King.
update employees set last_name = King where last_name = 'Nayer' and first_name = 'Julia';
select * from employees where last_name = 'Nayer' and first_name = 'Julia';
-- Julia Nayer вышла замуж и поменяла фамилию на King. Поменяйте у  Julia Nayer фамилию на King.
update employees
set last_name = 'King'
where first_name = 'Julia' and last_name = 'Nayer';

select * from employees
where first_name = 'Julia' and last_name = 'King';

--Всех работников отдела ST_CLERK уволили. Удалите работников ST_CLERK из таблицы.
delete from employees where job_id = 'ST_CLERK';
select * from employees where job_id = 'ST_CLERK';

--Peter Hall перевели в отдел HR_REP и повысили зарплату на 5000. 
--Измените данные для  работника Peter Hall.
update employees
set job_id = 'HR_REP', salary = salary + 5000
where first_name = 'Peter' and last_name = 'Hall';

select * from employees where first_name = 'Peter' and last_name = 'Hall';

--После праздника руководитель протрезвел и уменьшил зарплаты работников с именами 
--Лаура и Давид в 10 раз.
update employees set salary = salary / 10 where first_name = 'David' or first_name = 'Laura';
select * from employees where first_name = 'David' or first_name = 'Laura';

---- Shelley Higgins поменяла свой мейл на SHELLYHIG. 
--Измените данные для работника Shelley Higgins.
update employees set email = 'SHELLYHIG' where first_name = 'Shelley' and last_name = 'Higgins';
select * from employees where first_name = 'Shelley' and last_name = 'Higgins';

-- Julia King развелась и поменяла фамилию обратно на Nayer. И в честь развода руководитель 
--повысил ее зарплату на 2000. Измените данные для работника Julia King.
update employees set last_name = 'Nayer', salary = salary + 2000 where last_name = 'King' and first_name = 'Julia';
select * from employees where last_name = 'King' and first_name = 'Julia';

--проверить дублирующие записи
SELECT count(email),email  FROM employees group by email;