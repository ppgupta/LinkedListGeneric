package com.bridgelabz.capgemini.linkedlistgeneric;

public class LinkedList<E> {
	
	private INode head;
	private INode tail;

	public INode getHead() {
		return head;
	}

	public void setHead(INode head) {
		this.head = head;
	}

	public INode getTail() {
		return tail;
	}

	public void setTail(INode tail) {
		this.tail = tail;
	}

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	
	
}
