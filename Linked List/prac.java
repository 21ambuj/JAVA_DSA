import java.util.*;
public class prac{
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
    node newNode=new node(data);
    newNode.next=head;
    head=newNode;
    
    }
    public void pri(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void del(){
        if(head==null){
            return;
        }
        head=head.next;
        
        

    }
    public void dfl(){
       if(head==null || head.next==null){
        head=null;
        return;
       }
       node temp=head;
       while(temp.next.next!=null){
          temp=temp.next;
       }
       temp.next=null;


    }
    public void ial(int data){
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
    public void danp(int index){
        if(index==0){
            del();
            return;
        }
        node temp=head;
        for(int i=0;i<index-1;i++){
            if(temp==null || temp.next==null){
                temp=temp.next;
                return;

            }
        }
            if(temp.next!=null){
                temp.next=temp.next.next;
            

        }


    }
     public void rev(){
        node curr=head, prev=null,temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
        
    }
    public static void main(String[] args){
        prac p=new prac();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            p.add(arr[i]);

        }
        p.pri();
        p.del();
        p.pri();
        p.dfl();
        p.pri();
        p.ial(21);
        p.ial(21);
        p.pri();
        p.danp(3);
        p.pri();
        p.rev();
        p.pri();


       
    }
}