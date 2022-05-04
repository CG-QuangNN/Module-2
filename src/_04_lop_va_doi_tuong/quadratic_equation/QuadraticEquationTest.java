package _04_lop_va_doi_tuong.quadratic_equation;

import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.printf("The equation has two roots %f and %f", quadraticEquation.getRoot1(), quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.printf("The equation has one root %f", quadraticEquation.getRoot1());
        } else {
            System.out.print("The equation has no roots");
        }
    }
}
