package com.bridgelabz.capgemini.linkedlistgeneric;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyQueueTest {

	@Test
	public void given3NodesWhenAddedToQueueShouldHaveFirstAddedNode() {
		MyQueue myQueue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		INode myNode = myQueue.top();
		myQueue.printQueue();
		assertEquals(myFirstNode,myNode);
	}
}
