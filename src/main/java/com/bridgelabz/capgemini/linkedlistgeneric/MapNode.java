package com.bridgelabz.capgemini.linkedlistgeneric;

public class MapNode<E,V> implements INode<E> {
	private E key;
	private V value;
	private MapNode<E,V> next;
	
	
	public MapNode(E key, V value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	@Override
	public E getData () {
		return key;
	}
	
	@Override
	public void setData(E key) {
		this.key = key;
	}

	@Override
	public INode<E> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<E> next) {
		this.next = (MapNode<E, V>) next;
	}
	
	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{"+"K=").append(key).append(" V=").append(value).append('}');
		if(next!=null)
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();
	}

}
