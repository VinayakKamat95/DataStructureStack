package com.bridgelabz;

public class MyStack {

    private final MyLinkedList myLinkedList;

    //MyStack() create object of Linked List
    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    //push() push given Element in Stack by using Add method of Linked List
    public void push(INode<Integer> newNode) {
        myLinkedList.add(newNode);
    }

    //printStack() Display Nodes of Stack using printMyNodes method of Linked List
    public void printStack() {
        myLinkedList.printMyNodes();
    }

    //peak() peak first Element in Stack by using head field of Linked List
    public INode peak() {
        return myLinkedList.head;
    }
}
