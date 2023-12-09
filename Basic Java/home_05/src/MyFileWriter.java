import java.io.FileWriter;

public class MyFileWriter {

    public static <IOException extends Throwable> void main(String[] args) {
        String s = "Eyewitnesses said it fell onto adjacent homes, " +
                "which is where most of the victims are thought " +
                "to have been. It is not known how many people are still under the debris.";
        String s1 = "!!!";
        //try (FileWriter writer = new FileWriter("E:\\_2628M\\222.txt")) {
        try (FileWriter wr = new FileWriter("myfile.txt")){
        //try {
            //сам может создать файл в корне
            FileWriter wri = new FileWriter("mytest.txt", true);
            //FileWriter writer = new FileWriter("333.txt", true);// - присоединяем к тексту
            //MyFileWriter writer1 = new MyFileWriter();
            System.out.println(s);
            wr.write(s);
            //writer.write(s);
            for (int i = 0; i < s.length(); i++) {
                //writer.write(s.charAt(i));// запишем каждый символ в наш файл//принимает int как так
                //writer.write(s);
                //writer.write(s1); //перепишет
            }
            System.out.println("DONE");
            //} catch (IOException e) {
        } catch (
                Exception e) {
            throw new RuntimeException(e);
        }
        //без закрытия не запишется
    }

}
