
public class LSE {
	public Node head = null;
	
	public void iterativePrint() {
		Node aux = this.head;

		while (aux != null) {
			System.out.print(aux.info + "-");
			aux = aux.next;
		}
	}
	 
	public void recursivePrint(Node auxHead) {
		if (auxHead == null)
			return;
		Node aux = auxHead;
		System.out.print(aux.info + "-");
		recursivePrint(aux.next);
	}
}
