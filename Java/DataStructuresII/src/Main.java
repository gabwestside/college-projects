public class Main {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(14);
		tree.orderInsert(tree.root, 15);
		tree.orderInsert(tree.root, 12);
		System.out.print(tree.root.left.info + "-");
		System.out.print(tree.root.info + "-");
		System.out.print(tree.root.right.info);
		tree.buscar(tree.root, 12);
	}
}