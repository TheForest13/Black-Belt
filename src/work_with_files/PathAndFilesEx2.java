package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt"); // src/work_with_files/
        Path directoryPath = Paths.get("/home/theforest/Рабочий стол/Java/Black Belt" +
                "/Folder");

        Path directoryPathZ = Paths.get("/home/theforest/Рабочий стол/Java/Black Belt" +
                "/Folder/Folder");


//        Files.copy(filePath,directoryPath.resolve(filePath)
//        , StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath,directoryPath.resolve("test16.txt"));

//        Files.copy(directoryPathZ, directoryPath.resolve("Z"));
//        System.out.println("done!");

//        Files.move(filePath, directoryPath.resolve("test15.txt"));

//        Files.move(Paths.get("/home/theforest/Рабочий стол/Java/Black Belt/src/work_with_files/test10.txt"), (Paths.get("/home/theforest/Рабочий стол/Java/Black Belt/src/work_with_files/test111.txt")));

//        Files.delete(Paths.get("/home/theforest/Рабочий стол/Java/Black Belt/src/work_with_files/test5.txt"));

//        Files.delete(Paths.get("/home/theforest/Рабочий стол/Java/Black Belt/Folder/FolderZ"));




    }
}
