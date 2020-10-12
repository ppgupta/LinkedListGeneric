package com.bridgelabz.capgemini.linkedlistgeneric;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LinkedListTest 
{
    /**
     * Rigorous Test :-)
     */
	//UC1 test case
    @Test
    public void given3NumbersShouldBeAddedInLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		
		boolean result=myFirstNode.getNext().equals(mySecondNode)
				&& myFirstNode.getNext().getNext().equals(myThirdNode);
		assertTrue(result);

    }
    //UC2 test cases
    @Test
    public void given3NumbersShouldBeAddedInLinkedListFromFrontTest() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		LinkedList<Integer>myList=new LinkedList<>();
		myList.addFromFront(myFirstNode);
		myList.addFromFront(mySecondNode);
		myList.addFromFront(myThirdNode);
		
		
		boolean result=myList.getHead().equals(myThirdNode)
				&& myList.getHead().getNext().equals(mySecondNode)
				&&myList.getTail().equals(myFirstNode);
		assertTrue(result);

    }
}
