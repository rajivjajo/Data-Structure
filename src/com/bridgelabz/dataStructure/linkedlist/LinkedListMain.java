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

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.push(56);
        linkedList2.push(30);
        linkedList2.push(70);
        linkedList2.display();
        System.out.println(linkedList2.popLast()+" is popped from last !");
        linkedList2.display();

        LinkedList<Integer> linkedList3 = new LinkedList();
        linkedList3.push(70);
        linkedList3.push(30);
        linkedList3.push(56);

        linkedList3.display();
        if (linkedList3.search(40) == null)
            System.out.println("Element not found!!");
        else
            System.out.println("Element Found!!");

        boolean isInserted = linkedList3.insertAfter(30, 30);
        if (isInserted)
            System.out.println("Element inserted successfully!!");
        else
            System.out.println("Element not inserted!!");

        linkedList3.display();

    }
}
