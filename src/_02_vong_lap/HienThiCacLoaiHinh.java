package _02_vong_lap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        int numRows = -1;
        int numColumns = -1;

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Number of rows: ");
                    numRows = input.nextInt();

                    System.out.println("Number of columns: ");
                    numColumns = input.nextInt();

                    System.out.println("1. Print the rectangle");
                    for (int i = 1; i <= numRows; i++) {
                        for (int j = 1; j <= numColumns; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Number of rows: ");
                    numRows = input.nextInt();

                    do {
                        System.out.println("Menu");
                        System.out.println("1. top-left");
                        System.out.println("2. top-right");
                        System.out.println("3. botton-left");
                        System.out.println("4. botton-right");
                        System.out.println("Enter your choice: ");
                        choice = input.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("1. top-left");
                                for (int i = 1; i <= numRows; i++) {
                                    for (int j = 1; j <= numRows - i + 1; j++) {
                                        System.out.print(" *");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 2:
                                System.out.println("2. top-right");
                                for (int i = 1; i <= numRows; i++) {
                                    for (int j = 1; j <= numRows; j++) {
                                        if (j >= i) {
                                            System.out.print(" *");
                                        } else {
                                            System.out.print("  ");
                                        }
                                    }
                                    System.out.println();
                                }
                                break;
                            case 3:
                                System.out.println("3. botton-left");
                                for (int i = 1; i <= numRows; i++) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print(" *");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 4:
                                System.out.println("4. botton-right");
                                for (int i = 1; i <= numRows; i++) {
                                    for (int j = 1; j <= numRows; j++) {
                                        if (j >= numRows - i + 1) {
                                            System.out.print(" *");
                                        } else {
                                            System.out.print("  ");
                                        }
                                    }
                                    System.out.println();
                                }
                                break;
                            default:
                                System.out.println("No choice!");
                        }
                    } while (choice < 1 || choice > 4);
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    System.out.println("Number of rows: ");
                    numRows = input.nextInt();
                    for (int i = 1; i <= numRows; i++) {
                        for (int j = 1; j <= numRows - i; j++) {
                            System.out.print("  ");
                        }

                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print(" *");
                        }

                        System.out.println();
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
