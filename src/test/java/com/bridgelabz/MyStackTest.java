package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {

    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        Assert.assertEquals(myThirdNode, peak);
    }

    @Test
    public void numbersWhenPopFromStackShouldPassedTheResult() {
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        int size = myStack.size();
        while(!myStack.peak().getNext().equals(0)){
            myStack.pop();
            myStack.printStack();
        }
        myStack.pop();
        System.out.println(size);
        Assert.assertEquals(null, size);
    }
}
