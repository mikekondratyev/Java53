package Lesson1.Rectangle;

public class Tester {
    public static void main(String[] args) {
        Point point1 = new Point(10,10);
        Point point2 = new Point(30,30);
        Rectangle r= new Rectangle(point2, point1);
        System.out.println(r.area());
    }
}
