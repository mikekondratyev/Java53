package lesson6.list;

public interface MyList {
  int size (); // return list size
  int get (int index); // return element

  boolean contains (int value);
  void set (int index, int value);
  void add (int value);
  void add (int index, int value);
  void remove (int index);
}
