public class Principal {
	
	public Principal() {
		/*
		 * Fila fila = new Fila(); fila.enqueue(14); fila.enqueue(22); fila.enqueue(46);
		 * fila.enqueue(31); fila.enqueue(19); //int valor = fila.dequeue();
		 * //this.inserirElemento(fila, 58, 1); this.print(fila); System.out.println();
		 * this.removeElem(fila, 14); this.print(fila);
		 */
		
		Fila f1 = new Fila();
		f1.enqueue(15);
		f1.enqueue(19);
		f1.enqueue(20);
		f1.enqueue(25);
		f1.enqueue(26);
		
		Fila f2 = new Fila();
		f2.enqueue(18);
		f2.enqueue(24);
		f2.enqueue(21);
		f2.enqueue(17);
		f2.enqueue(11);
		
		this.print(f1);
		this.print(f2);
		
		System.out.println();
		
		this.switchPosition(f1, f2);
		
		this.print(f1);
		this.print(f2);
	}
	
	public void removeElem(Fila f, int elem) {		
		int length = f.size();
		
		for(int i = 0; i < length; i++) {
			int front = f.dequeue();
			
			if (front != elem) {
				f.enqueue(front);
			}
		}
	}
	
	public void concatFilas(Fila f1, Fila f2) {		
		int tam = f1.size();
		
		for (int i = 0; i < tam; i++) {
			int front1 = f1.dequeue();
			int front2 = f2.dequeue();
			
			if(front1 % 2 == 0 ) {
				f1.enqueue(front1);
			} else 
				f2.enqueue(front1);
			
			if(front2 % 2 == 1 ) {
				f2.enqueue(front2);
			} else 
				f1.enqueue(front2);
		}
	}
	
	public void switchPosition(Fila f1, Fila f2) {		
		int tam = f1.size();
		
		for (int i = 0; i < tam; i++) {
			int front1 = f1.dequeue();
			int front2 = f2.dequeue();
			
			if(i % 2 == 0 ) {
				f1.enqueue(front1);
			} else 
				f2.enqueue(front1);
			
			if(i % 2 == 1 ) {
				f2.enqueue(front2);
			} else 
				f1.enqueue(front2);
		}
	}

	/* Construa um método para remover um elemento de
	 * determinada posição pos (ordem => 1º, 2º, 3º...)
	 * da fila, onde p é passado como argumento para o
	 * método. */
	public void removerElemento(Fila f, int ordem) {
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
	
	//Incluir um elemento em determinada posição da fila
	public void inserirElemento(Fila f, int elem, int ordem) {
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
	
	//Imprimir os valores da fila
	public void print(Fila f) {
		int tam = f.size();
		for(int i = 0; i < tam; i++) {
			int valor = f.dequeue();
			System.out.print(valor + "-");
			f.enqueue(valor);
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		Principal app = new Principal();
	}
}
