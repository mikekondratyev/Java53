package Lesson1.Rectangle;

public class Rectangle {
private Point se;
private Point nw;

    public Rectangle(Point se, Point nw) {
        this.se = se;
        this.nw = nw;
    }

    public Point getSe() {
        return se;
    }

    public void setSe(Point se) {
        this.se = se;
    }

    public Point getNw() {
        return nw;
    }

    public void setNw(Point nw) {
        this.nw = nw;
    }

    int area() {
        int sizeX = se.getX() - nw.getX();
        int sizeY = se.getY() - nw.getY();
        return sizeY*sizeX;

    }
}



//    {
//        // вернуть площадь
//        return 0;
//    }
//}



