public class App {

	public App() {
		LSE lista = new LSE();
		lista.inserirNoFinal(12);
		lista.inserirNoFinal(15);
		lista.inserirNoFinal(26);
		lista.inserirNoFinal(32);
		lista.printRecursivo(lista.head);
		System.out.println();
		// System.out.println(lista.lenght(lista));
		// lista.insertAtPos(1, 20);
		// lista.printIterativo();
		// System.out.println();
		// System.out.println(lista.lenght(lista));

		// lista.insertAfterNode(12, 40);
		// lista.printIterativo();

		// System.out.println();
		// lista.removeAfterNode(20);
		// lista.printIterativo();

		lista.switchPos(0);
		lista.printIterativo();
	}

	public static void main(String[] args) throws Exception {
		App app = new App();
	}
}
