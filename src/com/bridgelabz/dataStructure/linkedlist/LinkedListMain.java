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

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.append(70);
        linkedList1.append(30);
        linkedList1.append(40);
        linkedList1.append(56);
        linkedList1.insertAfter(56,30);
        linkedList1.display();
        System.out.println(linkedList1.pop()+" is popped");
        linkedList1.display();
    }
}
