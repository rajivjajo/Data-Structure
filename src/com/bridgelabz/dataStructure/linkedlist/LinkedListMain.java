package com.bridgelabz.dataStructure.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList =  new LinkedList<>();
        linkedList.push(56);
        linkedList.push(30);
        linkedList.push(70);
        linkedList.search(30);
        linkedList.insertAfter(30,30);

        linkedList.display();
    }
}
