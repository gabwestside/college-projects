public class BinaryTree {
	Node root = null;

	BinaryTree() {
	}

	BinaryTree(int value) {
		root = new Node(value);
	}

	void orderInsert(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return;
		}

		if (value < root.info) {
			if (root.left == null) {
				root.left = new Node(value);
				root.left.parent = root;
			} else {
				orderInsert(root.left, value);
			}
		} else {
			if (root.right == null) {
				root.right = new Node(value);
				root.right.parent = root;
			} else {
				orderInsert(root.right, value);
			}
		}
	}

	Node buscar(Node root, int value) {
		if (value == root.info) {
			return root;
		}
		if (value < root.info) {
			return buscar(root.left, value);
		} else {
			return buscar(root.right, value);
		}
	}

	Node maximum(Node root) {
		while (root.right != null) {
			root = root.right;
		}

		return root;
	}

	Node minimum(Node root) {
		while (root != null) {
			root = root.right;
		}

		return root;
	}

	Node sucessor(Node root) {
		Node rootTree = new Node();

		if (root.right != null)
			return minimum(root.right);

		rootTree = rootTree.parent;

		while (rootTree.info < root.info) {
			root = rootTree;
			rootTree = rootTree.parent;
		}

		rootTree = rootTree.parent;

		return rootTree;
	}

	Node remove(int value) {
		Node node = buscar(root, value);

		if (node.right == null && node.left == null) {
			if (node.info > node.parent.info) {
				node.parent.right = null;
			} else {
				node.parent.left = null;
			}
		}
		
		if (node.right == null || node.left == null) {
			if (node.info > node.parent.info) {
				if (node.left == null) {
					node.parent.right = node.right;
					node.right.parent = node.parent;
				} else {
					node.parent.right = node.left;
					node.left.parent = node.parent;
				}
			} else {
				if (node.right == null) {
					node.parent.left = node.left;
					node.left.parent = node.parent;
				} else {
					node.parent.left = node.right;
					node.right.parent = node.parent;
				}
			}
		}
		
		// needs to implements, to finish this exercise
		remove(value);	
		
		return node;
	}

}