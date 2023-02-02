package com.bridgelabz.dataStructure.linkedlist;

public class Queue <T>{
    LinkedList<T> linkedList;
    Queue(){
        linkedList = new LinkedList<>();
    }

    public void enqueue(T data) {
        linkedList.append(data);
    }
    public void display(){
        linkedList.display();
    }

}
