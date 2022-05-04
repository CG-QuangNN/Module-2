package _03_mang_va_phuong_thuc;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        String str = "nguyễn ngọc quang";
        int count = 0;
        char c = 'n';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }

        System.out.printf("Số lần xuất hiện của '%c' là %d lần", c, count);
    }
}
