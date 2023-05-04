package lesson6.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList implements MyList, Iterable<Integer> {

    public Iterator<Integer> smallToBigIterator(){
return  null;
    };

    public class SmallToBigIterator implements Iterator<Integer> {
        // массив с данными для итератора
private int [] source = new int [size];
// позиция итератора
private int position = -1;

public SmallToBigIterator (){
    // скопировать данные из массива
    System.arraycopy(data,0,source,0, size);
    // и отсортировать
    Arrays.sort (source);
}
        @Override
        public boolean hasNext() {
            return ++position<size;
        }

        @Override
        public Integer next() {


    if (position <0 || position >=size)
        throw new NoSuchElementException();
        return source[position];

        }
    }


    public Iterator<Integer> backwardIterator (){
        return new Iterator<Integer>(){
private int position = size;
            @Override
            public boolean hasNext() {
                return --position>=0;
            }

            @Override
            public Integer next() {
                return get(position);
            }
        };
    }



    @Override
    public Iterator<Integer> iterator()
    {
        return new Iterator<Integer>() {
            private int position = -1;
            @Override
            public boolean hasNext() {
                return ++position<size;
            }

            @Override
            public Integer next() {
                return get(position);
            }

            public void remove (){
                MyArrayList.this.remove(position--);
            }
        };
    }
private static final int INITIAL_SIZE=8; // начальная емкость
    private int size = 0; // длина контейнера
    private int [] data; // тут элементы хранятся

    public MyArrayList() {
        data = new int [INITIAL_SIZE];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int get(int index) {
        if (index<0||index>= size)
            throw new IndexOutOfBoundsException();
        return data[index];
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
        if (value ==  data [i] )
            return true;
        }
        return false;

    }

    @Override
    public void set(int index, int value) {
        if (index<0||index>= size)
            throw new IndexOutOfBoundsException();
        data[index]=value;
    }

    // добавляем новый элемент в контейнер
    @Override
    public void add(int value) {
    if (size == data.length)  {
        increaseCapacity ();
    }
    data[size] = value;
    size ++;
    }

    @Override
    public void add(int index, int value) {
data[index]=value;
size++;
    }

//    @Override
//    public void add(int index, int value) {
//
//    }

    @Override
    public void remove(int index) {
        if (index<0||index>= size)
            throw new IndexOutOfBoundsException();
        for (int i = index+1; i < size; i++) {
        data [i-1] = data [i];
        }
        size--;
    }

    private void increaseCapacity ()
    {
        int [] newdata = new int [size*2];
        for (int i = 0; i < size; i++) {
            newdata[i]= data[i];
        }
        data=newdata;
    }


}
