package de.telran.home20240321;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class SimpleHome {
    public static void main(String[] args) {
        System.out.println("==================Task 1==================");
        //1) Реализуйте механизм сохранения и чтения объекта POJO класса Client в файл.
        //Вот приблизительно наполнение класса Client.
        //    private Long id;
        //    private String status;
        //    private Long taxCode;
        //    private String firstName;
        //    private String lastName;
        //    private String email;
        //    private String address;
        //    private String phone;
        //1) Implement a mechanism for saving and reading a POJO object of the Client class into a file.
        //This is approximately the content of the Client class.
        Client client1 = new Client(23123L, "Active", 67577L, "Pop", "Ger", "das@gmail.com", "Antonplatz", "+13523546");
        Client client2 = new Client(23213L, "Active", 57474L, "Her", "Per", "die@gmail.com", "Potsdamer Platz", "+123435345");
        Client client3 = new Client(54255L, "Active", 25255L, "Bob", "Lop", "der@gmail.com", "Alexanderplatz", "+1453425436");
        ArrayList<Client> clientList = new ArrayList<> (Arrays.asList (client1, client2, client3));
        try (BufferedWriter fileWriter = new BufferedWriter(
                new FileWriter("src/main/java/de/telran/home20240321/task1.csv"))) {
            fileWriter.write("Id, Status, Tax Code, First Name, Last Name, Email, Address, Phone");
            fileWriter.newLine();
            for (Client client : clientList) {
                fileWriter.write(String.valueOf(client.getId()));
                fileWriter.write(",");
                fileWriter.write(client.getStatus());
                fileWriter.write(",");
                fileWriter.write(String.valueOf(client.getTaxCode()));
                fileWriter.write(",");
                fileWriter.write(client.getFirstName());
                fileWriter.write(",");
                fileWriter.write(client.getLastName());
                fileWriter.write(",");
                fileWriter.write(client.getEmail());
                fileWriter.write(",");
                fileWriter.write(client.getAddress());
                fileWriter.write(",");
                fileWriter.write(client.getPhone());
                fileWriter.write(",");
                fileWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("==================Task 2==================");
        //2) ** Научите данный механизм сохранять также список таких объектов в файл, и читать эти объекты из файла в List.
        //2) ** Teach this mechanism to also save a list of such objects to a file, and read these objects from the file into a List.
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/de/telran/home20240321/task1.csv"))) {

            String line;
            int count = 0;
            ArrayList<Client> clientList1 = new ArrayList<>();
            String[] fields;

            while (true) {
                line = bufferedReader.readLine();

                if (line == null) {
                    break;
                }
                count = count + 1;
                if (count > 1) {
                    fields = line.split(" *, *");

                    clientList1.add(new Client(
                            Long.parseLong(fields[0].trim()),
                            fields[1],
                            Long.parseLong(fields[2].trim()),
                            fields[3],
                            fields[4],
                            fields[5],
                            fields[6],
                            fields[7]));
                }
            }
            System.out.println(clientList1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //==================Task 1==================
        //task1.csv
        //Id, Status, Tax Code, First Name, Last Name, Email, Address, Phone
        //23123,Active,67577,Pop,Ger,das@gmail.com,Antonplatz,+13523546,
        //23213,Active,57474,Her,Per,die@gmail.com,Potsdamer Platz,+123435345,
        //54255,Active,25255,Bob,Lop,der@gmail.com,Alexanderplatz,+1453425436,
        //==================Task 2==================
        //[Client{id=23123, status='Active', taxCode=67577, firstName='Pop', lastName='Ger', email='das@gmail.com', address='Antonplatz', phone='+13523546'}, Client{id=23213, status='Active', taxCode=57474, firstName='Her', lastName='Per', email='die@gmail.com', address='Potsdamer Platz', phone='+123435345'}, Client{id=54255, status='Active', taxCode=25255, firstName='Bob', lastName='Lop', email='der@gmail.com', address='Alexanderplatz', phone='+1453425436'}]
    }
}