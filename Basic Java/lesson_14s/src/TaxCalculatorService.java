public class TaxCalculatorService {

    private int taxClass1;

    private int taxClass2;

    private int taxClass3;


    // Подсчет налога для каждого класса

    public double getMyTax(double salary, int myClass) {

        if (myClass == 1) { // если первый налоговый класс берем налог taxClass1

            return salary * taxClass1 / 100;

        } else if (myClass == 2) {

            return salary * taxClass2 / 100;

        }

        return salary * taxClass3 / 100;

    }


    // Первый конструктор генерирует сервис с 3 параметрами (для каждого налогового класса)

    public TaxCalculatorService(int taxClass1, int taxClass2, int taxClass3) {

        this.taxClass1 = taxClass1;

        this.taxClass2 = taxClass2;

        this.taxClass3 = taxClass3;

    }

// Второй конструктор генерирует сервис с 2 параметрами (используя один по умолчанию)

    public TaxCalculatorService(int taxClass1, int taxClass2) {

        this(taxClass1, taxClass2, 25);

    }


    public static void main(String[] args) {

        var taxServiceItaly = new TaxCalculatorService(

                13, 20, 35

        ); // один сервис для условной Италии с параметрами 13% налога для первого налогого класса

        var taxServiceGreece = new TaxCalculatorService(

                7, 14

        ); // второй  сервис для условной Греции с параметрами 7% налога для первого налогого класса

        System.out.println("Tax 1, salary 20000 Italy " + taxServiceItaly.getMyTax(20000, 1));

        System.out.println("Tax 1, salary 20000 Greece " + taxServiceGreece.getMyTax(20000, 1));

    }

}