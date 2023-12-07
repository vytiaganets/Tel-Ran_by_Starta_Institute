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

