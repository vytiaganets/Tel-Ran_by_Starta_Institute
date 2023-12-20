# Напишите скрипт, который выполнит:
# 1 Создаст две папки 1 и 2 по полному пути /tmp/test/ВАШЕ_ИМЯ
# 2 В папку 1 поместить файл history.txt и в него записать вывод из истории команд (только три строки нижние из истории команд)
# 3 В папку 2 поместить файл logs.txt и в него дозаписать вывод из файла /etc/issue (заменив слово on на to)
# 4  Переместить папки, созданные в пункте 1 в /home/testfolder/123
#  *необходимо уложиться в 246 символов в файле сценария
# sed s/5/o/

#!/bin/bash
mkdir -p /tmp/test/andrii/1 /tmp/test/andrii/2 /home/testfolder/123
history | tail -3 > /tmp/test/andrii/1/history.txt
cat /etc/issue | sed 's/on/to/' >> /tmp/test/andrii/2/logs.txt
mv /tmp/test/andrii/* /home/testfolder/123
