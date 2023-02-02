package com.bridgelabz.dataStructure;

import com.bridgelabz.dataStructure.linkedlist.LinkedList;

public class Queue <T>{
    LinkedList<T> linkedList;
    Queue(){
        linkedList = new LinkedList<>();
    }

    public void enqueue(T data) {
        linkedList.push(data);
    }

    public void pop() {
        System.out.println("\nPopped Element is : "+linkedList.head.data);
        linkedList.pop();
    }

    public void display(){
        linkedList.display();
    }
}
