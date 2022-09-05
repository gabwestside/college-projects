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
		if(value == root.info) {
			return root;
		}
		if(value < root.info) {
			return buscar(root.left, value);
		}
		else {
			return buscar(root.right, value);
		}
	}
	
}