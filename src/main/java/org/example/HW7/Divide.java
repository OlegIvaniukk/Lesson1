package HW7;

public class Divide {
    int[] array = new int[]{5, 11, 7, 20};

    void method(int n) {
        try {
            for (int i = 0; i < array.length; i++) {
                double v = array[i] / n;
                System.out.println(v);
            }
        } catch (ArithmeticException exception) {
            System.out.println("Exception was caught");
        }
    }

    public static void main(String[] args) {
        Divide method = new Divide();
        method.method(0);
    }
}
