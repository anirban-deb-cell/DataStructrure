package org.linkedlist;

public class LinkedList {

	Node head;

	public void add(Object obj) {
		Node node = new Node();
		node.value = obj;
		node.next=null;

		if(head==null){
			head=node;
		}
		else{
			Node tempNode = head;
			while(tempNode.next!=null) {
				tempNode = tempNode.next;
			}
			tempNode.next=node;
		}
	}

	public void addStart(Object obj) {
		Node node = new Node();
		node.value = obj;
		node.next=null;
		node.next=head;
		head=node;
	}

	public void addAt(int index, Object obj) {

		if(index==0) {
			addStart(obj);
		}else{
			Node node = new Node();
			node.value = obj;
			node.next=null;
			Node n = head;
			for(int i=0; i<index-1;i++) {
				n = n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}
	
	public void deleteAt(int index) {
		Node n = head;
		Node nTemp=null;
		for(int i=0;i<index-1;i++) {
			n = n.next;
		}
		nTemp = n.next;
		n.next=nTemp.next;
		System.out.println("nTemp : "+nTemp.value);
	}


	public static void main(String[] st) {
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.addStart(10);
		ll.addAt(2, 22);
		//ll.deleteAt(2);
		System.out.println(ll);
	}
}
