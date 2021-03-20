package com.main;

import java.util.Stack;

public class Palindrome {

	
	public static void main(String[] args) {
		//Provide input string to be checked for a palindrome
		char[] inputList = "12321".toCharArray();
		
		Palindrome p = new Palindrome();
		
		//Create a linked list for the given input
		Node list = p.createList(inputList);
		
		
		//Call isPalindrome to check input 
		System.out.println("The input list: "+getInputListAsStr(list)+
							"\nIs a palindrome? "+p.isPalindrome(list));
	
	}
	
	/**
	 * Create a linkedList for the provided input
	 * @param inputList
	 * @return
	 */	
	public  Node createList(char[] inputList) {
		LinkedList list = new LinkedList();
		
		//Create a node in the linked list for each 
		// character on the input array
		for(int i=0; i<inputList.length;i++) {
			list.addNode(inputList[i]);
		}		
		return list.head;
	}
	
	
	/**
	 * Return linkedlist data as a string
	 * @param list
	 * @return
	 */
	public static String getInputListAsStr(Node list) {
		String str = "";
		while(list!=null) {
			str+=list.data;
			list = list.next;
		}
		return str;
	}
	
	/**
	 * Method to check if the given list is a palindrome
	 * Uses a stack.
	 * Assumptions: Input is a list of ASCII characters. 
	 * @param head
	 * @return
	 */
	public boolean isPalindrome(Node head){
		
		Stack<Character> stack = new Stack<Character>();
		
		//First copy the list 
		Node chkNode = head;
		
		boolean isPalindrome = false;
		
		//Read/push all nodes into the stack
		while(chkNode != null) {
			stack.push(chkNode.data);
			chkNode= chkNode.next;
		}
		
		//Now check for each node on the list and compare with the stack; 
		//if the elements are the same, then its a palindrome. 
		while(head!=null) {
			char i = stack.pop();
			if(head.getData() == i) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
				break;
			}
			head = head.getNext();
		}
		return isPalindrome;
	}
	
	
}


