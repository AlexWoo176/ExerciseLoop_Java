import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter any positive integer: ");
        num = sc.nextInt();
        System.out.println("Multiplication Table of: " + num);
        while (num < 10) {
            for (int i = 1; i < 10; ++i) {
                System.out.printf("%d * %d = %d \n", num, i, num * i);
            }
            num ++;
        }
    }
}
