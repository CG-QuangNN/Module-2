package _06_ke_thua.circle_cylinder;

public class Cylinder extends Circle {
    private double h;

    public Cylinder() {
    }

    public Cylinder(double r, String color, double h) {
        super(r, color);
        this.h = h;
    }

    public double volume() {
        return super.area() * h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "h=" + h + super.toString() +
                '}';
    }
}
