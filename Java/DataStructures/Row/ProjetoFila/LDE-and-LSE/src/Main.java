
public class Main {
	public Main() {
		LDE list = new LDE();
		list.insertAtFinal(10);
		list.insertAtFinal(12);
		list.insertAtFinal(14);
		list.insertAtFinal(16);
		list.print();
		
		list.insertAtPos(15, 3);
		list.print();
		
		list.insertAtPos(9, 0);
		list.print();
		
		list.insertAtPos(17, 6);
		list.print();
		
		list.removeAtPos(5);
		list.print();

	}

	public static void main(String[] args) {
		Main app = new Main();
	}

}
