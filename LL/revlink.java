import java.util.*;
public class revlink{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void add(int data){
        Node newNode =new Node(data); 
        newNode.next=head;
        head=newNode;

    }
    public void print(){
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    
    }
    public void iAtf(int data){
        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;

        

    }
    public static void main(String[] args){
        revlink rel = new revlink();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){

        int data=sc.nextInt();
        rel.add(data);


        }
        rel.print();
        




    }
}
