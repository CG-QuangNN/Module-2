package _07_abstract_interface.trien_khai_interface_colorable;

public class SquareTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[10];
        for (int i = 0; i < 10; i++) {
            shape[i] = getRandomShape();
        }

        for (Shape x : shape) {
            System.out.println(x.getArea());
            if (x instanceof Colorable) {
                ((Colorable) x).howToColor();
            }
        }
    }

    static Shape getRandomShape() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                return new Square(1);
            case 1:
                return new Rectangle(2, 3);
            default:
                return new Circle(4);
        }
    }
}

