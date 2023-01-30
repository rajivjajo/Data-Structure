package com.bridgelabz.dataStructure.linkedlist;

public class LinkedList <T>{
    Node<T> head;
    Node<T> tail;
    public void push(T data){
        Node<T> newNode = new Node(data);
        if ( head == null ){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display(){
        Node<T> temp = head;
        while ( temp != null ){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
}
