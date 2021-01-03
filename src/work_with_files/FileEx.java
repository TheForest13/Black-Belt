package work_with_files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("src/work_with_files/test2.txt");
        File folder = new File("/home/theforest/Рабочий стол/Java/Black Belt/Folder");
        File file2 = new File("/home/theforest/Рабочий стол/Java/Black Belt/Folder/test20.txt");
        File folder2 = new File("/home/theforest/Рабочий стол/Java/Black Belt/Folder2");
        File fileX = new File("src/work_with_files/test10.txt");

        System.out.println("file.getAbsolutePath() " + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath() " + folder.getAbsolutePath());
        System.out.println("-----------------------------------------------------------");


        System.out.println("file.isAbsolute() " + file.isAbsolute());
        System.out.println("folder.isAbsolute() " + folder.isAbsolute());
        System.out.println("-----------------------------------------------------------");

        System.out.println("file.isDirectory() " + file.isDirectory());
        System.out.println("folder.isDirectory() " + folder.isDirectory());
        System.out.println("-----------------------------------------------------------");

        System.out.println("file.exists() " + file.exists());
        System.out.println("folder.exists() " + folder.exists());
        System.out.println("file2.exists() " + file2.exists());
        System.out.println("folder2.exists() " + folder2.exists());
        System.out.println("-----------------------------------------------------------");

        System.out.println("file2.createNewFile() " + file2.createNewFile());
        System.out.println("folder2.mkdir() " + folder2.mkdir());
        System.out.println("file2.createNewFile() " + file2.createNewFile());
        System.out.println("-----------------------------------------------------------");

        System.out.println("file2.length() " + file2.length());
        System.out.println("folder.length() " + folder.length());
        System.out.println("-----------------------------------------------------------");

        System.out.println("folder.delete() " + folder.delete());
        System.out.println("folder2.delete() " + folder2.delete());
        System.out.println("file2.delete() " + file2.delete());
        System.out.println("-----------------------------------------------------------");

        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("-----------------------------------------------------------");

        System.out.println("fileX.isHidden() " + fileX.isHidden());
        System.out.println("-----------------------------------------------------------");
        System.out.println("fileX.canRead() " + fileX.canRead());
        System.out.println("-----------------------------------------------------------");
        System.out.println("fileX.canWrite() " + fileX.canWrite());
        System.out.println("-----------------------------------------------------------");
        System.out.println("fileX.canExecute() " + fileX.canExecute());
        System.out.println("-----------------------------------------------------------");
    }
}
