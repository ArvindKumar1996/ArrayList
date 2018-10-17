package com.arvind.MyArrayList;

public class MyArrayList {

	private Object[] arr=new Object[3];
	private int p=0;
	public void add(Object e) {
		if(p>=arr.length)
			increase();
		  arr[p]=e;
		  p++;
	}
	private void increase() {
		Object[] temp=new Object[arr.length+3];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
	}
	public int size() {
		return p;
	}
	public Object get(int index) {
		if(index>=size()) throw new IndexOutOfBoundsException(); 
			return arr[index];
	}
	public String toString() {
		if(size()==0)
			return "[]";
			String s="["+arr[0];
			for(int i=1; i<size();i++) {
				s+=","+arr[i];
			}
			s+="]";
			return s;
   }
}