package com.btc;

public class DoublyLinkedList {

private Node First;
private Node Last;
private String data;

public DoublyLinkedList() {
	this.First=null;
	this.Last=null;
}
public boolean isEmpty() {
	return First==null;
}
public void insertFirst(int data) {
	Node newNode =new Node();
	newNode.data=data;
	if(isEmpty()) {
		Last=newNode;	
	}
	else {
		First.previous=newNode;
	}
	newNode.next=First;
	this.First=newNode;
}
public void insertLast(int data) {
	Node newNode = new Node();
	newNode.data=data;
	if(isEmpty()) {
		First=newNode;
	}
	else {
		Last.next=newNode;
	}
	newNode.previous=Last;
	Last = newNode;
}
public Node DeleteFirst() {
	Node temp = new Node();
	if(First.next==null) {
		Last=null;
	}
	else {
		First.next.previous=null;
	}
	First=First.next;
	return temp;
}
public void displayNode() {
	System.out.println("["+data+"]");
	
}
	
	
	
	
}
