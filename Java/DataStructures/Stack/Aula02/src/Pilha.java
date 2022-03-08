
public class Pilha {
	private int capacidade = 50;
	private int vetor[] = new int[capacidade];
	private int topo = -1;

	public void push(int elemento) {
		if (this.size() < capacidade) {
			vetor[++topo] = elemento;
		}
	}

	public int pop() {
		if (this.empty() == false) {
			return vetor[topo--];
		}
		return -1;
	}

	public int size() {
		return topo + 1;
	}

	public int top() {
		return vetor[topo];
	}

	public boolean empty() {
		if (this.size() == 0) {
			return true;
		}
		return false;
	}
	
	public boolean full() {
		if (this.size() == capacidade) {
			return true;
		}
		return false;
	}
	
	public int capacity() {
		return capacidade;
	}
}
