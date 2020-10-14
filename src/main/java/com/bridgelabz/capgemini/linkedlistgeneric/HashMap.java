package com.bridgelabz.capgemini.linkedlistgeneric;

import java.util.ArrayList;

public class HashMap<E extends Comparable<E>,V extends Comparable<V>> {

	private final int numBuckets;
	ArrayList<LinkedList<E>> myBucketArray;

	public HashMap() {
		this.numBuckets = 10;
		this.myBucketArray = new ArrayList<>(10);
		
		//to ensure there is an empty LinkedList
		for (int i = 0; i < numBuckets; i++) {
			myBucketArray.add(null);
		}
	}
	
	

	
	public V get(E key) {
		if(key==null)
			return null;
		int index = this.getBucketIndex(key);
		LinkedList<E> myList = this.myBucketArray.get(index);
		if(myList==null)
			return null;
		MapNode<E,V> myMapNode = (MapNode<E, V>) myList.searchNode(key);
		return (myMapNode==null)?null:myMapNode.getValue();
	}

	private int getBucketIndex(E key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode%numBuckets;
		System.out.println("Key: "+key+" hashcode: "+hashCode+" index: "+index);
		return index;
	}

	public void add(E key, V value) {
		int index = getBucketIndex(key);
		LinkedList<E> myList = this.myBucketArray.get(index);
		if(myList==null) {
			myList = new LinkedList<>();
			myBucketArray.set(index,myList);
		}
		MapNode<E,V> myMapNode = (MapNode<E, V>) myList.searchNode(key);
		if(myMapNode==null) {
			myMapNode = new MapNode<>(key,value);
			myList.append((INode)myMapNode);
		}
		else
			myMapNode.setValue(value);
	}
	
	@Override
	public String toString() {
		return "MyLinkedListHashMap List{"+myBucketArray+'}';
	}
   
}
