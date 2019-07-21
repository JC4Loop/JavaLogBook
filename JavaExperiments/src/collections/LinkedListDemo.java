package collections;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("B");
        ll.add("D");
        ll.add("F");
        ll.add("H");
        ll.add("J");
        
        System.out.println(ll);
        ll.addLast("Z");
        ll.addFirst("A");
        System.out.println("After addLast() and addFirst() ");
        System.out.println(ll);
        ll.remove("F");
        ll.remove(2);
        System.out.println(ll);
        
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        ll.remove(0);
        System.out.println(ll);
        
        ll.add(1, "Y");
        System.out.println(ll);
        
        int i = ll.size();
        System.out.println(i);
    }
}
