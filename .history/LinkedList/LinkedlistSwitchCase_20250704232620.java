import java.util.Scanner;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
class LinkedList {
    Node head, tail;

    public void adddata(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void addposition(int pos, int data) {
        Node n = new Node(data);
        if (pos == 0) {
            insertAtBeginning(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            n.next = temp.next;
            temp.next = n;
        } else {
            System.out.println("Invalid position");
        }
    }

    public void insertAtBeginning(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
        if (tail == null) tail = n;
    }
    public void display() {
        if (head == null) {
            System.out.println("Empty linked list");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public void displaythrough(int dis){
        Node temp=head;
        for (int i = 0; i < dis && temp != null; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void lastnode(){
        Node temp=tail;
        System.out.print(temp.data);
    }
    public void displayspecific(int poss){
        Node temp=head;
        for(int i=0;i<poss-1;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);
        
    }
}
public class LinkedlistSwitchCase {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        LinkedList list = new LinkedList();
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Insert at End");
            System.out.println("2. Insert at Position");
            System.out.println("3. Insert at Beginning");
            System.out.println("4. Display");
            System.out.println("5.Display to specific position");
            System.out.println("6:Display Last Node");
            System.out.println("7:Display specific position");
            int input = n1.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Enter count: ");
                    int count=n1.nextInt();
                    for(int i=0;i<count;i++){
                        int addInput = n1.nextInt();
                        list.adddata(addInput);
                    }
                    break;

                case 2:
                    System.out.print("Enter position: ");
                    int pos = n1.nextInt();
                    System.out.print("Enter value to be added: ");
                    int val = n1.nextInt();
                    list.addposition(pos, val);
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    int val1 = n1.nextInt();
                    list.insertAtBeginning(val1);
                    break;

                case 4:
                    list.display();
                    break;
                case 5:{
                    System.out.print("Enter through");
                    int dis=n1.nextInt();
                    list.displaythrough(dis);
                }
                case 6:{
                    list.lastnode();
                }
                case 7:{
                    System.out.println("Enter which position to print");
                    int poss=n1.nextInt();
                    list.displayspecific(poss);
                }
            }
        }
    }
}
