
public class SingleLL {

	public static void main(String[] args) {
		Node a = new Node();
		
		//appends nodes to singly linked list
		a.setNode(1);
		a.setNode(2);
		//Node n1 = a.getNode();
		a.insertNode(a.head.next, 8);
		a.setNode(3);
		a.display();
		
		//changes head node
		//a.displayH();
		//a.setHead(5);
		//a.displayH();
	}

}
