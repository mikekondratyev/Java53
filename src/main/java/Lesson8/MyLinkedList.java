package Lesson8;

import lesson6.list.MyList;

public class MyLinkedList implements MyList {


    private static class Node {
        private int value;
        private Node next;
        private int size = 0;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head; // link to first node

    @Override
    public int size() {
        return size;
    }


    public boolean contains(int value) {
        Node n = head; // текущий узел
        while (n != null) {
            if (n.getValue() == value)
                return true;
            n = n.getNext();
        }

        return false;
    }

    private int size = 0;

    // set изменение значение по номеру
    @Override
    public void set(int index, int value) {
        Node n = getNodeByIndex(index);
        if (n != null)
            n.setValue(value);
    }

    private Node getNodeByIndex(int index) //получение по индлексу
    {
        Node n = head;
        for (int i = 0; i < index; i++) {
            if (n != null)
                n = n.getNext();
            else
                throw new IndexOutOfBoundsException();
        }
        return n;
    }

    @Override
    public String toString() {

        StringBuilder b = new StringBuilder("[");
        b.append("head=");
        Node n = head;
        while (n != null) {
            b.append(n.getValue());
            n = n.getNext();
            if (n != null)
                b.append(", ");
        }
        b.append("]");

        return b.toString();

    }


    @Override
    public void add(int value) {
        size++;// так вставляем новый  элемент
        if (head == null) {
            head = new Node(value, null);
            return;
        }
        Node n = head;
        while (n.getNext() != null)
            n = n.getNext();
        n.setNext(new Node(value, null));
    }


    @Override
    public int get(int index) {
        {
            Node n = getNodeByIndex(index);
            return n.getValue();
        }
    }

    @Override
    public void add(int index, int value) {

        if (index == 0) {

            Node n = new Node(value, head);
//            head = n;
//            return;
        } else {
            Node prev = getNodeByIndex(index - 1);
            Node next = prev.getNext();
            Node newNode = new Node(value, next);
            prev.setNext(newNode);
        }


        size++;

    }

    @Override
    public void remove(int index) {
        if(index == 0) {
            if (head == null)
                return;
            head = head.getNext();
            size--;
            return;
        }
        Node prev = getNodeByIndex(index - 1);
        if(prev != null)
        {
            Node current = prev.getNext();
            if(current != null)
            {
                prev.setNext(current.getNext());
                size--;
            }

        }
    }

    public  int addFirst (int value) {
        add (0,value);
        return 0;
    }

    public  int  getFirst () {
      return  get (0);
    }

    public int removeFirst (){
        int value = getFirst();
         remove(0);
         return value;

    }


}