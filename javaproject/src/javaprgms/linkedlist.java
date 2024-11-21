package javaprgms;

import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>linkedList=new LinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("D");
		linkedList.add("O");
		System.out.println(linkedList);
		linkedList.add(4,"B");
		linkedList.add(5,"B");
		System.out.println(linkedList);
		linkedList.remove("B");
		linkedList.remove("o");
		System.out.println(linkedList);
		ListIterator<String>iterator=linkedList.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}

	}

}
