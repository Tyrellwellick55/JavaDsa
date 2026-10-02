class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class InsertIntoNode {

    static Node insertAtFront(Node head,int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
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
    public static void main(String[] args){
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);

            int x = 5;
            head = insertAtFront(head, x);
            printList(head);

    }
}
