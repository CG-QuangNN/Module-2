package _01_introduction_to_java;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight number (Up to 3 digits): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of Ability");
        } else if (number < 10) {
            switch (number) {
                case 0:
                    System.out.print("zero");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        } else if (number <= 20) {
            switch (number) {
                case 10:
                    System.out.print("ten");
                    break;
                case 11:
                    System.out.print("eleven");
                    break;
                case 12:
                    System.out.print("twelve");
                    break;
                case 13:
                    System.out.print("thirteen");
                    break;
                case 14:
                    System.out.print("fourteen");
                    break;
                case 15:
                    System.out.print("fifteen");
                    break;
                case 16:
                    System.out.print("sixteen");
                    break;
                case 17:
                    System.out.print("seventeen");
                    break;
                case 18:
                    System.out.print("eighteen");
                    break;
                case 19:
                    System.out.print("nineteen");
                    break;
                case 20:
                    System.out.print("twenty");
                    break;
            }
        } else if (number < 100) {
            int hangDonVi = number % 10;
            int hangChuc = number / 10;
            switch (hangChuc) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;

            }

            switch (hangDonVi) {
                case 1 :
                    System.out.print(" one");
                    break;
                case 2 :
                    System.out.print(" two");
                    break;
                case 3 :
                    System.out.print(" three");
                    break;
                case 4 :
                    System.out.print(" four");
                    break;
                case 5 :
                    System.out.print(" five");
                    break;
                case 6 :
                    System.out.print(" six");
                    break;
                case 7 :
                    System.out.print(" seven");
                    break;
                case 8 :
                    System.out.print(" eight");
                    break;
                case 9 :
                    System.out.print(" nine");
                    break;
            }
        } else {
            int hangTram = number / 100;

            switch (hangTram) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }

            System.out.print(" hundred");

            if (number != 100) {
                System.out.print(" and ");
                number = number % 100;
                if (number < 10) {
                    switch (number) {
                        case 0:
                            System.out.print("zero");
                            break;
                        case 1:
                            System.out.print("one");
                            break;
                        case 2:
                            System.out.print("two");
                            break;
                        case 3:
                            System.out.print("three");
                            break;
                        case 4:
                            System.out.print("four");
                            break;
                        case 5:
                            System.out.print("five");
                            break;
                        case 6:
                            System.out.print("six");
                            break;
                        case 7:
                            System.out.print("seven");
                            break;
                        case 8:
                            System.out.print("eight");
                            break;
                        case 9:
                            System.out.print("nine");
                            break;
                    }
                } else if (number <= 20) {
                    switch (number) {
                        case 10:
                            System.out.print("ten");
                            break;
                        case 11:
                            System.out.print("eleven");
                            break;
                        case 12:
                            System.out.print("twelve");
                            break;
                        case 13:
                            System.out.print("thirteen");
                            break;
                        case 14:
                            System.out.print("fourteen");
                            break;
                        case 15:
                            System.out.print("fifteen");
                            break;
                        case 16:
                            System.out.print("sixteen");
                            break;
                        case 17:
                            System.out.print("seventeen");
                            break;
                        case 18:
                            System.out.print("eighteen");
                            break;
                        case 19:
                            System.out.print("nineteen");
                            break;
                        case 20:
                            System.out.print("twenty");
                            break;
                    }
                } else {
                    int hangDonVi = number % 10;
                    int hangChuc = number / 10;
                    switch (hangChuc) {
                        case 2:
                            System.out.print("twenty");
                            break;
                        case 3:
                            System.out.print("thirty");
                            break;
                        case 4:
                            System.out.print("forty");
                            break;
                        case 5:
                            System.out.print("fifty");
                            break;
                        case 6:
                            System.out.print("sixty");
                            break;
                        case 7:
                            System.out.print("seventy");
                            break;
                        case 8:
                            System.out.print("eighty");
                            break;
                        case 9:
                            System.out.print("ninety");
                            break;

                    }

                    switch (hangDonVi) {
                        case 1 :
                            System.out.print(" one");
                            break;
                        case 2 :
                            System.out.print(" two");
                            break;
                        case 3 :
                            System.out.print(" three");
                            break;
                        case 4 :
                            System.out.print(" four");
                            break;
                        case 5 :
                            System.out.print(" five");
                            break;
                        case 6 :
                            System.out.print(" six");
                            break;
                        case 7 :
                            System.out.print(" seven");
                            break;
                        case 8 :
                            System.out.print(" eight");
                            break;
                        case 9 :
                            System.out.print(" nine");
                            break;
                    }
                }
            }
        }
    }
}
