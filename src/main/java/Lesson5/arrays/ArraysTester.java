package Lesson5.arrays;

import java.util.Arrays;

public class ArraysTester {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        int[] b = new int[]{4,5,6}; // проинициализируются значениями по-умолчанию

        String [] movies = new String[] {"Apocalypse now", "Taxi Driver", "Tango and Cache"};

        String [] songs = {"Rasputin", "Never let me down again"};

        test(new String[] {"abc"});
        test(songs);
        System.out.println(a.length);
        System.out.println(Arrays.toString(songs));
        // test({"abc"});


        int [] [] c = new int [] [] {
                {1,3,5},
                {4},
                {-10,20,-40,5}
        };
        System.out.println(c[2][2]); //-40
        System.out.println(c.length);
        System.out.println(c[2].length);
    }

//    public static int concatenateArrays (int []a, int[]b){
//        int cLength= a.length+b.length;
//        int  [] c =  new int[cLength];
//        for (int i = 0; i < a.length; i++) {
//            c[i]=a[i];
//            i++;
//        }
//        for (int i = a.length; i < c.length; i++) {
//            c[i]=b[i];
//            i++;
//        }
//       // System.out.println(Arrays.toString(concatenateArrays([1,2,3],[4,5,6])));
//        return c[1];
//    }




    public static String format(String [] s) {
        // [Rasputin, Never let me down again]
        String result = "";
        result += "[";
        for (int i = 0; i < s.length; i++)
        {
            if(i != 0)
            {
                result += ", ";
            }
            result += s[i];
        }
        result += "]";
        return result;
    }
    public static void test(String [] s)
    {

    }
}
