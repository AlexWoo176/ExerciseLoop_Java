import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;
        int reverse = 0;

        System.out.print("Enter the number: ");
        number = console.nextInt();

        while (number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        System.out.println("Reverse number is: "  + reverse);
    }
}
