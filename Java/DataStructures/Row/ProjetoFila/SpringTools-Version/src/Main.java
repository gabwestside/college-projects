public class Main {
	public Main() {
		LDE lista = new LDE();
		lista.print();
		lista.insertNoFinal(10);
		lista.insertNoInicio(12);
		lista.insertNoFinal(14);
		lista.insertNoInicio(15);	
		lista.print();
		lista.deleteByValue(15);
		lista.print();
	}
	
	public static void main(String[] args) {
		Main app = new Main();
	}

}