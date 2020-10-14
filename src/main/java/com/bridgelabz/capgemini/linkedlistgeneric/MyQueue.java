package com.bridgelabz.capgemini.linkedlistgeneric;

public class MyQueue {
	private LinkedList myList;

	public MyQueue() {
		myList = new LinkedList();
	}

	public void enqueue(INode myNode) {
		myList.append(myNode);
	}

	public void printQueue() {
		myList.printMyNodes();
		
	}
	public INode top() {
		return myList.getHead();
	}
}
