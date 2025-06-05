package assignments;


class LinkedList {
    Node head;
    
    class Node{
    	int data;
    	Node next;
    	Node(int val)
    	{
    		data=val;
    		next=null;
    	}
    }

   
    LinkedList() {
        head = null;
    }

   
   public void insert(int data) {
        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
        if(head==null)
        	head=newNode;
        else
        {
        	newNode.next=head;
        	head=newNode;
        }
        
    }

    
   public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = head.next;

        while (current != null) {
            next = current.next; 
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev; 
    }

   
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }
        System.out.println();
    }
}



public class ReversedLinkedList {
	
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original linked list:");
        list.print();

        list.reverse();

        System.out.println("Reversed linked list:");
        list.print();
		
	}

}

