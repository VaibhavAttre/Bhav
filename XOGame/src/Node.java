public class Node{
	
	public int data;
	public Node next;
	public Node prev;
	
	public Node (int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	public Node() {
		// TODO Auto-generated constructor stub
	}

	public Node head = null;
	public Node tail = null;

	public void setHead(int x) {
		Node a = new Node(x);
		a.next = head;
		head = a;
	}

	public void insertNode (Node prev_node, int new_data) {
		if (prev_node == null)
        {
            System.out.println("no");
            return;
        }
 
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
	}
	
	public void setNode (int x) {
		Node a = new Node (x);
		if (head == null) {
			head = tail = a;
			head.prev = null;
			tail.next = null;
			
		} else {
			tail.next = a;
			tail = a;
			a.prev = tail;
			tail.next = null;
		}
	}
	
	public void displayH() {
		System.out.println(head.data);
	}
	
	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("NA");
		} else {
			while (current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
	
	public void displayB() {
		Node current = tail;
		if (tail == null) {
			System.out.println("NA");
		} else {
			while (current != head) {
				System.out.println(current.data);
				current = current.prev;
			}
		}
	}
	
	public Node getNode () {
		return this.next;
	}
}