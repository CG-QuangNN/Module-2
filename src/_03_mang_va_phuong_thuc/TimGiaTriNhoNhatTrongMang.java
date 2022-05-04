package _03_mang_va_phuong_thuc;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] arr = {1, -3, 7, 10, 0, 8, 2};

        System.out.println("Giá trị lớn nhất: " + min(arr));
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }
}
