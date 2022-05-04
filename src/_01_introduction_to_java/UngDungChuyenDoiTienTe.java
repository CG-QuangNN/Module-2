package _01_introduction_to_java;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double RATE = 23000;

        System.out.print("Nhập vào usd: ");
        double usd = scanner.nextDouble();

        double vnd = usd * RATE;

        System.out.printf("%.2fUSD <=> %.2fVND", usd, vnd);
    }
}
