package Day13.adam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
  Using generics:
  1. ArrayList has same element type
  2. No need down-casting
  3.
 */
public class GenericsType {
  public static void main (String[] args) {
//  using generics, list only contains Animal class
    List<Animal> myList = new ArrayList<Animal>();
    Cat cat = new Cat();
    Bird bird = new Bird();
    
    myList.add(cat);
    myList.add(bird);
//    myList.add("abc");// cannot add String
    
//    Iteration, Iterator with Animal type
    Iterator<Animal> it = myList.iterator();
    while (it.hasNext()){
      Animal a = it.next();
      a.move();

    }
    
  }
}

class Animal {
  public void move(){
    System.out.println("Animal is moving");
  }
}

class Cat extends Animal {
  public void catchMouse(){
    System.out.println("Catching mouse!");
  }
}

class Bird extends Animal {
  public void fly(){
    System.out.println("Bird flying");
  }
}