package Lesson1.Rectangle;

public class Tester {
    public static void main(String[] args) {
        Point point1 = new Point(10,10);
        Point point2 = new Point(30,30);
        double area = (point2.getX()-point1.getX())*(point2.getY()-point1.getY());
        System.out.println(area);
    }
}
