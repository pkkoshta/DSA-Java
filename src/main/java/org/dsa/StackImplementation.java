package org.dsa;

import java.util.Arrays;

public class StackImplementation {
    private int top = -1;
    private int[] arr = new int[5];

    public void push(int element){
        if (top < 100){
            top++;
            arr[top] = element;
        }else throw new RuntimeException("Stack is full");

    }

    private int pop(){
        if (top != -1){
          int topELe = arr[top];
          top--;
          return topELe;
        }
        else throw new RuntimeException("Stack is full");
    }

    private int peek(){
        if (top != -1){
            return arr[top];
        }
        return -1;
    }

    private void printStack(){
        if (top != -1){
            for (int i = top; i >= 0 ; i--) {
                System.out.println(arr[i]);
            }
        }else System.out.println("Stack is empty...");
    }

    public static void main(String[] args) {
        StackImplementation stackImplementation = new StackImplementation();
        stackImplementation.push(10);
        stackImplementation.push(20);
        stackImplementation.push(30);
        stackImplementation.printStack();
        System.out.println("Peek element is:: "+ stackImplementation.peek());
        stackImplementation.pop();
        System.out.println("after element pop ");
        stackImplementation.printStack();


    }
}
