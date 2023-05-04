package lesson6;

public class NOD {
    public static void main(String[] args) {

        int a = 48;
        int b = 2;
        long start = System.nanoTime();
        greatestCommonDeliver(a, b);
        long end = System.nanoTime();
        System.out.println("Euclidean algorithm = " + (end - start));

    }

    public static void greatestCommonDeliver(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        System.out.println("gcd = " + a);
    }
}
