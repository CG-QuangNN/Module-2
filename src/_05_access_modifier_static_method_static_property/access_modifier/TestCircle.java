package _05_access_modifier_static_method_static_property.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());
    }
}
