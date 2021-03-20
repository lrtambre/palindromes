package com.main;

public class Node {

	char data; 
	Node next;


	public Node(char n) {
		this.setData(n);
		this.setNext(null);
	}
	
	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}	
}
