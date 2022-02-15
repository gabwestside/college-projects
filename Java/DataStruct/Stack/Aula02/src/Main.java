
public class Main {
	public Main() {
		Pilha p1 = new Pilha();

		p1.push(45);
		p1.push(36);
		p1.push(72);
		p1.push(80);

		this.removeElement(p1, 36);
		this.print(p1);
	}

	public static void main(String[] args) {
		Main main = new Main();
	}

	public void removeElement(Pilha p, int element) {
		Pilha aux = new Pilha();

		// Verificando se a pilha está cheia
		if (p.empty() == true)
			return;

		while (p.empty() == false) {
			aux.push(p.pop());
		}
		
		// Reempilhando a p a partir da aux
		while (aux.empty() == false) {
			if (element == aux.pop()) {
				p.push(aux.pop());
			}
		}

	}

	public void replaceElement(Pilha p, int element, int pos) {
		Pilha aux = new Pilha();

		// Verificando se a pilha está cheia
		if (p.empty() == true)
			return;

		// Verificar se a posição é valida
		if (pos < 0 || pos >= p.size())
			return;

		// Desemplihar os elementos até a posição pos
		while (p.size() > pos) {
			aux.push(p.pop());
		}

		// Empilhar o elemento recebido
		p.push(element);

		// Rettirando o topo da pilha auxiliar
		aux.pop();

		// Reempilhando a p a partir da aux
		while (aux.empty() == false) {
			p.push(aux.pop());
		}
	}

	// Incluir determinado elemento na minha pilha:
	public void insertElemnent(Pilha p, int element, int pos) {
		Pilha aux = new Pilha();

		// Verificando se a pilha está cheia
		if (p.full() == true)
			return;

		// Verificar se a posição é valida
		if (pos < 0 || pos > p.size())
			return;

		// Desemplihar os elementos até a posição pos
		while (p.size() > pos) {
			aux.push(p.pop());
		}

		// Empilhar o elemento recebido
		p.push(element);

		// Reempilhando a p a partir da aux
		while (aux.empty() == false) {
			p.push(aux.pop());
		}
	}

	public void print(Pilha p) {
		Pilha aux = new Pilha();

		while (p.empty() == false) {
			aux.push(p.pop());
		}

		while (aux.empty() == false) {
			System.out.print(aux.top() + "-");
			p.push(aux.pop());
		}
	}
}
