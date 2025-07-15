import java.util.*;
public class rotate{
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next=null;

        }

    }
    node head;
    void rotate(int k){
        if(head==null || k<=0) return;
        node curr=head;
        int count=0;
        while(curr.next!=null){
            curr=curr.next;
            count++;
        }
        curr.next=head;
        k=k%count;
        int step=count-k;
        node newtail=head;
        for(int i=1;i<step;i++){
            newtail=newtail.next;
        }
        node newhead = newtail.next;
        newtail.next=null;
        head=newhead;
        

        
    }
    void pri(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            }
            System.out.println();
    }
    void insert(int data){
        node newNode =new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        else{
        node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newNode;
    }
    }
    public static void main(String[] args){
        rotate rt=new rotate();
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            rt.insert(arr[i]);


        }
        int r=sc.nextInt();
        rt.rotate(r);
        rt.pri();
        
    }

}