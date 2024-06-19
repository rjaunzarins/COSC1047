package Generics;

public class LinkedList {

	private class Node{
		int data;
		Node next;
	}
	
	private Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void pushFront(int value) {
		Node newNode = new Node();
		newNode.data = value;
		newNode.next = head;
		
		head = newNode;
	}
	
	public int removeFront() {
		if(isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		int value = head.data;
		head = head.next;
		
		return value;
	}
	
	public void pushBack(int value) {
		if(isEmpty()) {
			pushFront(value);
			return;
		}
		
		Node iterator = head;
		// While its not the last in the list
		while(iterator.next != null) {
			iterator = iterator.next;
		}
		Node newNode = new Node();
		newNode.data = value;
		newNode.next = null;
		
		iterator.next = newNode;
	}
	
	public int removeBack() {
		if(isEmpty()) {
			throw new IllegalArgumentException("List is empty");
		}
		
		if(head.next == null) {
			int value= head.data;
			head = null;
			return value;
		}
		Node iterator = head;
		// While its not the last in the list
		while(iterator.next.next != null) {
			iterator = iterator.next;
		}
		
		Node oldLastNode = iterator.next;
		iterator.next = null;
		
		return oldLastNode.data;
	}
	
	public int size() {
		int mySize = 0;
		
		Node itr = head;
		while(itr!=null) {
			++mySize;
			itr = itr.next;
		}
		return mySize;
	}
	
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append('[');
		
		Node itr = head;
		while(itr!=null) {
			b.append(itr.data);
			if(itr.next!=null) {
				b.append(',');
			}
			itr = itr.next;
		}
		
		b.append(']');
		return b.toString();
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println(list);
		
		list.pushFront(5);
		System.out.println(list);
		
		list.pushFront(12);
		System.out.println(list);
		
		list.pushFront(15);
		System.out.println(list);
		
		list.pushFront(2);
		System.out.println(list);
		
		list.pushBack(8);
		System.out.println(list);
		
		list.removeFront();
		System.out.println(list);
		
		list.removeBack();
		System.out.println(list);
	}
}
