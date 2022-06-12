
public class LDE {
	public Node head;
	public Node tail;

	public LDE() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;
	}

	public void removeAtPos(int pos) {
		int lenght = size();

		if (pos == 0 || pos > lenght)
			return;

		Node aux = head.next;
		for (int i = 0; i < pos; i++) {
			aux = aux.next;
		}
		
		aux.prev.next = aux.next;
		aux.next.prev = aux.prev;

	}

	public void insertAtPos(int info, int pos) {
		int lenght = size();

		if (pos < 0 || pos > lenght)
			return;

		Node aux = head;
		for (int i = 0; i < pos; i++) {
			aux = aux.next;
		}

		Node node = new Node(info);
		node.next = aux.next;
		node.prev = aux.prev;
		aux.next.prev = node;
		aux.next = node;
	}

	public void insertAtFinal(int value) {
		Node node = new Node(value);
		node.next = tail;
		node.prev = tail.prev;
		tail.prev.next = node;
		tail.prev = node;
	}

	public int size() {
		int tam = 0;
		Node aux = head.next;
		while (aux != tail) {
			aux = aux.next;
			tam++;
		}
		return tam;
	}

	public boolean isEmpty() {
		if (head.next == tail)
			return true;
		return false;
	}

	public void print() {
		Node aux = head.next;
		while (aux != tail) {
			System.out.print(aux.info + "-");
			aux = aux.next;
		}
		System.out.println("");
	}
}
