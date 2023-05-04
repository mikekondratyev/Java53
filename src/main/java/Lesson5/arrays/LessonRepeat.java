package Lesson5.arrays;
import java.util.Arrays;

public class LessonRepeat {
    public static void main(String[] args) {


    int [][] d = {
            {1,3,5},
            {10,20},
            {-1}
    };
System.out.println(
        Arrays.toString(flattening(d))
            );
    }
    public static int [] flattening (int [] [] a)
    {
        int n = 0;
        for (int i=0; i<a.length; i++){
            n+=a[i].length;
        }
        System.out.println(n);

        int [] r = new int [n];
        int position=0;
        for (int i = 0; i < a.length ; i++) {

            for (int j = 0; j < a[i].length; j++)
            {
                r[position++] = a[i][j];
            }

        }
        return r;
    }
}
