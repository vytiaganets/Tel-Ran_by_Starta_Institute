public class Money {
    //    Тест: https://github.com/tel-ran-de/17102023-m-java-base/blob/main/%D0%A2%D0%B5%D1%81%D1%82%201.docx
//
//            *Дополнительная практика(не обязательное)
//    Создайте метод, который будет считать сколько денег получает работник в неделю. Метод должен принимать на входе два аргумента (зарплата в час, кол-во проработанных часов).
//
//    Каждый час после 40 считается за полтора.
//    Работник не может работать больше, чем 60 часов в неделю.
//    Работник не может получать меньше 8 долларов в час.

    public class FileMethod {
        private static void salary(double salary, double hours) {
            if (hours > 60) {
                hours = 60;
            }
            if (hours > 40) {
                hours = 40 + (hours - 40) * 1.5;
            }

            if (salary < 8) {
                salary = 8;
            }
            PrintStream ps = null;
            try {
                ps = new PrintStream("salary.txt", "UTF-8");
                ps.print(String.format("salary: %.2f hours: % .0f  result: %.2f", salary, hours, (salary * hours)));
            } catch (Exception e) {
                throw new RuntimeException("File Error");
            }finally {
                ps.close();
            }

        }


        public static void main(String[] args) {

            salary(12, 10);
            salary(4, 24);
            salary(42, 75);

        }
    }
}
