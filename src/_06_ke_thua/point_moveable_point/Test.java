package _06_ke_thua.point_moveable_point;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();

        point.setX(0);
        point.setY(2);
        System.out.println("Point : " + point);

        point.setXY(3, 4);
        System.out.println("Point : " + point);

        MovablePoint movablePoint = new MovablePoint();

        movablePoint.setX(point.getX());
        movablePoint.setY(point.getY());

        movablePoint.setXSpeed(5);
        movablePoint.setYSpeed(6);

        movablePoint.move();

        System.out.println(movablePoint);
    }
}
