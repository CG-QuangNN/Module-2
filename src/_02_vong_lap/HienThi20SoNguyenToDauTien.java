package _02_vong_lap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int numbers = 20;
        int numberPrimes = 0;

        for (int i = 2; numberPrimes < numbers; i++) {
            if (isPrime(i)) {
                numberPrimes++;
                System.out.print(i + "\t");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
