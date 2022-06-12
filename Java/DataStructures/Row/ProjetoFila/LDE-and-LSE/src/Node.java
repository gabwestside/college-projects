
public class Node {
	public int info;
	public Node next;
	public Node prev;

	public Node() {
		next = null;
		prev = null;
	}

	public Node(int info) {
		this.info = info;
		this.next = null;
		this.prev = null;
	}

}
