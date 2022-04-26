public class LSE {
	public Node head = null;

	public void inserirNoFinal(int valor) {
		Node novo = new Node(valor);

		if (this.head == null) {
			this.head = novo;
		} else {
			Node aux = this.head;
			
			while (aux.next != null) {
				aux = aux.next;
			}
			
			aux.next = novo;
		}
	}

	public void print() {
		Node aux = this.head;

		while (aux != null) {
			System.out.print(aux.info + "-");
			aux = aux.next;
		}
	}
	
	public void printRecursivo(Node auxHead) {
		if(auxHead == null) return;
		
		Node aux = auxHead;
		
		System.out.print(aux.info + "-");
		
		printRecursivo(aux.next);
	}
}
