#!/bin/bash

os=$(cat /etc/os-release | grep PRETTY)
echo "Your version Linux: $os" > /opt/171023_morning/andrii/tesTing.txt

        for i  in {1..3}
        do
        mkdir -p /opt/171023_morning/andrii/dir$i
        done
ps -ef | grep ssh >> /opt/171023_morning/andrii/dir1/ps.ef
echo "text" > /opt/171023_morning/andrii/dir2/ech.o
cat /proc/cpuinfo | grep bugs > /opt/171023_morning/andrii/dir3/bu.gs
mkdir -p /tmp/1412/andrii/
mv /opt/171023_morning/andrii/tesTing.txt /tmp/1412/andrii/
echo "done"