import java.util.ArrayList;

public class Vertice {
	public int info;
  	public ArrayList<Vertice> adjacentes = new ArrayList<Vertice>();
  	
  	public Vertice() {
  	}
  	
  	public Vertice(int info) {
  		this.info = info;
  	}
}