package com.main;

public class LinkedList {

	// nodes to track start and end of linked list 
	Node head = null;
	Node tail = null;

	/**
	 * Default constructor
	 */
	public LinkedList() {
		
	}


	/**
	 * Create a new List 
	 * Appropriately set the start and end of the list
	 * @param n
	 */
	public void addNode(char n) {
		Node newNode = new Node(n);
		// If its a brand new list, 
		// then create a new node 
		// and set that as the head and tail
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		// If its an existing list with nodes, 
		// set the newly created node as the tail
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
}
