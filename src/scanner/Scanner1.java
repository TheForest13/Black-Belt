package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число");
//        int i = scanner.nextInt();
//        System.out.println("Введенное число " + i);
//        System.out.println("Напишите два числа");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println("Частное = " + x/y);
//        System.out.println("Остаток = " + x%y);

//        System.out.println("Напишите пару слов");
//        String s = scanner.nextLine();
//        System.out.println("Вы написали: " + s);

//        System.out.println("Напишите пару слов");
//        String s = scanner.next();
//        System.out.println("Вы написали: " + s);
//
//        System.out.println("Введите дробное число");
//        double d = scanner.nextDouble();
//        System.out.println("Введенное число " + d);

        Scanner scanner = new Scanner("Привет мой друг!\nКак поживаешь?" +
                "\nЧто хорошего?");
//        String s = scanner.nextLine();
//        System.out.println(s);
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());

//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }

        System.out.println(scanner.next().charAt(3));


    }
}
