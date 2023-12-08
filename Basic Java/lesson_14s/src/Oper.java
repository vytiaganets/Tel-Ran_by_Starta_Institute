public class Oper {
    public static void main(String[] args) {
        int num1;
        int num;
        Oper arith = new Oper();
        Oper oper1 = new Oper('*');

        System.out.println("Our result :"+oper1.calculate(num,num1));
        oper1.setType('+');
        System.out.println("Our result :"+oper1.calculate(num,num1));


        System.out.println("Our result 111 :"+arith.calculate(num,num1));
        arith.setType('-');
        System.out.println("Our result 111 :"+arith.calculate(num,num1));
        arith.printAdd(num,num1);
        System.out.println("Summa iz methoda "+ arith.makeAdd(num,num1));
    }

    private char type;

    public Oper(char type) {
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public Oper() {

    }

    public int calculate (int num, int num1 ){
        if (type=='*'){ return  makeMult(num,num1);}
        else if (type=='+'){ return  makeAdd(num,num1);}
        else if (type=='-'){ return  makeDiff(num,num1);}
        else if (type=='/'){ return  makeDiv(num,num1);}
        else {return 0;}
    }

    public static int makeAdd(int num, int num1)
    {
        return num+num1;
    }
    public static void printAdd(int num, int num1 )
    {
        System.out.println("Summa : "+ num+" + " + num1+" = "+(num+num1));
    }
    public static int makeDiff(int num,int num1)
    {
        return num-num1;
    }
    public static void printDiff(int num, int num1 )
    {
        System.out.println("Difference : "+ num+" - " + num1+" = "+(num-num1));
    }
    public static int makeMult(int num,int num1)
    {
        return num*num1;
    }
    public static void printMult(int num, int num1 )
    {
        System.out.println("Multiplication: "+ num+" * " + num1+" = "+(num*num1));
    }
    public static int makeDiv(int num,int num1)
    {
        return num/num1;
    }
    public static void printDiv(int num, int num1 )
    {
        System.out.println("Division: "+ num+" / " + num1+" = "+(num/num1));
    }

}


