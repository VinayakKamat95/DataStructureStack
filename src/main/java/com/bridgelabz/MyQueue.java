package com.bridgelabz;

public class MyQueue {
    private final MyLinkedList myLinkedList;
    //Queue() create object of Linked List
    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enqueue(MyNode newNode) {
        myLinkedList.append(newNode);
    }

    public void printQueue() {
        if(myLinkedList.size() == 0){
            System.out.println("Stack Empty");
        }
        myLinkedList.printMyNodes();
    }
}
