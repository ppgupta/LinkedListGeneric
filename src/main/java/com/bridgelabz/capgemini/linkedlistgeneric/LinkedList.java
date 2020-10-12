package com.bridgelabz.capgemini.linkedlistgeneric;

public class LinkedList<E> {
	
	private INode head;
	private INode tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
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
	public void addFromFront(INode Node) {
		if (head == null)
			head = Node;
		if (tail == null)
			tail = Node;
		else {
			INode tempNode = head;
			head = Node;
			Node.setNext(tempNode);
		}
	}
	
	//Append from last
	public void append(INode Node) {
		if (head == null) {
			head = Node;
			tail = Node;
		} 
		else {
			tail.setNext(Node);
			tail = Node;
		}
	}
//insert nodes
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	public INode pop() {
		INode tempNode = head;
		head = head.getNext();
		return tempNode;
	}
	public INode popLast()  {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}
	public INode searchNode(E element) {
		if(head==null||tail==null)
			return null;
		INode tempNode = head;
		INode ptr = null;
		while (tempNode.getNext() != null) {
			if (tempNode.getData().equals(element))
				ptr = tempNode;
			tempNode = tempNode.getNext();
		}
		return ptr;
	}
	//print nodes of linked list
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getData());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getData());
		System.out.println(myNodes);
	}
	
	
	
}
