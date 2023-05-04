package lesson7;

import lesson6.list.MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> rivers = new ArrayList<>(Arrays.asList("Volga", "Danube", "Rein", "Sena"));

        // iterator это способ обхода произвольного контейнера с элементами
        // boolean hasNext() - проверка есть ли следующий элемент
        // T next() - возвращение следующего элемента
        Iterator<String> riversIterator = rivers.iterator();
//        System.out.println(riversIterator.hasNext()); // true
//        System.out.println(riversIterator.next()); // Volgar<String> riversIterator = rivers.iterator();
        for (String river:rivers
             ) {
            System.out.println(river);
        }
        while (riversIterator.hasNext())
            System.out.println(riversIterator.next());

        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator<Integer> arrayIterator = list.iterator();
        while (arrayIterator.hasNext())
        {
            int value = arrayIterator.next();
            System.out.println(value);
            if(value > 25)
                arrayIterator.remove();
        }
        // для того чтобы foreach работал
        // контейнер должен реализовывать интерфейс Iterable<T>
        for(int i : list)
        {
            System.out.println("foreach " + i);
        }
        list.add(-10);
        System.out.println(list);

        Iterator<Integer> minToMax = list.smallToBigIterator();
        while (minToMax.hasNext())
            System.out.println("(" + minToMax.next() + ")");
    }



}
