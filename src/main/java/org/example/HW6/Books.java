package HW6;

import java.util.*;

public class Books {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
        books.add("Book4");
        Map<String, String> map = new HashMap<>();

        for (String i : books) {
            map.put(i, String.valueOf(books));
            System.out.println(i);
        }
    }
}
//Як зробити з цього функціоналу метод, який можна викликати у main
