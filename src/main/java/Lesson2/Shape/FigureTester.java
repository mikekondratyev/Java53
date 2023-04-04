package Lesson2.Shape;

public class FigureTester {
    public static void main(String[] args) {
        Figure [] figures = new Figure[1000];
        figures[0]= new Circle(15);
        figures [1]= new Rectangle(20,20);
        figures [2] = new Triangle(3,3,3);
        figures [0].area();
        figures [1].area();
        figures [2].area();
        System.out.println(perimeter(figures));
        System.out.println(area(figures));

    }
    public static double perimeter (Figure [] figures)
    {
double result = 0;
for (int i =0; i< figures.length; i++)
        {
            if (figures [i] !=null)
                result += figures[i].perimeter();
        }

return result;
}


    public static double area (Figure [] figures)
    {
        double result = 0;
        for (int i =0; i< figures.length; i++)
        {
        if (figures [i] !=null)
        result += figures[i].area();
        }

        return result;
        }
}

