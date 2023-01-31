package com.bridgelabz.dataStructure.linkedlist;

public class LinkedList <T> {
    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void append(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node<T> search(T searchData) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public boolean insertAfter(T insertData, T searchData) {
        Node<T> searchedData = search(searchData);
        if (searchedData != null) {
            Node<T> newNode = new Node(insertData);
            Node<T> nextNode = searchedData.next;
            searchedData.next = newNode;
            newNode.next = nextNode;
            return true;
        }
        return false;
    }

    public T pop() {
        T popData = head.data;
        head = head.next;
        return popData;
    }

    public T popLast() {
        T popData = tail.data;
        Node<T> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popData;

    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public T delete(T popData) {
        Node<T> searchedData = search(popData);
        Node<T> temp = head;
        Node<T> previousNode = null;
        if (searchedData == head) {
            head = temp.next;
        } else {
            while (temp != searchedData) {
                previousNode = temp;
                temp = temp.next;
            }
            previousNode.next = temp.next;
        }
        return popData;
    }
    public void size(){
        Node<T> temp = head;
        int count = 0;
        while ( temp != null){
            temp = temp.next;
            count++;
        }
        System.out.println("Size of linked list is : "+count);
    }
}
