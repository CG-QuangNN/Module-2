package _03_mang_va_phuong_thuc;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 7;
        arr[5] = 10;

        int x = 7;

        System.out.println("\nMảng trước khi xóa phần tử");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }

        deleteElement(arr, x);
        System.out.println("\nMảng sau khi xóa phần tử");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
    }

    public static void deleteElement(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                deleteAtIndex(arr, i);
                i--;
            }
        }
    }

    public static void deleteAtIndex(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }
}
