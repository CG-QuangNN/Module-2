package _03_mang_va_phuong_thuc;

public class TinhTongTrenDuongCheoChinh {
    public static void main(String[] args) {
        double[][] arr = {{8.2, 6.1, 5}, {10.6, 50.1, 30.7}, {5.8, 20.2, 1.4}};

        System.out.println("Tổng giá trị trên đường chéo chính: " + sumOfColumn(arr));
    }

    public static double sumOfColumn(double[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }

        return sum;
    }
}
