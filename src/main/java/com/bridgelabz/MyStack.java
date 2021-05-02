package com.bridgelabz;

public class MyStack {
    private final MyLinkedList myLinkedList;

    //MyStack() create object of Linked List
    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    //push() push given Element in Stack by using Add method of Linked List
    public void push(INode newNode) {
        myLinkedList.add(newNode);
    }

    //printStack() Display Nodes of Stack using printMyNodes method of Linked List
    public void printStack() {
        if(myLinkedList.size() == 0){
            System.out.println("Stack Empty");
        }
        myLinkedList.printMyNodes();
    }

    //peak() peak first Element in Stack by using head field of Linked List
    public INode peak() {
        if(myLinkedList.head.equals(0)) {
            return null;
        }
        return myLinkedList.head;
    }

    //pop() delete given Element in Stack by using popTail method of Linked List
    public void pop() {
        myLinkedList.popTail();
    }

    //size() will display size of the Stack
    public int size() {
        return myLinkedList.size();
    }
}
