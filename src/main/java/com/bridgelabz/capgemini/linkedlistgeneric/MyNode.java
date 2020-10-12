package com.bridgelabz.capgemini.linkedlistgeneric;

public class MyNode<E > implements INode<E> {
	private E data;
	private INode next;
	
	public INode getNext() {
		return next;
	}
	public void setNext(INode next) {
		this.next = next;
	}
	public MyNode(E data) {
		this.data = data;
		this.next = null;
	}
	@Override
	public E getData() {
		return data;
	}
	@Override
	public void setData(E data) {
		this.data = data;
	}
}
