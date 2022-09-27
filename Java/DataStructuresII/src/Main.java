public class Main {
	public static void main(String[] args) {
		BinaryTree t1 = new BinaryTree(10);
		t1.orderInsert(t1.root, 8);
		t1.orderInsert(t1.root, 12);
		t1.orderInsert(t1.root, 11);
		
		BinaryTree t2 = new BinaryTree(10);
		t2.root.left = new Node(12);
		t2.root.left.right = new Node(11);
		t2.root.right = new Node(8);
		
		BinaryTree t3 = new BinaryTree(12);
		t3.root.right = new Node(15);
		
		System.out.println(mirrored(t1.root, t2.root));
	}
	
	public static boolean mirrored(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;
		
		if (root1 == null || root2 == null)
			return false;
		
		if (root1.info == root2.info &&
			mirrored(root1.left, root2.right) &&
			mirrored(root1.right, root2.left))
			return true;
		
		return false;
	}
	
	public static boolean isOrderTree(Node root) {
		if (root.left == null)
			return true;
			
		return false;
	}
}