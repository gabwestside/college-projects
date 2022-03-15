
public class Row {
	private int capacity = 100;
	private int vetor[] = new int[capacity];
	private int end = 0;	//cauda (final da fila)
	private int start = -1;	//frente (startcio da fila)
	private int lenght = 0;

	public int size(){ return lenght; }

	public boolean empty(){ return (lenght == 0); }

	public boolean full(){ return (lenght == capacity); }

	public int front() {
		if (!empty()) return vetor[start];
		return -1;
	}

	public void enqueue(int elem){
		if (size() < capacity) {
			vetor[end] = elem;
			end = (end+1) % capacity;
			lenght++;
		}
	}

	public int dequeue() {
		if(!empty()) {
			int valor = vetor[start];
			start = (start+1) % capacity;
			lenght--;
			return valor;
		}
		return -1;
	}
	
	public void print() {
		int tam = size();
		for(int i = 0; i < tam; i++) {
			int elemento = dequeue();
			System.out.print(elemento);
			enqueue(elemento);
		}
	}
}