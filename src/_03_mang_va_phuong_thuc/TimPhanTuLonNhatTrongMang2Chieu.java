package _03_mang_va_phuong_thuc;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int[][] arr = {{8, 6, 5}, {10, 50, 30}, {5, 20, 40}};

        System.out.println("Giá trị lớn nhất: " + max(arr));
    }

    public static int max(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }

        return max;
    }
}
