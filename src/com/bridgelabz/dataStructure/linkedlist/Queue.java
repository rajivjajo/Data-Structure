package com.bridgelabz.dataStructure.linkedlist;

public class Queue <T>{
    LinkedList<T> linkedList;
    Queue(){
        linkedList = new LinkedList<>();
    }

    public void enqueue(T data) {
        linkedList.append(data);
    }
    public void dequeue() {
        System.out.println("\nDequeued Element is : "+linkedList.head.data);
        linkedList.pop();
    }
    public void display(){
        linkedList.display();

    }

}
