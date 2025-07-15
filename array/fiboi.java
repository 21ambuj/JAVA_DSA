import java.util.Scanner;

public class fiboi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        if (n <= 0) {
            System.out.println("Enter a positive number");
            return;
        }
        if (n == 1) {
            System.out.print(a);
            return;
        }

        // Print first two Fibonacci numbers
        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
