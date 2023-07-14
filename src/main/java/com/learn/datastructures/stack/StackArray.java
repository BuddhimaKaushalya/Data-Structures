package com.learn.datastructures.stack;


import java.util.EmptyStackException;


public class StackArray {
    private final int[] data;
    private int top;

    public StackArray (int capacity ){
        this.data = new int[capacity];
        this.top = -1;
    }
    public void push(int value){
        if(top == data.length -1){
            throw new StackOverflowError("Stack is full!");
        }
        top++;
        data[top] = value;
    }
    public int pop(){
        if(top == -1)
            throw new EmptyStackException();
        return data[top--];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == data.length-1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        for(int i =top; i>=0;i--){
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }
    public int peek(){
        if(this.isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }else{
            return this.data[this.top];
        }
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        // Pushing elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Displaying the stack
        System.out.println("Stack elements:");
        stack.display();

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Displaying the stack after popping
        System.out.println("Stack elements after popping:");
        stack.display();

        // Peeking at the top element of the stack
        System.out.println("Peeked element: " + stack.peek());

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Checking if the stack is full
        System.out.println("Is stack full? " + stack.isFull());

    }

}
