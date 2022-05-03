public class LSE {
	public Node head = null;

	public void insertAtPos(int pos, int value) {
		Node node = new Node(value);

		if (this.head == null)
			this.head = node;

		if (pos == 0) {
			node.next = head;
			head = node;
		} else {
			Node aux = this.head;

			for (int i = 0; i < pos - 1; i++) {
				aux = aux.next;
			}

			node.next = aux.next;
			aux.next = node;

			while (node.next != null) {
				node = node.next;
			}
		}
	}

	public int search(int pos) {
		Node aux = head;

		for (int i = 0; i < pos; i++) {
			aux = aux.next;
		}

		return aux.info;
	}

	public void removeValue(int info) {
		boolean flag = false;

		// A info buscada � a do primeiro node (head)
		if (head.info == info) {
			head = head.next;
			return;
		}

		Node aux = head;
		// Posicionando o aux
		while (aux.next.info != info && aux.next != null) {
			aux = aux.next;
			// Valor n�o encontrado
			if (aux.next == null) {
				flag = false;
			} else {
				flag = true;
			}
		}

		// "Removendo" o node
		if (flag)
			aux.next = aux.next.next;
	}

	public void removeAtPos(int pos) {
		Node aux = head;

		if (head == null || pos < 0)
			return;

		// Se pos = 0, remover o n� inicial
		if (pos == 0) {
			head = head.next;
			return;
		}

		// Posicionando o aux no n� anterior � posi��o
		// desejada
		for (int i = 0; i < pos - 1; i++) {
			aux = aux.next;
		}

		// "Removendo" o node
		aux.next = aux.next.next;
	}

	public void inserirNoFinal(int valor) {
		// Criando um novo node
		Node novo = new Node(valor);

		// Se a lista está vazia, head será esse novo nó
		if (this.head == null) {
			this.head = novo;
		} else {
			Node aux = this.head;
			// Percorrendo a lista até o último nó
			while (aux.next != null) {
				aux = aux.next;
			}
			// Inserindo o novo nó no final da lista
			aux.next = novo;
		}
	}

	public void printIterativo() {
		Node aux = this.head;

		// Percorrer a lista
		while (aux != null) {
			System.out.print(aux.info + "-");
			aux = aux.next;
		}
	}

	public void printRecursivo(Node auxHead) {
		if (auxHead == null)
			return;
		Node aux = auxHead;
		System.out.print(aux.info + "-");
		printRecursivo(aux.next);
	}
}
