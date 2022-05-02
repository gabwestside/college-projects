public class LSE {
    public Node head = null;
	
	public void inserirNoFinal(int valor) {
		//Criando um novo node
		Node novo = new Node(valor);
		
		//Se a lista está vazia, head será esse novo nó
		if(this.head == null) {
			this.head = novo;
		}
		else {
			Node aux = this.head;
			//Percorrendo a lista até o último nó
			while(aux.next != null) {
				aux = aux.next;
			}
			//Inserindo o novo nó no final da lista
			aux.next = novo;
		}
	}
	
	public void printIterativo() {
		Node aux = this.head;
		
		//Percorrer a lista
		while(aux != null) {
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
