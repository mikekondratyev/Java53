package Lesson5.arrays;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
int a [][]={
        {1,2,3},
        {4},
        {-5}
};
        System.out.println(sumOf2DArray(a));
        System.out.println(a);
        print2DArray(a);
    }

    public static void print2DArray(int [] [] a){
        System.out.println("[");
        for (int i = 0; i < a.length; i++) {
            System.out.println (Arrays.toString(a[i]));
        }

        System.out.println("]");
    }

    public static int sumOf2DArray (int [] [] a){
        int sumn=0;
        for (int i = 0;  i< a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
              sumn+=  a[i][j] ;
            }
            
        }
        
        return sumn;
    }
}
