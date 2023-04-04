package Lesson2.Shape;

public class Rectangle extends Figure {
private  int x;
private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    double area() {
        return x*y;
    }

    @Override
    double perimeter() {
        return 2*(x+y);
    }
}
