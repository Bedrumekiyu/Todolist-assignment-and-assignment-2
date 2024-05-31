package stack;
//5 Implementing a Stack Using Linked Lists
public class Node {
	
	    int data;
	    Node next;
	    public static void main(String[] args) {
	        Stack stack = new Stack();

	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        
	        stack.display();
	        
	        System.out.println("Top element of the stack: " + stack.peek());
	        
	        System.out.println("Popped element: " + stack.pop());
	        
	        stack.display();
	    }

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class Stack {
	    Node top;

	    public Stack() {
	        this.top = null;
	    }

	    public void push(int data) {
	        Node newNode = new Node(data);
	        if (top == null) {
	            top = newNode;
	        } else {
	            newNode.next = top;
	            top = newNode;
	        }
	        System.out.println(data + " pushed to the stack");
	    }

	    public int pop() {
	        if (top == null) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        int poppedData = top.data;
	        top = top.next;
	        return poppedData;
	    }

	    public int peek() {
	        if (top == null) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        return top.data;
	    }

	    public void display() {
	        Node temp = top;
	        System.out.print("Stack: ");
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	
	}
	/* The linked list's nodes are represented by the node class.
        To perform stack operations using linked lists, the Stack class includes push, pop, peek, and display methods.
        To add an element to the top of the stack, use the push method.
        Using the pop method, the element at the top of the stack is removed and returned.
        Without deleting it, the peek method returns the element at the top of the stack.
       Pushing components onto the stack, peering at the top element, popping an element, and showing the contents of the stack are the steps taken in the main method to verify the functioning of the Stack class.
      The output of this code can be seen by running it in a Java environment*/


