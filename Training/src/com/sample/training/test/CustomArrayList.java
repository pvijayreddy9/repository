package com.sample.training.test;

import javax.lang.model.element.Element;

public class CustomArrayList<E> {

	private final int defaultCapacity = 10;
	private Object [] objElement;
	int size;
	
	public CustomArrayList() {
		objElement = new Object[defaultCapacity];
		this.size = 0;
	}
	
	public CustomArrayList(int capacity) {
		objElement = new Object[capacity];
		this.size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public void add(E e) {
		if(size == objElement.length) {
			increaseCapacity();
		}
		
		this.objElement[size] = e;
		size++;
	}

	private void increaseCapacity() {
		int newCapacity = objElement.length*2;
		Object[] newElements = new Object[newCapacity];
		System.arraycopy(objElement, 0, newElements, 0, size);
		objElement = newElements;
		
	}
	public E get(int index) {
		if(index < size) {
			return (E) objElement[index];
		}else {
			throw new IndexOutOfBoundsException("IndexOutOfBoundException");
		}
	}
}
