package _07_abstract_interface.trien_khai_interface_resizeable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle.resize(50);
        System.out.println(rectangle);
    }
}