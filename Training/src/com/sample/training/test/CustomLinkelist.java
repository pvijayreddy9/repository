package com.sample.training.test;

import java.util.LinkedList;

import javax.lang.model.element.Element;

public class CustomLinkelist<E> {	
	
	private Node head;
	int size;
	
	public static class Node<E>{
		
		E object;
		Node<E> next;
		
		Node(E e){
			this.object = e;
			this.next = null;
		}
		
	}
	
	public CustomLinkelist(){
		this.head = null;
		this.size=0;
	}
	public int size() {
        return size;
    }
	
	public void add(E e) {
		Node<E> newnode = new Node(e);
		if(head==null) {
			head = newnode;
		}else {
			Node<E> current = head;
			if(current.next != null) {
                current = current.next;
            }
			current.next = newnode;
		}
		size++;
	}
	
	public E get(int index) {
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException();
		}else {
			Node<E> current = head;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
			return current.object;
		}
		
	}

}
