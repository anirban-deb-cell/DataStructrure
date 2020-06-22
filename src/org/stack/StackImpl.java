package org.stack;

public class StackImpl {
	
	int top;
	Object arr[];
	int size;
	
	StackImpl(){}
	
	StackImpl(int size){
		this.size = size;
		arr = new Object[size];
		top=-1;
	}
	

	boolean isEmpty(){
		
		return top==-1;
	}
	
	boolean isFull() {
		return (size == top-1);
	}
	
	public boolean push(int a) {
		if(!isFull()) {
			top++;
			arr[top]=a;
			return true;
		}else {
			System.out.println("Stack Overflow");
			return false;
		}
	}
	
	public boolean pop() {
		int returnedTop = top;
		if(!isEmpty()) {
			System.out.println("removed "+arr[top]);
			arr[top]=0;
			top--;
			return true;
		}
		else {
			System.out.println("Stack underflow");
			return false;
		}
	}
	
	public Object peek() {
		if(!isEmpty()) {
			return arr[top];
		}else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public static void main(String[] args) {
		StackImpl stack = new StackImpl(10);
		for(int i=0;i<10;i++) {
			stack.push(i);
		}
		
		stack.pop();
		System.out.println(stack.arr);
		
		System.out.println(stack.peek ());
		System.out.println("Hash Code =>"+"Anirban".hashCode()%16); // getting hash index
	}
	

}
