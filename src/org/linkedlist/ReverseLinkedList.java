package org.linkedlist;

public class ReverseLinkedList {

	Node current;
	Node previous;
	Node next;
	
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ReverseLinkedList rll = new ReverseLinkedList();
		Node reversed =rll.reverse(ll);
		System.out.println(reversed);
		
	}


	private  Node reverse(LinkedList ll) {
		current =ll.head; 
		previous = null;
		next = null;
		
		while(current != null) {
			next = current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
	}

}
