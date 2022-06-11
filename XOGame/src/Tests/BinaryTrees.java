package Tests;

public class BinaryTrees {

	Node root;
	
	BinaryTrees (int key) {
		root = new Node(key);
	}
	
	BinaryTrees() {
		root = null;
	}
	
	public static void printTree(Node root) {
		if (root == null) {
			return;
		}
		printTree(root.left);
		
		printTree(root.right);
		System.out.println(root.data);
		
	}
	
	public static void minimax(int depth, boolean player) {
		if (depth == 0) {
			return;
		}
		if (player) {
			int maxEval = Integer.MIN_VALUE;
			/*for(Node : tree.root) {
				
			}*/
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTrees tree = new BinaryTrees();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		
		printTree(tree.root);
	}
    /* 4 becomes left child of 2
    		1
		/       \
	   2         3
    /   \       /  \
	4    null  null  null
		/   \
       null null
*/

}
