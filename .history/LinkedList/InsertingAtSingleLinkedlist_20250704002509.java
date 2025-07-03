
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedList{
    Node head,tail;
    public void insert(int data){
        Node n=new Node(data);
        if(head==null){ //first node
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }
    public void display(){
        if(head==null){
            System.out.print("empty value");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public void insertBeg(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    public void insertAtPos(int pos,int data){
        Node n=new Node(data);
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
            n.next=temp.next;
            temp.next=n;
        }
    }
}

public class InsertingAtSingleLinkedlist {
    
}
