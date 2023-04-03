package Lesson2.Shape;

public class Circle extends Figure{
    private double radii;

    public Circle(double radii) {
        this.radii = radii;
    }

    @Override
    double area() {
        return Math.PI*radii*radii;
    }
    double perimeter (){
        return 2*Math.PI*radii;
    }
}
