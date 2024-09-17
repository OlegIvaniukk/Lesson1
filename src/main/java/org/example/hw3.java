public class hw3 {

        static void longestWord(String a, String b, String c) {
            if (a.length() > b.length() && a.length() > c.length()) {
                System.out.println(a);
            } else if (b.length() > a.length() && b.length() > c.length()) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }

        }

        static void tree1() {
            int p = 0;
            String str = "";

            while(p < 5) {
                str = str + "*";
                ++p;
                System.out.println(str);
            }

            for(int i = 1; i <= 5; ++i) {
                int j;
                for(j = 5; j > i; --j) {
                    System.out.print("*");
                }

                for(j = 1; j < 2 * i; ++j) {
                    System.out.print(" ");
                }

                System.out.println();
            }

        }

        static void tree2() {
            for(int i = 1; i < 6; ++i) {
                int j;
                for(j = 6; j > i; --j) {
                    System.out.print("*");
                }

                System.out.println();

                for(j = 0; j < i; ++j) {
                    System.out.print(" ");
                }
            }

        }

        static void tree3() {
            for(int i = 0; i < 5; ++i) {
                int j;
                for(j = 5; j > i; --j) {
                    System.out.print(" ");
                }

                for(j = 0; j <= i; ++j) {
                    System.out.print("*");
                }

                System.out.println();
            }

        }

        public static void main(String[] args) {
            longestWord("abc", "abcd", "abcde");
            tree1();
            tree2();
            tree3();
        }
    }

