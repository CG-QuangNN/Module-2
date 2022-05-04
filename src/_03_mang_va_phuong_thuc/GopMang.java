package _03_mang_va_phuong_thuc;

public class GopMang {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = {40, 50, 60};

        int[] c = contact(a, b);
        System.out.println("\nMảng sau khi gộp");
        for (int i = 0; i < c.length; i++) {
            System.out.printf("%d\t", c[i]);
        }
    }

    public static int[] contact(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        int tempIndex = a.length;

        for (int i = 0; i < b.length; i++) {
            temp[tempIndex++] = b[i];
        }

        return temp;
    }
}
