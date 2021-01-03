package work_with_files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
//        Files.createFile(filePath);
//        String dialog = "-Привет\n-Privet\n-Как дела?\n-Xorosho! Kak u tebya?\n" +
//                "-Тоже хорошо";
//        Files.write(filePath, dialog.getBytes());

        List<String> list = Files.readAllLines(filePath);

        for(String s: list) {
            System.out.println(s);
        }

    }
}