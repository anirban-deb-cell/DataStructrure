package org.queue;

public class QueueImpl {
	
	int size;
	int front=-1;
	int rear=-1;
	Object[] queue = null;
	
	public QueueImpl(int size) {
		this.size=size;
		queue = new Object[size];
		
	}

	private boolean isEmpty() {
		return (front==-1 && rear==-1);
	}
	
	private boolean isFull() {
		return rear == size-1;
	}
	
	public boolean add(Object obj) {
		if(isFull()) {
			System.out.println("Queue is full");
			return false;
		}else if(front==-1 && rear==-1) {
			front++; rear++;
			queue[front]=obj;
		}else {
			rear++;
			queue[rear]=obj;
		}
		return true;
	}
	
	public Object remove() {
		
		if(isEmpty()) {
			return -1;
		}else if(rear==0){
			Object val = queue[0];
			front=-1;rear=-1;
			queue = new Object[size];
			return val;
		}else {
			Object val = queue[0];
			rear--;
			Object[] temp = new Object[size];
			for(int i=1; i<queue.length-1;i++) {
				temp[i-1]=queue[i];
			}
			queue = temp;
			return val;
		}
		
	}
	
	
public Object poll() {
		
		if(isEmpty()) {
			return -1;
		}else if(rear==0){
			Object val = queue[0];
			front=-1;rear=-1;
			queue = new Object[size];
			return val;
		}else {
			Object val = queue[0];
			rear--;
			Object[] temp = new Object[size];
			for(int i=1; i<queue.length-1;i++) {
				temp[i-1]=queue[i];
			}
			queue = temp;
			return val;
		}
		
	}
	
	
	public static void main(String[] str) {
		QueueImpl ql = new QueueImpl(10);
		for(int i=0; i<10;i++) {
			ql.add(i);
		}
		
		System.out.println(ql);
		ql.remove();
		System.out.println(ql);
		ql.poll();
		System.out.println(ql);
	}
	
	

}
