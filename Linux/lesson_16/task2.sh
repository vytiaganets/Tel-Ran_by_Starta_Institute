# Напишите скрипт, который выполнит:
# 1 Создаст пустой файл file0.txt в вашей рабочей папке на сервере
# 2 Создаст 4 папки с названием DATE_01 и далее по пути /tmp/user/ВАША_ГРУППА/ВАШЕ_ИМЯ
# 3 Перенесет в папку DATE_01 пустой файл, созданный ранее
# 4 В папку DATE_02 поместит файл 1.txt с выводом файла /var/spool/mail/ec2-user (последние 18 строчек, которые содержат вывод строки по слову bash:)
# 5 В папку DATE_03 поместит файл  2.txt с выводом из команды free (сделать вывод в человеческих единицах, а в словах buff/cache нужно убрать buff/)
# 6 В папку DATE_04 поместить 10 пустых текстовых файлов с названием от test00 до test09
# 7 Заархивировать папку со своим именем (ваша рабочая папка на сервере).
# 8 Просмотреть содержимое архива

#!/bin/bash
set -e
touch /opt/171023_morning/andrii/file0.txt
        for i in {01..04}
        mkdir -p /opt/171023_morning/andrii/DATE_$i
        done
mv /opt/171023_morning/andrii/file0.txt /opt/101723_morni$
cat /var/spool/mail/ec2-user | grep bash: | tail -18 > /o$
free -h | sed s/buff'\'/\// > /opt/171023_morning/andrii/$
        for o in {00..09}; do
        touch /opt/171023_morning/andrii/DATE_04/test$o
        done

#!/bin/bash
set -e
touch /opt/171023_morning/andrii/file0.txt
        for i in {01..04}
        do
        mkdir -p /opt/171023_morning/andrii/DATE_$i
        done
mv /opt/171023_morning/chumak/file0.txt /opt/171023_morning/chumak/DATE_01
cat /var/spool/mail/ec2-user | grep bash: | tail -18 > /opt/171023_morning/chumak/DATE_02/1.txt
free -h | sed s/buff'\'/\// > /opt/171023_morning/andrii/DATE_03/2.txt   
        for o in {00..09}; do
        touch /opt/171023_morning/andrii/DATE_04/test$o
        done
mkdir -p /tmp/{{DATE_{01..04}}
