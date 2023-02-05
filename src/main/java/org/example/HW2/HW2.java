package HW2;

import java.util.Scanner;

class HW2 {

     static void sumOfTwo (int num) {
         System.out.println((num % 10) + (num / 10) % 10 + (num / 100));
    }
     static void sumOfTwo ( String word1, String word2 ) {
        System.out.println((word1+word2).length());
    }
    static void sumOfTwo () {
        Scanner a = new Scanner(System.in);
        System.out.println("Input Number");
        int x = a.nextInt();
         if (x > 0) {
             System.out.printf("This value is greater than zero");
         } else if (x < 0) {
             System.out.printf("This value is less than zero");
         }
         else System.out.printf("This value is zero");
//        System.out.println("You have insert "+x);
    }

    public static void main (String[] args) {
        sumOfTwo(123);
        sumOfTwo("Hello", "World");
        sumOfTwo();

    }
}
