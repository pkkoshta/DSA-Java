package org.dsa.linkedList.list;


public class CustomLinked {

    ListNode head;

    public void add(int data){
        ListNode node = new ListNode(data);
        if (head == null){
            head = node;
            return;
        }
            ListNode currentNode = head;
            while (currentNode.next != null){
               currentNode = currentNode.next;
            }
            currentNode.next = node;
    }

    public void printList(){
        ListNode currentNode = head;
        if (currentNode == null){
            System.out.println("List is empty");
            return;
        }
        while (currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void displayList(ListNode head1){
        ListNode currentNode = head1;
        if (currentNode == null){
            System.out.println("List is empty");
            return;
        }
        while (currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void length(){
        ListNode currentNode = head;
        int count = 0;
        if (currentNode == null){
            System.out.println("List is empty");
            return;
        }
        while (currentNode != null){
            count++;
            currentNode = currentNode.next;
        }
        System.out.println(count);
    }

    public void insertNodeFirst(int data){
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }

    public void deleteFirstNode(){
       if (head == null){
           return;
       }
        head = head.next;
    }

    public void insertSpecificLocation(int data, int loc){
        ListNode newNode = new ListNode(data);
        ListNode currentNode = head;
        ListNode prevNode = head;

        while (currentNode.next != null && currentNode.data != loc){
           currentNode =  currentNode.next;
        }
         prevNode.next = newNode;
         newNode.next = currentNode;
    }

    public void deleteLastNode(){
        if(head == null || head.next == null){
            head = null;
            return;
        }
        ListNode currentNode = head;
        ListNode prevNode = null;

        while (currentNode.next != null){
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        prevNode.next = null;
    }

    public void deleteSpecificPositionNode(int position){
        if (head == null || head.next == null){
            head = head.next;
            return;
        }else {
            int count = 1;
            ListNode prevNode = head;
            while (count < position - 1){
                prevNode = prevNode.next;
                count++;
            }
            ListNode currentNode = prevNode.next;
            prevNode.next = currentNode.next;
        }
    }
    private static  class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next  = null;
        }
    }
    public static void main(String[] args) {
        CustomLinked customLinked = new CustomLinked();
        customLinked.add(10);
        customLinked.add(10);
        customLinked.add(20);
        customLinked.add(30);
        customLinked.add(30);
        customLinked.add(40);
//        customLinked.insertNodeFirst(30);
//        customLinked.insertSpecificLocation(40, 20);
//        customLinked.printList();
//        System.out.println("Length of the list :");
//        customLinked.length();
//        customLinked.deleteFirstNode();
//        System.out.println();
//        customLinked.printList();
//        customLinked.deleteFirstNode();
//        System.out.println();
//        customLinked.printList();
//        customLinked.deleteFirstNode();
//        System.out.println();
//        customLinked.printList();
        customLinked.printList();

//        customLinked.deleteLastNode();
//        System.out.println("deleted 40");
//        customLinked.printList();
//        System.out.println("deleting 20");
//        customLinked.deleteSpecificPositionNode(2);
//        customLinked.printList();
//      searching data
//        int data = customLinked.searchData(20);
//        System.out.println("element found :"+ data);
//        ListNode node = customLinked.reverseList();
//        customLinked.displayList(node);
        System.out.println();
        ListNode middleNode = customLinked.findMidleNodeOfList();
        System.out.printf("middle Node :"+ middleNode.data);
        System.out.println();
        ListNode nThNode = customLinked.findTheNthNode(3);
        System.out.printf("Nth Node of the list :"+ nThNode.data);
        System.out.println();
        System.out.println("Find Nth node of end of the list :"+ customLinked.findNthElementFromEndOfList(3).data);
        customLinked.removeDuplicateElement();
        System.out.println("Removed duplicate element from the list :");
        customLinked.printList();

        System.out.println("Assign new node in sorted list :");
        customLinked.assignNewNodeToSortedList(25);
        customLinked.printList();
        System.out.println("Delete key node: ");
        customLinked.deleteBasedOnKey(20);
        customLinked.printList();

    }

    private void deleteBasedOnKey(int data) {
        ListNode currentNode = head;
        if (currentNode != null && currentNode.data ==data){
            head = currentNode.next;
            return;
        }
        ListNode prevNode = head;
        while (currentNode != null && currentNode.data != data){
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode == null){
            return;
        }
        prevNode.next = currentNode.next;
    }

    private void assignNewNodeToSortedList(int data) {
        ListNode newNode = new ListNode(data);
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next.data < data){
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    private void removeDuplicateElement() {
        if (head == null){
            return;
        }
        ListNode current = head;
        while (current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }

    }

    private ListNode findMidleNodeOfList() {
        if (head == null){
            return null;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;

    }

    private ListNode findTheNthNode(int position){
        if (head == null){
            return null;
        }

        ListNode current = head;
        int count = 1;
        while (current.next != null){
            count++;
            current = current.next;
            if (count == position){
                return current;
            }
        }
        return current;
    }

    private ListNode findNthElementFromEndOfList(int position){
        if (head == null){
            return null;
        }

        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;

        while (count < position){
            count++;
            refPtr = refPtr.next;
        }

        while (refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    private ListNode reverseList() {
        if (head ==null){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private int searchData(int data) {
        ListNode currentNode = head;
        while (currentNode.next != null){
            if (currentNode.data == data){
                return currentNode.data;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }



}
