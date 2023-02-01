package com.bridgelabz.dataStructure.linkedlist;

public class SortedLinkedList <T extends Comparable<T>> {
    Node<T> head;
    Node<T> tail;

    public void sortLinkedlist(T data) {
        Node<T> temp = head;
        Node<T> previousNode = null;
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            while (temp != null && data.compareTo(temp.data) > 0) {
                previousNode = temp;
                temp = temp.next;
            }

            if (previousNode == null) {
                newNode.next = head;
                head = newNode;
            } else {
                previousNode.next = newNode;
                newNode.next = temp;
            }
        }
    }
        public String display () {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();
            return null;
        }
    }
