
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

	public static void main(String[] args) {
		Main app = new Main();
	}
	
}