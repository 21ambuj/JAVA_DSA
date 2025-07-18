public class add{
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node head;
    public void input(int data){
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
    public void add(){
        int sum=0;
        node temp=head;
        while(temp!=null){
            sum=10*sum+temp.data;

            temp=temp.next;

        }
        System.err.println(sum);

    }
    
    public static void main(String[] args){
        add ad=new add();
        ad.input(2);
        ad.input(1);
        ad.input(3);
        ad.input(4);
        ad.input(6);
        ad.add();
    }
    

}