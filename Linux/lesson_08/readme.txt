ssh ec2-user@linux.telran-edu.de
pwd
ls -la
df -h
whoami
cd /opt/171023_morning
ls -1 // вывод папок в столбик
pwd ///opt/171023_morning полный путь где стоит курсор
cat /var/spool/mail/ec2-user | wc -l //1120514 файл с ошибками
ls -h /var/spool/mail/
date
top // процессы в системе Ctr+C или q выход
ps
ps -ef
htop // графические процессы
brew install htop // not install
curl -O https://raw.githubusercontent.com/Homebrew/install/master/install.sh 
chmod +x install.sh 
bash install.sh 
Enter
brew install htop // not working
env
export ... /opt/homebrew/bin
brew install htop // working
htop //Ctrl + C

ps -ef | grep ssh // demon: root       554     1  0 сер25 ?     00:00:35 /usr/sbin/sshd -D
ps -ef | grep Adobe


$ chmod опции права /путь/к/файлу 
Сначала рассмотрим какими бывают права доступа linux и как они устанавливаются. Есть три основных вида прав: 
r - чтение; 
w - запись; 
x - выполнение; 
Также есть три категории пользователей, для которых вы можете установить эти права на файл linux: 
u - владелец файла; 
g - группа файла; 
o - все остальные пользователи; 


https://bellard.org/jslinux/vm.html?url=alpine-x86.cfg&mem=192 