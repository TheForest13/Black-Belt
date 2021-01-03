package work_with_files.programmer1;

import java.io.*;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Nissan Tiida", "white");
        Employee employee = new Employee("Maria", "Ivanova", "IT",
                /*28,*/ 500, car);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                        new FileOutputStream("src/work_with_files/employees2.bin")
                )) {
            outputStream.writeObject(employee);
            System.out.println("done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
