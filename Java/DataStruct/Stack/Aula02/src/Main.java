
public class Main {
	public Main() {
		Pilha p1 = new Pilha();

		p1.push(45);
		p1.push(36);
		p1.push(72);

		this.print(p1);
	}

	public static void main(String[] args) {
		Main main = new Main();
	}

	public void NoName() {

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
