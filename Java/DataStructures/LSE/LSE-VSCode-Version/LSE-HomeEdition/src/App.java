public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
    }

    
	public App() {
		LSE lista = new LSE();
		lista.inserirNoFinal(12);
		lista.inserirNoFinal(15);
		lista.inserirNoFinal(26);
		lista.inserirNoFinal(32);
		lista.printRecursivo(lista.head);
	}
}
