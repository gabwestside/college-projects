
public class Main {
	public Main() {
		Pilha p1 = new Pilha();

		p1.push(20);
		p1.push(33);
		p1.push(72);
		p1.push(36);
		p1.push(25);

		this.removeElement(p1, 33);
		// System.out.println(this.isEquals(p1));
		// this.isEquals(p1);
		// 
		
		this.print(p1);
	}

	public static void main(String[] args) {
		Main main = new Main();
	}

	public Pilha clonar(Pilha p){
		Pilha aux = new Pilha();
		Pilha clone = new Pilha();
		
		while(!p.empty())
			aux.push(p.pop());
		
		while(!aux.empty())
			p.push(aux.pop());
		
		return null;
	}
	
	public void removeElement(Pilha p, int value) {
		Pilha aux = new Pilha();
		
		while (!p.empty()) {
			int t = p.pop();
			
			if (t != value) {
				aux.push(t);
			}
		}
		
		while (!aux.empty()) {
			p.push(aux.pop());
		}
	}
	
	// Verificar se a pilha é um palindromo
	public boolean isEquals(Pilha p) {
		Pilha aux = new Pilha();
		
		if (p.empty() == true)
			return false;
		
		while (p.size() > aux.size()) {
			aux.push(p.pop());
		}
		
		if (aux.size() != p.size())
			aux.pop();
			
		while (!p.empty()) {
			if(p.pop() != aux.pop())
				return false;
		}

		return true;
	}

	// Remover um elemento de determinada posição da pilha
	public void removeElementAtPos(Pilha p, int pos) {
		Pilha aux = new Pilha();

		// Verificando se a pilha está cheia
		if (p.empty())
			return;

		// Verificar se a posição é valida
		if (pos < 0 || pos >= p.size())
			return;

		// Desemplihar os elementos até a posição pos
		while (p.size() > pos) {
			aux.push(p.pop());
		}
		
		aux.pop();
		
		while (aux.empty() != true)
			p.push(aux.pop());
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

		// Retirando o topo da pilha auxiliar
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
