package work_with_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
    public static void main(String[] args) {
        try(
                FileInputStream inputStream = new FileInputStream("src/work_with_files/ukino.jpg");
                FileOutputStream outputStream = new FileOutputStream("src/work_with_files/ukinoCopy.jpg");
                ) {

            int i;
            while ((i=inputStream.read())!= -1){
                outputStream.write(i);
            }
            System.out.println("done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
