package com.bridgelabz.capgemini.linkedlistgeneric;

public class MyStack {
private LinkedList myList;
	
	public MyStack() {
		myList = new LinkedList();
	}
	
	public void push(INode myNode) {
		myList.addFromFront(myNode);
	}

	public INode peak() {
		return myList.getHead();
	}

	public void printStack() {
		myList.printMyNodes();	
	}

	
	

	
}
