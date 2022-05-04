package _03_mang_va_phuong_thuc;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 7;
        arr[5] = 10;

        int x = 100;
        int index = 3;

        if (index < 0 || index > arr.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
            return;
        }

        System.out.println("\nMảng trước khi chèn phần tử");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }

        setElement(arr, index, x);
        System.out.println("\nMảng sau khi chèn phần tử");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
    }

    public static void setElement(int[] arr, int index, int value) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }
}
