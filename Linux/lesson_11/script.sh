#!/bin/bash
 
mkdir -p /home /logs/lan
cat /etc/services | grep snmp >> /root/logs.log
mv /root/logs.log /logs/lan/
ps -ef | grep ssh