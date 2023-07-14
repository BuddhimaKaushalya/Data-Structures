package com.learn.datastructures.stack;

import java.util.EmptyStackException;

public class StackLinkedList {
    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(5);
        s.push(56);
        s.push(67);
        s.display();
        System.out.println("*****");
        System.out.println( s.peek());
    }
    private Node top;

    private static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void StackArray(){
        top = null;
    }
    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top  =newNode;
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value  = top.data;
        top = top.next;
        return value;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        while(current != null){
            System.out.println(current.data+ " ");
            current = current.next;
        }
        System.out.println();
    }
}
