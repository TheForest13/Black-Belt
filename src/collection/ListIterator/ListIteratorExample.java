package collection.ListIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//проверяем строки на полидромы
public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();

        for(char ch: s.toCharArray()){
            list.add(ch);
        }

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPolindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if(iterator.next() != reverseIterator.previous()) {
                isPolindrome = false;
                break;
            }
        }
        if(isPolindrome)
            System.out.println("Polindrome");
        else
            System.out.println("NOT Polindrom");
    }
}
