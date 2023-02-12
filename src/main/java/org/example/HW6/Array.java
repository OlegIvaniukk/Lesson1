package HW6;

import java.util.Arrays;

public class Array {
    static int[] array = {5, 11, 7, 20};

    void minValue() {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                double v = array[j] - array[i];
                System.out.println(v);
            }
        }
    }

    public static void main(String[] args) {
        Array array1 = new Array();
        array1.minValue();
    }
}
//НЕ ЗМІГ ЗНЯЙТИ НАЙМЕНШУ РІЗНИЦЮ ЧИСЕЛ, ПОТРІБНО РОЗГЛЯНУТИ