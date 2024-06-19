package Generics;

public class GenericLinkedList<E> {

	private class Node{
		E data;
		Node next;
	}
	
	private Node head;
	
	public GenericLinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void pushFront(E value) {
		Node newNode = new Node();
		newNode.data = value;
		newNode.next = head; // Head is head of list
		
		head = newNode;
	}
	
	public E removeFront() {
		if(isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		E value = head.data;
		head = head.next;
		
		return value;
	}
	
	public void pushBack(E value) {
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
	
	public E removeBack() {
		if(isEmpty()) {
			throw new IllegalArgumentException("List is empty");
		}
		
		if(head.next == null) {
			E value= head.data;
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
	
	private void reverse() {
		head = reverse(head);
	}
	
	private Node reverse(Node n) {
		Node newHead;
		
		// Base case
		if(n.next == null) 
			return n;
		
		newHead = reverse(n.next);
		n.next.next = n;
		n.next = null;
		return newHead;
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
		GenericLinkedList<Integer> list = new GenericLinkedList<>();
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
		
		list.head = list.reverse(list.head);
		System.out.println(list + " !");
		
//		list.removeFront();
//		System.out.println(list);
//		
//		list.removeBack();
//		System.out.println(list);
		
		
		
	}
}

