package _12_java_collection_framework;

import java.util.Comparator;

public class SapXepGiamDanTheoGia implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
