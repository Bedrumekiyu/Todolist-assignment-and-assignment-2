package search;
// 4 Searching a Node in a Singly Linked List
public class Node {
	 
	
	    int data;
	    Node next;
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();

	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);
	        list.insert(5);

	        System.out.println("Original list:");
	        list.display();

	        int target = 3;
	        Node foundNode = list.searchNode(target);

	        if (foundNode != null) {
	            System.out.println("Node with data " + target + " found in the list.");
	        } 
	        else {
	            System.out.println("Node with data " + target + " not found in the list.");
	        }
	    }

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList {
	    Node head;

	    public LinkedList() {
	        this.head = null;
	    }

	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	    }

	    public Node searchNode(int target) {
	        Node temp = head;
	        while (temp != null) {
	            if (temp.data == target) {
	                return temp;
	            }
	            temp = temp.next;
	        }
	        return null;
	    }

	    public void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	 
	}
	/*In a linked list, a node's class indicates its value.
    SearchNode, show, and insert methods are all part of the LinkedList class.
    In case a node with a certain value is found in the linked list, the searchNode method returns null; otherwise, it returns the node.
   Through the addition of elements to the list and a search for a particular node, the main method tests the functionality.
    In a Java environment, you may run this code and view the results.*/
	   
