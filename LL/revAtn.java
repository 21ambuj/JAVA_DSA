import java.util.*;
public class revAtn{
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }

    }
    node head;
    void insert(int data){
        node newNode=new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void rev(int n){
        if(head==null || n==0) return;
        node curr=head,prev=null,temp=null;
        node tail=head;
        int count=0;
        while(curr!=null && n>count){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            count++;
        }
        tail.next=curr;
        head=prev;
    }
    void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        revAtn re=new revAtn();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            re.insert(arr[i]);


        }
        int r=sc.nextInt();
        re.rev(r);
        re.print();

        

    }
}