import java.util.*;
public class reverse{
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
        node newNode = new node(data);
        newNode.next=head;
        head=newNode;
        
    }
    public void rev(){
        node curr=head,prev=null,temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;


    }
    public void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
            
        }

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        reverse re=new reverse();
        int n=sc.nextInt();
        int data[]=new int[n];
        for(int i=0;i<n;i++){
            data[i]=sc.nextInt();
            re.add(data[i]);


        }
        re.rev();
        re.print();


    }
}