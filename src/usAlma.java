import java.util.Scanner;

public class usAlma {
    static int power(int a, int b) {
        int result = 1;
        if (a != 0 && b >= 0) {
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
            return result;
        } else {
            System.out.println("Taban değeri 0'dan farklı ve üs pozitif olmalı.");
        }
        return 0;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner data = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        a = data.nextInt();
        System.out.print("Üs değeri giriniz: ");
        b = data.nextInt();
        System.out.println("sonuç: " + power(a, b));
    }
}
