package com.learn.datastructures.queue;

import java.util.EmptyStackException;

public class QueueLinkedList {

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(23);
        q.enqueue(12);
        q.display();
        try {
            System.out.println(q.dequeue());
        }

        catch  (Exception e) {
            throw new RuntimeException(e);

        }
        System.out.println("************");
        q.display();

    }
    private Node front;
    private Node rear;

    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next  = null;
        }
    }
    public QueueLinkedList(){
        front = null;
        rear = null;

    }
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(rear == null){
            front = newNode;
            rear = newNode;
        }else{
            rear.next  =newNode;
            rear = newNode;
        }
    }
    public int dequeue() throws Exception{
        if(front == null){
            throw new Exception("Queue is Empty!");

        }
        int data = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return data;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public int peek() throws Exception{
        if(front==null){
            throw new Exception("Queue is empty!");
        }
        return front.data;
    }
    public void display(){
        if(front == null){
            System.out.println("Queue is empty!");
            return;
        }
        Node temp = front;
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
