package bedn;
//2 Deleting a Node at Any Given Position in a Singly Linked List:
 class Node {
	    int data;
	    Node next;
	 public static void main(String[] args) {
	        LinkedList box = new LinkedList();
	        box.insertAtPos(1, 45);
	        box.insertAtPos(2, 65);
	        box.insertAtPos(3, 8);
	        box.insertAtPos(4, 110);

	        System.out.print(" before deletion the LinkedList is -> ");
	        box.printList();

	        int posToDelete = 4;
	        box.deleteAtPosition(posToDelete);
	        System.out.print(" after deleting node at position ->" + posToDelete +":" );
	        box.printList();
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

	    // put a node at the specified position
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

	    // removing  node at the specified position
	    public void deleteAtPosition(int pos) {
	        if (pos < 1 || pos > size) {
	            System.out.println("Invalid place");
	            return;
	        }

	        if (pos == 1) {
	            head = head.next;
	        } 
	        else {
	            Node prev = head;
	            for (int i = 1; i < pos - 1; i++) {
	                prev = prev.next;
	            }
	            Node current = prev.next;
	            prev.next = current.next;
	            current = null; // clean the  memory
	        }
	        size--;
	    }

	    // view the linked list
	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }	    
	}


