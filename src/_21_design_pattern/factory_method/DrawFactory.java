package _21_design_pattern.factory_method;

public class DrawFactory {
    public Shape getShape(String shape){
        switch (shape){
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                return new Rectangle();

        }
    }
}