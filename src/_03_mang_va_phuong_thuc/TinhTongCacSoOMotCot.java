package _03_mang_va_phuong_thuc;

public class TinhTongCacSoOMotCot {
    public static void main(String[] args) {
        double[][] arr = {{8.2, 6.1, 5}, {10.6, 50.1, 30.7}, {5.8, 20.2, 1.4}};

        int x = 2;
        System.out.println("Tổng giá trị trên cột x: " + sumOfColumn(arr, x));
    }

    public static double sumOfColumn(double[][] arr, int col) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }

        return sum;
    }
}
