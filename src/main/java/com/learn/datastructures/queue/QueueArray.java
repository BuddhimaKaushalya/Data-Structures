package com.learn.datastructures.queue;

public class QueueArray {

    public static void main(String[] args) {
        QueueArray q = new QueueArray(10);
        q.insert(12);
        q.insert(34);
        q.insert(5);
        System.out.println(q.peek());
        q.delete();
        System.out.println(q.delete());


    }
    private final int  maxSize;
    private final int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public QueueArray(int size){
        this.maxSize = size;
        this.queueArray = new int[size];
        front= 0;
        rear = -1;
        currentSize = 0;
    }

    public void insert(int item){
        if(isQueueFull()){
            System.out.println("Queue is full!");
            return;
        }
        if(rear == maxSize-1){
            rear =-1;
        }
        queueArray[++rear] = item;
        currentSize++;
        System.out.println("Item added to queue " + item);

    }
    public int delete(){
        if(isQueueEmpty()){
            throw new RuntimeException("Queue is EMpty!");
        }
        int temp = queueArray[front++];
        if(front == maxSize){
            front = 0;
        }
        currentSize--;
        return temp;
    }
    public int peek(){
        return queueArray[front];
    }


    public boolean isQueueFull(){
        return (maxSize == currentSize);
    }
    public boolean isQueueEmpty(){
        return (currentSize==0);
    }

}
