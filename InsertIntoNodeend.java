


class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next=null;
    }
    
}


public class InsertIntoNodeend {

    static Node insertAtEnd(Node head,int x) {

        Node newNode = new Node(x);

        if(head == null){
            return newNode;
        }

        Node last = head;

        while(last.next != null){
            last = last.next;
        }

        last.next =newNode;


        return head;


        
    }

    static void printList(Node head){
        Node current = head;

        while (current != null){
                   System.out.print(current.data);
                   if(current.next != null){
                        System.out.print(" -> ");
                   }
                current = current.next;
        }
        System.out.println();
     }
    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.next = new Node(2);

        int x = 3;
        head = insertAtEnd(head, x);
        printList(head);
       

    }
}
