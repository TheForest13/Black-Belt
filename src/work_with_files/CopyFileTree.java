package work_with_files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("/home/theforest/Рабочий стол/" +
                "Java/Black Belt/Folder");
        Path destination = Paths.get("/home/theforest/Рабочий стол/" +
                "Java/Black Belt/CopyHere");
        Files.walkFileTree(source, new MyFileVisitor2(source, destination));
        System.out.println("done!");
    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {
    Path sours;
    Path destination;

    public MyFileVisitor2(Path sours, Path destination) {
        this.sours = sours;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(sours.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(sours.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}