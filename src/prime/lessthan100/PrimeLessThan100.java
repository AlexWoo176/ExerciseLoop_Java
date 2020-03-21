package prime.lessthan100;

import java.util.Scanner;

public class PrimeLessThan100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number low: ");
        int numberLow = scanner.nextInt();
        System.out.println("Enter Number High: ");
        int numberHigh = scanner.nextInt();

        while (numberLow < numberHigh) {
            boolean flag = false;

            for (int i = 2; i <= numberLow/2; i++) {
                if (numberLow % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(numberLow + "  ");

            }
            numberLow ++;
        }
    }
}
