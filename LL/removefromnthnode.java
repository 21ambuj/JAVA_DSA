
import java.util.Scanner;

public class removefromnthnode{
    static class node{
        int data;
        node next;
        
        node(int data){
            this.data=data;
        }
        node(int data,node next){
            this.data=data;
            this.next=next;
        }
    }
    node head;
    public void insert(int data){
        node newNode=new node(data);
        if(head==null){
            head=newNode;
        }
        else{
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        }
    }
    public node rev(int index){
        
         node dummy=new node(0,head);
        node fast=dummy;
        node slow=dummy;
        for(int i=0;i<=index;i++){
            if(fast==null){
                System.out.println("index out of bound");
                return head;
            }
            fast=fast.next;


        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;
        return dummy.next;
    }
    public void pri(node newhead){
        node temp=newhead;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        removefromnthnode r=new removefromnthnode();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] data=new int[n];
        for(int i=0;i<n;i++){
            data[i]=sc.nextInt();
            r.insert(data[i]);
        }
        int index=sc.nextInt();
        node newhead= r.rev(index);
        r.pri(newhead);
        
    }

}