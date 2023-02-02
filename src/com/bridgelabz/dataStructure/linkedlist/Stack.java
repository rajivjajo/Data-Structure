package com.bridgelabz.dataStructure.linkedlist;

public class Stack<T> {
    LinkedList<T> list;
    Stack(){
        list = new LinkedList<>();
    }

    public void push(T data){
        list.push(data);
    }

    public void display() {
        list.display();
    }
}

