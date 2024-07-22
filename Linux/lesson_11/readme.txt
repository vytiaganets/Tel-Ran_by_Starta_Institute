Напишите скрипт, который выполнит: 
1 Создаст файл logs.log 
2 Дозапишет в него данные из файла services (только строки со словом snmp) 
3 Перенесет файл по пути /logs/lan 
4 Выведет на экран список процессов ssh 
*файл services находится по пути /etc 
*файл logs.log изначально должен располагаться в папке /home 

mkdir -p /home /logs/lan 
cat /etc/services | grep snmp >> /root/logs.log 
mv /root/logs.log /logs/lan/ 
ps -ef | grep ssh 