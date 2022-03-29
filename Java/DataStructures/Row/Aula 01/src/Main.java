
public class Main {
	
	public Main(){
		Row r = new Row();
		
		r.enqueue(22);
		r.enqueue(30);
		r.enqueue(41);
		r.enqueue(50);
		r.enqueue(60);
		
		r.print();
	}
	
	public void removeDuplicateElem(Row row) {
		Row aux = new Row();
		int front = aux.front();
	}
	
	public Row orderFusion(Row r1, Row r2, Row r3) {
		Row r4 = new Row();
		
		int count1 = 0, count2 = 0, count3 = 0;
		
		int front1 = r1.front();
		int front2 = r2.front();
		int front3 = r3.front();
		
		while (count1 < r1.size() && count2 < r2.size() && count3 < r3.size()) {
			
			// Encontrando o menor comparando ao front de r1 e alocando na Row 4
			if (r1.front() < r2.front() && r1.front() < r3.front()) {
				r4.enqueue(front1);
				r1.enqueue(r1.dequeue());
				count1++;
			}
			else if (r2.front() < r1.front() && r2.front() < r3.front()) {
				r4.enqueue(front2);
				r2.enqueue(r2.dequeue());
				count2++;
			}
			else{
				r4.enqueue(front3);
				r3.enqueue(r3.dequeue());
				count3++;
			}
		}
		
		// 
		if (count1 == r1.size()) {
			
		}
		
		return r4;
	}
	
	/* Construa um metodo para remover um elemento de
	 * determinada posicao pos (ordem => 1a, 2a, 3a...)
	 * da Row, onde p e passado como argumento para o
	 * metodo. */
	public void removerElemento(Row f, int ordem) {
		if(f.empty()) return;
		if(ordem < 1 || ordem > f.size()) return;
		
		int tam = f.size();
		for(int i = 0; i < tam; i++) {
			if(i+1 == ordem) {
				f.dequeue();
			}
			else  {
				f.enqueue(f.dequeue());				
			}
		}
	}
	
	//Incluir um elemento em determinada posicao da Row
	public void inserirElemento(Row f, int elem, int ordem) {
		if(f.full()) return;
		if(ordem < 1 || ordem > f.size()) return;
		
		int tam = f.size();
		for(int i = 0; i < tam; i++) {
			if(i+1 == ordem) {
				f.enqueue(elem);
			}
			f.enqueue(f.dequeue());
		}
	}
	
	//Imprimir os valores da Row
	public void print(Row f) {
		int tam = f.size();
		for(int i = 0; i < tam; i++) {
			int valor = f.dequeue();
			System.out.print(valor + "-");
			f.enqueue(valor);
		}
	}
	

	public static void main(String[] args) {
		Main app = new Main();
	}	
}