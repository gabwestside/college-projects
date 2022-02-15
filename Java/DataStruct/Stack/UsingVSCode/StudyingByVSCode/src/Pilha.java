public class Pilha {
    // Atributos (privados)
    private int capacidade = 500;
    private int vetor[] = new int[capacidade];
    private int t = -1;

    // Métodos (públicos)
    public int size() {
        return t + 1;
    }

    public void push(int elemento) {
        if (size() < capacidade) {
            vetor[++t] = elemento;
        }
    }

    public int pop() {
        if (!empty()) {
            return vetor[t--];
        } else {
            return -1;
        }
    }

    public int top() {
        if (!empty()) {
            return vetor[t];
        } else {
            return -1;
        }
    }

    public boolean empty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
