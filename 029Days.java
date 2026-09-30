import java.util.Scanner;

public class Day29 {
    public static void main(String [] args) {
        Scanner hai = new Scanner(System.in);

        int a = hai.nextInt();
        int b = hai.nextInt();

        System.out.printf("%d > %d : %b %n", a, b, a > b);
        System.out.printf("%d < %d : %b %n", a, b, a < b);
    }
}
