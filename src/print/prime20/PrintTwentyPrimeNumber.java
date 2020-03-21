package print.prime20;

import java.util.Scanner;

public class PrintTwentyPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Prime Display: ");
        int number = scanner.nextInt();
        int count = 0;

        for (int i = 2; i > 0 ; i++) {
            boolean prime = true;

            for (int j = 2; j < i; j++) {
                if ( i % j == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.print(i + " ");
                count += 1;
            }
            if (count == number) {
                break;
            }
        }
    }
}
