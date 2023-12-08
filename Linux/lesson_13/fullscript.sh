#!/bin/bash 
echo "Hello Student!"
echo -n "Enter your name: "
read name
echo "Welcome to terminal is $name"
 
mkdir -p /tmp/test /opt/mydate
date +'%T' > /tmp/test/mydate.txt
echo "Сохраняем данные"
 
        for i in {1..10}
        do
        echo $i
        sleep 0.5
        done
 
echo "Data saved. Continue work"
df -h >> /tmp/test/mydate.txt
cp /tmp/test/mydate.txt /opt/mydate/newmydate.txt
 
        for i in {1..5}
        do
        echo $i
        sleep 1
        done
 
echo "Well done Boss"

# Сделать скрипт fullscript.sh , который покажет: 

# 1 выведет строчку со словами: 

# Hello Student! 

# 2 попросит ввести Ваше имя 

# 3 выведет строчку: 

# “Welcome to terminal $name" 

# 4 создаст папку test в каталоге tmp 

# 5 создаст файл под названием mydate.txt в папке /tmp/test 

# 6 запишет в новосозданный файл mydate.txt  текущее время (не просто дату) 

# 7 выведет на экран надпись “Сохраняем данные” и начнет отсчет до 10 с интервалом в полсекунды. 

# 8 выведет на экран “Data saved. continue work” 

# 9 дозапишет в файл mydate.txt все сведения о состоянии нашего диска в человеческом виде. 

# 10 скопирует файл mydate.txt в новую подпапку mydate в папке /opt/  с переименованием файла в newmydate.txt 

# 11 снова сделать интервал ожидания, но уже с отсчетом в пять раз по одной секунде и вывести на экран фразу “Well done Boss” 

# * сделать файл исполняемым из любого места в системе по вашему имени. 