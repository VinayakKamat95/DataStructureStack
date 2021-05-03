package com.bridgelabz;

public class MyQueue {
    private final MyLinkedList myLinkedList;
    //Queue() create object of Linked List
    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    //enqueue() add given Element in Queue by using append method of Linked List
    public void enqueue(MyNode newNode) {
        myLinkedList.append(newNode);
    }

    //printQueue() Display Nodes of Queue using printMyNodes method of Linked List
    public void printQueue() {
        if(myLinkedList.size() == 0){
            System.out.println("Queue Empty");
        }
        myLinkedList.printMyNodes();
    }

    //dequeue() Delete Nodes of Queue using pophead method of Linked List
    public void dequeue() {
        myLinkedList.popHead();
    }
}
