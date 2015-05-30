import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the fibonacci sequence index to be computed: ");
        int n = in.nextInt();

        System.out.println(fib(n));
    }

    private static int fib(int n) {
        int a, b;
        a = b = 1;

        for (int i = 0; i < n - 2; i++) {
            int aux = b;
            b = a + b;
            a = aux;
        }

        return b;
    }
}
