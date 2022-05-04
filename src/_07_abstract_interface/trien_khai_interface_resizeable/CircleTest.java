package _07_abstract_interface.trien_khai_interface_resizeable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        System.out.println(circle.getArea());

        circle.resize(50);
        System.out.println(circle.getArea());
    }
}