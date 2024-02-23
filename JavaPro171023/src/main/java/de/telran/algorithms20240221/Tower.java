package de.telran.algorithms20240221;

public class Tower {
    public static void main(String[] args) {
        int num = 3;
        towerOfHanoi(num, 'A', 'C', 'B');
    }
    public static void towerOfHanoi(int num, char from, char to, char  help){
        if(num == 1){
            System.out.println("Take disk fom tower  " + from + " to tower " + to);
            return;
        }
        towerOfHanoi(num-1,from,help,to);
        System.out.println("Take disk 1 fom tower  " + from + " to tower " + to);
        towerOfHanoi(num-1,help,to,from);
    }
    //Take disk fom tower  A to tower C
    //Take disk 1 fom tower  A to tower B
    //Take disk fom tower  C to tower B
    //Take disk 1 fom tower  A to tower C
    //Take disk fom tower  B to tower A
    //Take disk 1 fom tower  B to tower C
    //Take disk fom tower  A to tower C
}
