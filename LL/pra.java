public class pra{
    static class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
    }
    node head;
    public void add(int data){
        node newNode= new node(data);
        newNode.next=head;
        head=newNode;

    }
    public void pri(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        pra p=new pra();
        p.add(12);
        p.add(21);
        p.pri();

    }
}

public class SinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // 1. Insert at beginning
    public void insertFirst(int data) {
        Node newNode = new Node(data);  
        newNode.next = head;
        head = newNode;
    }

    // 2. Insert at end
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 3. Insert at index
    public void insertAtIndex(int data, int index) {
        if (index == 0) {
            insertFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) return;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4. Delete at beginning
    public void deleteFirst() {
        if (head == null) return;
        head = head.next;
    }


    // 5. Delete at end
    public void deleteLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // 6. Delete at index
    public void deleteAtIndex(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null || temp.next == null) return;
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // 7. Delete nth node from end
    public void deleteNthFromEnd(int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy, slow = dummy;
        for (int i = 0; i < n; i++) {
            if (fast.next == null) return;
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        head = dummy.next;
    }

    // 8. Traverse / print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 9. Find middle node
    public void printMiddle() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow != null)
            System.out.println("Middle: " + slow.data);
    }

    // 10. Reverse list (iterative)
    public void reverse() {
        Node prev = null, current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // 11. Reverse print without modifying list
    public void reversePrint(Node node) {
        if (node == null) return;
        reversePrint(node.next);
        System.out.print(node.data + " -> ");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);

        list.printList();
        list.insertFirst(5);
        list.insertAtIndex(25, 3);
        list.printList();

        list.deleteFirst();
        list.deleteLast();
        list.deleteAtIndex(2);
        list.printList();

        list.printMiddle();
        list.reverse();
        list.printList();

        System.out.print("Reverse Print: ");
        list.reversePrint(list.head);
        System.out.println("null");

        list.deleteNthFromEnd(2);
        list.printList();
    }
}
