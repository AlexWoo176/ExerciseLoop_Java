import java.util.Scanner;

public class DisplayFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int t1 = 0;
        int t2 = 1;
        System.out.print("Enter number Display Fibonacci: ");
        int number = scanner.nextInt();

        while (i <= number) {
            System.out.println("Series Fibonacci: " + t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
    }
}
