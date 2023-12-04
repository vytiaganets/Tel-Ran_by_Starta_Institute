#!/bin/bash
mkdir -p /opt/mydir/andrii
touch /opt/mydir/test.txt
echo "Start" >> /opt/mydir/andrii/test.txt
date '+%T' >> /opt/mydir/andrii/test.txt
for runrun in {1..5}
do
touch /opt/mydir/andrii/$runrun
done
cp -r /opt/mydir/andrii /tmp
rm -r /opt/mydir/andrii
echo "done"

# chmod u+x work.sh
# ls -l

# Напишите скрипт, который выполнит: 
# 1. Создаст папку по пути /opt/mydir/ВАШЕ_ИМЯ 
# 2. Создаст текстовик с именем test.txt (по пути, созданом выше) 
# 3. ДОЗАПИШЕТ в него слово Start 
# 4. Дозапишет время (только время) 
# 5. Создаст 5 файлов с названием от 1 до 5 в папке, созданной выше 
# 6. Скопирует папку с вашим именем в новый путь /tmp/ 
# 7. Удалит папку с вашим именем из старого места 
# 8. Выведет на экран DONE 
  
# *сделать скрипт программой по умолчанию, чтобы она запускалась по вашему имени 

