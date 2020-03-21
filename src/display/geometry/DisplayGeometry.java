package display.geometry;

import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at bottom-left)");
        System.out.println("3. Print the square triangle (The corner is square at top-left)");
        System.out.println("4. Print isosceles triangle");
        System.out.println("5. Print Inverted full pyramid");
        System.out.println("6. Print to print pyramid");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        while (choice != 0) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Print the rectangle");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < 20; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 2:
                    System.out.println("2. Print the square triangle (The corner is square at bottom-left)");
                    for (int i = 0; i < 10; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 3:
                    System.out.println("3. Print the square triangle (The corner is square at top-left)");
                    for (int i = 10; i >= 1; i--) {
                        System.out.println(" ");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 4:
                    System.out.println("4. Print isosceles triangle");
                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10 - i; j++) System.out.print(" ");
                        for (int k = 1; k <= i; k++) System.out.print("* ");
                        System.out.println(" ");
                    }
                    break;
                case 5:
                    System.out.println("5. Print Inverted full pyramid");
                    int rows = 5;
                    for(int i = rows; i >= 1; --i) {
                        for(int space = 1; space <= rows - i; ++space) {
                            System.out.print("  ");
                        }
                        for(int j=i; j <= 2 * i - 1; ++j) {
                            System.out.print("* ");
                        }
                        for(int j = 0; j < i - 1; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("6. Print to print pyramid");
                    int rows1 = 5, k = 0, count = 0, count1 = 0;

                    for(int i = 1; i <= rows1; ++i) {
                        for(int space1 = 1; space1 <= rows1 - i; space1++) {
                            System.out.print("  ");
                            count++;
                        }
                        while(k != 2 * i - 1) {
                            if (count <= rows1 - 1) {
                                System.out.print((i + k) + " ");
                                count++;
                            }
                            else {
                                count1++;
                                System.out.print((i + k - 2 * count1) + " ");
                            }
                            k++;
                        }
                        count1 = count = k = 0;
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
