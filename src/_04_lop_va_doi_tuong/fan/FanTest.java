package _04_lop_va_doi_tuong.fan;

public class FanTest {
    public static void main(String[] args) {
        Fan fan1 =new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 =new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Info fan1");
        System.out.println(fan1);

        System.out.println("Info fan2");
        System.out.println(fan2);
    }
}