package com.bridgelabz.capgemini.linkedlistgeneric;



	public interface INode<E > {
		E getData();
		void setData(E data);
		
		INode<E> getNext();
		void setNext(INode<E> next);
	}
   
