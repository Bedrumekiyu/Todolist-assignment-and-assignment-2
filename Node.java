package ass;
// 1,Inserting a Node at Any Given Position in a Singly Linked List:
public class Node {
	 int data;
	    Node next;

    public static void main(String[] args) {
        LinkedList bag = new LinkedList();
        bag.insertAtPos(1, 34);
        bag.insertAtPos(2, 59);
        bag.insertAtPos(3, 8);
        bag.insertAtPos(4, 14);
        bag.insertAtPos(5, 34);
        bag.insertAtPos(6, 59);
        bag.insertAtPos(7, 87);
        bag.insertAtPos(8, 15);

        System.out.print("Linked list before insert: ");
        bag.printList();

        int data = 47, pos = 7;
        bag.insertAtPos(pos, data);
        System.out.print(" After insertion of 47 at position 7: ");
        bag.printList();
        
         data = 22;
         pos = 8;
         bag.insertAtPos(pos, data);
        System.out.print(" After insertion of 47 at position 7: ");
        bag.printList();


        data = 6;
        pos = 4;
        bag.insertAtPos(pos, data);
        System.out.print(" After insertion of 6 at position 4: ");
        bag.printList();

        data = 23;
        pos = 2;
        bag.insertAtPos(pos, data);
        System.out.print(" After insertion of 23 at position 2: ");
        bag.printList();
    }
   
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    // Insert a node at the specified position
    public void insertAtPos(int pos, int data) {
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid place");
            return;
        }

        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
        }
        else {
            Node current = head;
            for (int i = 1; i < pos - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}



