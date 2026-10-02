class Node {
        int data;

        Node next;

        Node(int data_1){
            this.data = data_1;
            this.next = null;
        }
    }


public class LinkedList1 {

    public static void traverseList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);

        head.next = new Node(2);
       System.out.println(head.data);
        System.out.println(head.next.data);
       traverseList(head);
    }
}