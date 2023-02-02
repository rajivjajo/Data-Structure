package com.bridgelabz.dataStructure.linkedlist;

public class Stack<T> {
    LinkedList<T> list;
    Stack(){
        list = new LinkedList<>();
    }

    public void push(T data){
        list.push(data);
    }
    public void peak(){

        System.out.println("Popped Element : "+list.head.data);
    }

    public void pop(){
        list.pop();
    }

    public void popPeakTillEmpty() {
        while(list.head!=null) {
            peak();
            pop();
            display();
            System.out.print("\n");
        }
        System.out.println("Stack is now Empty");
    }


    public void display() {
        list.display();
    }
}

