package Lesson8;

public class MyLinkedListTester {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        System.out.println(list.size()); // 3
        list.set(2, 30);
        System.out.println(list);

        System.out.println(list.contains(2)); // true
        System.out.println(list.contains(20)); // false

        list.add(0,15);
        System.out.println(list);
    }
}