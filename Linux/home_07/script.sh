#1 Скрипт должен создавать по 10 файлов с порядковым номером и датой создания. 120.04.23 , 220.04.23 , 320.04.23 .. 1020.04.23
# 2 Создайте в планировщике новое задание, которое должно будет запускать Ваш скрипт каждые 15 минут.

# Что пригодится:
# date +"%d.%m.%y"
# touch
# export EDITOR=nano
# crontab -l
# crontab -e
# Crontab.guru

# Если удобно, то вот однострочник, создающий простейший скрипт в /tmp , который надо будет редактировать дальше:
# echo -e #!/bin/bash\n date\n echo “it works!“ > /tmp/script.sh

History:
1. cd /opt/171023_morning/andrii
2. nano script.sh



#!/bin/bash

set -e

 	for i in {1..10}
 	do
	touch $i$(date +"%d.%m.%y")
	done




3. chmod u+x script.sh
4. crontab -e



* /15 * * * * /opt/171023_morning/andrii/script.sh