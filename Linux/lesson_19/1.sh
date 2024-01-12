#!/bin/bash
set -e 
mkdir -p /opt/home/123/trigger /tmp/drive 
for i in {0..9} 
do 
	
touch /tmp/drive/$i 
done
mv /tmp/drive /opt/home/123/trigger/nodrive 
echo "andrii" >> /opt/home/123/trigger/nodrive/0 
ps -f >> /opt/home/123/trigger/nodrive/3 
cat /root/readme.txt >> /opt/home/123/trigger/nodrive/5
ls -la /env >> /opt/home/123/trigger/7
