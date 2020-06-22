package org.arraylist;

public class ArrayListImpl {

	int size;
	int loadFactor=2;
	Object[] arr =null;
	int index;
	public ArrayListImpl() {
		this.size = 10;
		index=0;
		arr=new Object[10];
	}

	void increaseSizeAndReallocate() {
		size = size*loadFactor;
		Object[] tempArry = new Object[size];
		for(int i=0;i<arr.length;i++) {
			tempArry[i]=arr[i];
		}
		this.arr=tempArry;
	}

	void add(Object o) {
		if(index == size-1) {
			increaseSizeAndReallocate();
		}else {
			arr[index]=o;
			index++;
		}
	}

	public static void main(String[] str) {
		ArrayListImpl arr = new ArrayListImpl();
		for(int i =0; i<12;i++) {
			arr.add(i);
		}
		
		System.out.println(arr);
	}

}
