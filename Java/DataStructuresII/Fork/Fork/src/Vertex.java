import java.util.ArrayList;

public class Vertex {
	public int info;
	public ArrayList<Vertex> neighborEdges = new ArrayList<Vertex>();

	public Vertex() {
	}
	
	public Vertex(int info) {
		this.info = info;
	}
	
}