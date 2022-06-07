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

		LDE l1 = new LDE();
		l1.insertNoFinal(15);
		l1.insertNoFinal(17);
		l1.insertNoFinal(13);

		LDE l2 = new LDE();
		l2.insertNoFinal(12);
		l2.insertNoFinal(18);
		l2.insertNoFinal(14);

		LDE l3 = new LDE();
		l3 = this.sectionList(l1, l2);
		l3.print();

		LDE l4 = new LDE();
		LDE l5 = new LDE();
		LDE l6 = new LDE();
		l6.insertNoFinal(12);
		l6.insertNoFinal(15);
		l6.insertNoFinal(18);
		l6.insertNoFinal(14);
		l6.insertNoFinal(17);
		l6.insertNoFinal(13);
		l6.insertNoFinal(10);

		this.includeList(l6, l4, l5);

		l4.print();
		l5.print();
	}

	public void includeList(LDE l1, LDE l2, LDE l3) {
		Node aux = l1.head;
		Node aux2 = l1.head.next;

		while (aux != l1.tail) {
			l2.insertNoFinal(aux.info);
			l3.insertNoFinal(aux2.info);
			aux = aux.next;
			aux2 = aux2.next;
		}
	}

	public LDE sectionList(LDE l1, LDE l2) {
		Node aux1 = l1.head.next;
		Node aux2 = l2.head.next;

		LDE l3 = new LDE();

		while (aux1 != l1.tail) {
			l3.insertNoFinal(aux1.info);
			l3.insertNoFinal(aux2.info);
			aux1 = aux1.next;
			aux2 = aux2.next;
		}

		return l3;
	}

	public static void main(String[] args) {
		Main app = new Main();
	}

}