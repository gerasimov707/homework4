package compass;

public class Main {

    public static void main(String[] args) {
        // задание 1
        int a = 1;
        while (a <= 10) {
            System.out.print(a++);

        }
        System.out.print("\n");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i);

        }
        // задание 2
        int b = 5;
        System.out.print("\n");
        while (b <= 31) {
            System.out.print(" segodny pyatnica " + b + " chislo, nado podgotovit otchet ");
            System.out.print("\n");
            b += 7;
        }
        // задание 3

        int c = 0;
        for (c = 0; c <= 2100; c = c + 79){
            if (c > 1850) {
                System.out.print(c + " ");
            }
            }
        System.out.print("\n");
        int c1 = 0;
        for (c1 = 0; c1 <= 2100; c1 =79+c1){
            System.out.print(c1+ " ");
        }
        }
    }














