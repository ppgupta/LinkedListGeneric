package com.bridgelabz.capgemini.linkedlistgeneric;

public class HashMap<E extends Comparable<E>,V extends Comparable<V>> {

	private LinkedList<E> LinkedList;

	public HashMap() {
		this.LinkedList = new LinkedList<>();
	}

	public V get(E key) {
		MapNode<E, V> myMapNode = (MapNode) this.LinkedList.searchNode(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(E key, V value) {
		MapNode<E, V> myMapNode = (MapNode) this.LinkedList.searchNode(key);
		if (myMapNode == null) {
			myMapNode = new MapNode<>(key,value);
			LinkedList.append(myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}
	}
	
	@Override
	public String toString() {
		return "MyHashMapNodes{"+LinkedList+'}';
	}
   
}
