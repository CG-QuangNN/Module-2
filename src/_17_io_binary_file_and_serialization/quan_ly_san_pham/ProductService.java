package _17_io_binary_file_and_serialization.quan_ly_san_pham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    public static final String FILE_NHI_PHAN = "src/_17_io_binary_file_and_serialization/quan_ly_san_pham/ProductNhiPhan.text";
    public static final String FILE_CSV = "src/_17_io_binary_file_and_serialization/quan_ly_san_pham/Products.text";
    final String COMMA = ",";

    Scanner scanner = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();

    public void addProduct() {
        System.out.println("Enter the id");
        String id = scanner.nextLine();
        System.out.println("Enter the name of product");
        String name = scanner.nextLine();
        System.out.println("Enter the brand of product");
        String brand = scanner.nextLine();
        System.out.println("Enter the price");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the description of product");
        String desc = scanner.nextLine();
        productList.add(new Product(id, name, brand, price, desc));
    }

    public void displayProduct() {
        for (Product li : productList) {
            System.out.println(li);
        }
    }

    public void searchProduct() {
        System.out.println("Enter the name of product");
        String input = scanner.nextLine();
        for (Product li : productList) {
            if (li.getName().toLowerCase().contains(input)) {
                System.out.println(li);
            }
        }
    }

    public void writeFile() {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(FILE_NHI_PHAN);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Product li : productList) {
                objectOutputStream.writeObject(li);
            }
            System.out.println("Write Successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readFile() throws FileNotFoundException {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        File file = new File(FILE_NHI_PHAN);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println(objectInputStream.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeFileCSV() {
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(FILE_CSV);
            fileWriter = new FileWriter(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Product li : productList) {
                bufferedWriter.write(li.getId() + COMMA + li.getName() + COMMA + li.getBrand() + COMMA + li.getPrice() + COMMA + li.getDescriptions());
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
