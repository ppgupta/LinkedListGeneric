package com.bridgelabz.capgemini.linkedlistgeneric;

import static org.junit.Assert.assertEquals;
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
		myList.printMyNodes();
		
		boolean result=myList.getHead().equals(myThirdNode)
				&& myList.getHead().getNext().equals(mySecondNode)
				&&myList.getTail().equals(myFirstNode);
		assertTrue(result);

    }
  //UC3 test cases
    @Test
    public void given3NumbersShouldBeAddedInLinkedListFromLast() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		LinkedList<Integer>myList=new LinkedList<>();
		myList.append(myFirstNode);
		myList.append(mySecondNode);
		myList.append(myThirdNode);
		myList.printMyNodes();
		boolean result=myList.getHead().equals(myFirstNode)
				&& myList.getHead().getNext().equals(mySecondNode)
				&&myList.getTail().equals(myThirdNode);
		assertTrue(result);
    }
  //UC4 test cases
    @Test
    public void given3NumbersInsertingSecondShouldBeAddedInLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		LinkedList<Integer>myList=new LinkedList<>();
		myList.addFromFront(myFirstNode);
		myList.append(myThirdNode);
		myList.insert(myFirstNode, mySecondNode);
		myList.printMyNodes();
		boolean result=myList.getHead().equals(myFirstNode)
				&& myList.getHead().getNext().equals(mySecondNode)
				&&myList.getTail().equals(myThirdNode);
		assertTrue(result);
    }
    //UC5 test cases
    @Test
    public void given3NumbersDeleteFirstfromInLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		LinkedList<Integer>myList=new LinkedList<>();
		myList.append(myFirstNode);
		myList.append(mySecondNode);
		myList.append( myThirdNode);
		myList.pop();
		myList.printMyNodes();
		boolean result=myList.getHead().equals(mySecondNode)
				&&myList.getTail().equals(myThirdNode);
		assertTrue(result);
    }
  //UC6 test cases
    @Test
    public void given3NumbersDeleteLastfromInLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		LinkedList<Integer>myList=new LinkedList<>();
		myList.append(myFirstNode);
		myList.append(mySecondNode);
		myList.append( myThirdNode);
		myList.popLast();
		myList.printMyNodes();
	
		boolean result=myList.getHead().equals(myFirstNode)
				&&myList.getTail().equals(mySecondNode);
		assertTrue(result);
    }
    //UC7 test cases
    @Test
	public void givenNodeOf30_WhenSearched_ShouldReturnTrue() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		LinkedList<Integer> myList = new LinkedList<Integer>();
		myList.append(myFirstNode);
		myList.append(mySecondNode);
		myList.append(myThirdNode);
		MyNode<Integer> newNode = (MyNode<Integer>) myList.searchNode((Integer) 30);

		
		boolean result =newNode != null && newNode.getData().equals((Integer) 30);

		assertTrue(result);
		myList.printMyNodes();
	}
    //UC8 Test cases
    @Test
	public void given3NumbersInsert40After30InGivenLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		LinkedList<Integer> myList = new LinkedList<Integer>();
		myList.append(myFirstNode);
		myList.append(mySecondNode);
		myList.append(myThirdNode);
		MyNode<Integer> newNode = (MyNode<Integer>) myList.searchNodeAndInsert((Integer) 30, (Integer) 40);

		boolean result =newNode != null && newNode.getNext().getData().equals((Integer) 40);
		assertTrue(result);
		myList.printMyNodes();
	}

  //UC9 Test cases
    @Test
	public void given3NumbersDelete40After30InGivenLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
		MyNode<Integer> myFourthNode = new MyNode<Integer>(70);

		LinkedList<Integer> myList = new LinkedList<Integer>();
		myList.append(myFirstNode);
		myList.append(mySecondNode);
		myList.append(myThirdNode);
		myList.append(myFourthNode);
		MyNode<Integer> newNode = (MyNode<Integer>) myList.searchNode((Integer) 30);
		if (newNode != null)
			myList.deleteNode(newNode);
		assertEquals(3, myList.size());
		myList.printMyNodes();
	}
    
    //UC10 test cases
    @Test
	public void givenNodesInLinkedListShouldBeAddedInAscendingOrder() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
		MyNode<Integer> myFourthNode = new MyNode<Integer>(70);
		LinkedList<Integer> myList = new LinkedList<Integer>();
		myList.addInSortedForm(myFirstNode);
		myList.addInSortedForm(mySecondNode);
		myList.addInSortedForm(myThirdNode);
		myList.addInSortedForm(myFourthNode);
		boolean check = myList.getHead().equals(mySecondNode)
				&& myList.getHead().getNext().equals(myThirdNode)
				&& myList.getHead().getNext().getNext().equals(myFirstNode)
				&& myList.getTail().equals(myFourthNode);
		assertTrue(check);
		myList.printMyNodes();
	}

    

}
