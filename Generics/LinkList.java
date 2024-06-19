package Generics;

public class LinkList {
	
	private class Node {
		private int data;		// The int value stored in Node
		private Node next;		// The next location in the Linked List
		
		public Node(int data) {
			this.data = data;
		}
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node head;		// Location of head
	private Node tail;		// Location of tail
	
	//private int size;		// Size of the Linked List -> use size() method to avoid stale data
	
	public LinkList() {
		head = null;
		tail = null;
	}
	
	/**
	 * isEmpty Method
	 * @return If head is empty
	 */
	public boolean isEmpty() {
		return head == null;
	}
	
	/**
	 * insertFirst Method
	 * Insert value in first Node
	 * @param data The value to be stored in Node
	 */
	public void insertFirst(int data) {		
		// Create new node
		Node node = new Node(data);
		// Next location = head because we are adding to the
		// front of the list
		node.next = head;
		// Now made head = to node we just created
		head = node;
		// If tail has not been assigned, make it equal to the first node
		if(tail == null)
			tail = head;
	}
	
	/**
	 * insertLast Method
	 * Insert the value at the end of the list
	 * @param data The value being added to the List
	 */
	public void insertLast(int data) {
		// If List is empty, pass data to insertFirst
		if(isEmpty()) {
			insertFirst(data);
			return;
		}
		/*
		// Create new node and pass data to it
		Node node = new Node(data);
		// Set tail.next to new node and set tail to node
		tail.next = node;
		tail = node;
		*/
		
		// Create new node and iterate through List to last position
		Node itr = head;
		while(itr.next != null)
			itr = itr.next;
		// Create new node passing data, and null for node.next
		Node node = new Node(data, null);
		// Set prev tail to point to new node
		itr.next = node;
		// Set new tail to node
		tail = node;
	}
	
	public void insertAt(int index, int data) {
		// If first position, pass to insertFirst
		if(index == 0) {
			insertFirst(data);
			return;
		}
		// If last position, pass to insertLast
		if(index == size()) {
			insertLast(data);
			return;
		}
		// If index > size() the position DNE
		if(index > size()) {
			throw new IllegalArgumentException("Index greater than size");
		}
		// Create temp node equal to head
		Node temp = head;
		// Iterate through list to index
		for(int i = 1; i < index; i++) {
			temp = temp.next;
		}
		// Create new node with data, temp.next
		Node node = new Node(data, temp.next);
		// Set temp.next to the new node added
		temp.next = node;
	}
	
	/**
	 * removeFirst Method
	 * Remove head and replace with second position
	 */
	public void removeFirst() {
		// If head is null list is empty
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		// Create new node equal to head. 
		Node node = head;
		// Set head to node.next to remove first node
		head = node.next;
		
		// If head is now null, list is empty, set tail to null
		if(head == null)
			tail = null;
	}
	
	/**
	 * removeLast Method
	 * remove tail and replace with second last position
	 */
	public void removeLast() {
		// If head is null, list is empty
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		// If head == tail there is only one node, run removeFirst
		if(head == tail) {
			removeFirst();
			return;
		}
		// Create node equal to head and iterate through to second from last node
		Node itr = head;
		while(itr.next.next != null) {
			itr = itr.next;
		}
		// Make second to last note point to null to remove last node from list
		itr.next = null;
		tail = itr;
		// If tail becomes null, list is empty, set head to null
		if(tail == null)
			head = null;
	}
	
	/**
	 * removeAt Method
	 * Remove a node at a specific index
	 * @param index The node to remove
	 */
	public void removeAt(int index) {
		// If head is null List is empty
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		// If index > size() the position DNE
		if(index > size()) {
			throw new IllegalArgumentException("Index is greater than size");
		}
		// Create new node equal to head and iterate to position before index
		Node itr = head;
		for(int i = 1; i < index; i++) {
			itr = itr.next;
		}
		// Remove node be setting itr.next to position after index to be removed
		itr.next = itr.next.next;
	}
	
	/**
	 * size Method
	 * @return The number of nodes in List
	 */
	public int size() {
		int size = 0;
		Node itr = head;
		// Iterate through and count nodes
		while(itr.next != null) {
			size++;
			itr = itr.next;
		}
		return size;
	}
	
	/**
	 * display Method 
	 * Display the contents of the Linked List 
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();
		Node itr = head;
		str.append("[");
		while(itr != null) {
			str.append(itr.data);
			if(itr.next != null)
				str.append(", ");
			itr = itr.next;
		}
		str.append("]");
		return(str.toString());
	}
	
	/**
	 * main Method
	 * @param args
	 */
	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		
		System.out.println(list.toString());
		
		list.insertLast(5);
		list.insertLast(6);
		list.insertLast(7);
		list.insertLast(8);
		
		System.out.println(list.toString());
		
		list.insertAt(3, 50);
		
		System.out.println(list.toString());
		
		list.removeAt(3);
		
		System.out.println(list.toString());
		
		list.removeFirst();
		
		System.out.println(list.toString());
		
		list.removeLast();
		
		System.out.println(list.toString());
		
		list.removeLast();
		list.removeLast();
		list.removeLast();
		list.removeLast();
		System.out.println(list.head + "\n" + list.tail);
		list.removeLast();
		System.out.println(list.head + "\n" + list.tail);
		list.removeLast();
	
		System.out.println(list.toString());
		System.out.println(list.head + "\n" + list.tail);
		list.removeLast();
		
		System.out.println(list.toString());
		System.out.println(list.head + "\n" + list.tail);
	}
}
