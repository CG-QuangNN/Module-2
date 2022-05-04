package _21_design_pattern.factory_method;

public class DrawTest {
    public static void main(String[] args) {
        DrawFactory dF = new DrawFactory();
        Shape s1 = dF.getShape("circle");
        System.out.println(s1.draw());
    }
}
