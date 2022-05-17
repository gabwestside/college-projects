public class LDE {
	public Node head;
	public Node tail;

	public LDE() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;
	}

	//Inserindo em uma posicao indicada
	public void insertAtPos(int i, int pos) {
		Node novo = new Node(i);
		
		Node aux = head;
		
		while (aux.next != tail) {
			aux = aux.next;
		}
		
		// needs to implements
		/*
			novo.prev = aux;
			aux.next.prev = novo;
			novo.next = aux.next;
			aux.next = novo;
			aux.prev.next = aux.next;
			aux.next.prev = aux.prev;
		*/
	}
	
	public void removeAtPos(int pos) {
		int tam = size();
		
		if (tam == 0 || pos < 0 || pos >= tam) return; //throw new Error("Invalid operation.");
		
		Node aux = head.next;
		
		for (int i = 0; i < tam; i++) {
			aux = aux.next;
		}
		
		aux.prev.next = aux.next;
		aux.next.prev = aux.prev;
	}
	
	public void deleteByValue(int info) {
		int size = size();
		
		if(size == 0) throw new Error("This row does not exists.");
		
		Node aux = head;
		
		for (int i = 0; i < size; i++) {
			aux = aux.next;
			
			if (aux.info == info) {
				aux.prev.next = aux.next;
				aux.next.prev = aux.prev;
			}
		}
	}
	
	//Inserindo no final da lista
	public void insertNoFinal(int i) {
		Node novo = new Node(i);
		novo.next = tail;		//Depois do novo vem o tail
		tail.prev.next = novo;	//Depois do anterior do tail vem o novo
		novo.prev = tail.prev;	//Antes do novo vem quem vinha antes do tail
		tail.prev = novo;		//Antes da tail vem o novo
	}
	
	public int size() {
		int size = 0;
		Node aux = head.next;
		
		while(aux != tail) {
			aux = aux.next;
			size++;
		}
		
		return size;
	}

	//Inserindo no in�cio da lista
	public void insertNoInicio(int i) {
		Node novo = new Node(i);
		novo.prev = head;		//Antes do novo vem a head
		head.next.prev = novo;	//Antes do posterior do head vem o novo
		novo.next = head.next;	//Depois do novo vem quem vinha depois do head
		head.next = novo;		//Depois da head vem o novo
	}
	
	public void print() {
		Node aux = head.next;
		while(aux != tail) {
			System.out.print(aux.info + "-");
			aux =  aux.next;
		}
		System.out.println("");
	}
}
