package com.bridgelabz.capgemini.linkedlistgeneric;

public class LinkedList<E extends Comparable> {
	
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
	public INode searchNodeAndInsert(E targetelement, E newData) {
		INode newNode = new MyNode(newData);
		INode tempNode = head;
		INode retNode = null;
		while (tempNode.getNext() != null) {
			if (tempNode.getData().equals(targetelement))
				retNode = tempNode;
			tempNode = tempNode.getNext();
		}
		insert(retNode, newNode);
		return retNode;
	}
	
	public void deleteNode(INode newNode) {
		INode temp = head;
		while (temp.getNext() != newNode) {
			temp = temp.getNext();
		}
		temp.setNext(newNode.getNext());
	}

	public int size() {
		INode tempNode = head;
		int count = 0;
		while (tempNode != null) {
			count++;
			tempNode = tempNode.getNext();
		}
		return count;
	}
	public void addInSortedForm(INode customNode) {
		if (head == null) {
			head = customNode;
			tail = customNode;
		} else {
			INode tempNode = head;
			INode prevNode = null;
			while (((Comparable) customNode.getData()).compareTo(tempNode.getData()) > 0 && tempNode.getNext() != null) {
				prevNode = tempNode;
				tempNode = tempNode.getNext();
			}
			if (prevNode == null) {
				if (((Comparable) tempNode.getData()).compareTo(customNode.getData()) > 0) {
					customNode.setNext(tempNode);
					head = customNode;
				} else {
					INode temp = head.getNext();
					head.setNext(customNode);
					customNode.setNext(temp);
				}
			}

			else {
				if (((Comparable) tempNode.getData()).compareTo(customNode.getData()) > 0) {
					prevNode.setNext(customNode);
					customNode.setNext(tempNode);
				} else {
					tempNode.setNext(customNode);
					tail = customNode;
				}
			}

		}
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
