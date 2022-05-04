package _06_ke_thua.circle_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.2, "blue", 10);
        System.out.println(cylinder);
        System.out.println(cylinder.volume());
    }
}
