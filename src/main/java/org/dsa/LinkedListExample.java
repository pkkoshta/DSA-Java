package org.dsa;

public class LinkedListExample {

    private Node head;
    private Node tail;

    public void add(int data){
//        creating new node
        Node newNode = new Node(data);
//        check list if present or not if present then traverse till null else create head
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
//          adding created node to tail node
            tail.nextNode = newNode;
//          making new node as tail node
            tail = newNode;
        }
    }

    public void print(){
       Node currentNode = head;
       if (currentNode == null){
           System.out.println("List is empty");
           return;
       }
       while (currentNode != null){
           System.out.println(currentNode.data);
           currentNode = currentNode.nextNode;
       }

    }
    public void remove(int key){
//  case 1. if key present in head node itself
        Node currentNode = head;
        Node previousNode = null;
        if (currentNode.data == key){
            head = head.nextNode;
            return;
        }
//  case 2. if key present in somewhere else then keep track of prev node and update next node to prev
        while (currentNode != null && currentNode.data != key){
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }
        if (currentNode.data == key){
            previousNode.nextNode = currentNode.nextNode;
        }
        else {
//      case 3. key not present in list.
            System.out.println("Key is not present in list...");
        }

    }

    public void peek(){
        Node currentNode = head;
        if (currentNode != null){
            System.out.println("peek element is "+ currentNode.data);
        }
        else System.out.println("list is empty...");
    }

    public void removeFirst(){
        Node currentNode  = head;
        if (currentNode != null){
            head = currentNode.nextNode;
        }
        else System.out.println("list is empty...");

    }
    public static void main(String[] args) {
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.add(10);
        linkedListExample.add(20);
        linkedListExample.add(30);
        linkedListExample.print();
        System.out.println();
        linkedListExample.remove(20);
//        linkedListExample.remove(30);
//        linkedListExample.remove(10);
//        linkedListExample.peek();
        System.out.println();
        linkedListExample.print();
        System.out.println("remove first element from list...");
        linkedListExample.removeFirst();
        linkedListExample.print();
    }

    class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
            this.nextNode = null;
        }
    }
}

