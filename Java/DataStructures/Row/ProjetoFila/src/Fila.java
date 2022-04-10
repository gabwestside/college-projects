public class Fila {
	private int capacidade = 100;
	private int vetor[] = new int[capacidade];
	private int fim = 0;	//cauda (final da fila)
	private int ini = 0;	//frente (início da fila)
	private int tam = 0;

	public int size(){ return tam; }

	public boolean empty(){ return (tam == 0); }

	public boolean full(){ return (tam == capacidade); }

	public int front() {
		if (!empty()) return vetor[ini];
		return -1;
	}

	public void enqueue(int elem){
		if (size() < capacidade) {
			vetor[fim] = elem;
			fim = (fim+1) % capacidade;
			tam++;
		}
	}

	public int dequeue() {
		if(!empty()) {
			int valor = vetor[ini];
			ini = (ini+1) % capacidade;
			tam--;
			return valor;
		}
		return -1;
	}
}
