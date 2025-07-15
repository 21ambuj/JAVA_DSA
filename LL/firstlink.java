public class firstlink{
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
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;


    }
    public void delete(){
        System.out.println("element removed");
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        head=head.next;
    }
    public void deletelast(){
        if(head==null){
            System.out.println("list is empty");

        }
        if(head.next==null){
            head=null;
            return;
        }
        node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }


    public void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->\n");
            temp=temp.next;
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
    }
    public static void main(String[] args){
        firstlink fl=new firstlink();
        fl.add(10);
        fl.add(20);
        fl.add(30);
        fl.add(40);
        fl.add(50);
        fl.print();
        fl.delete();
        fl.print();
        fl.deletelast();
        fl.print();
        fl.rev();
        fl.print();

        
    }
}
