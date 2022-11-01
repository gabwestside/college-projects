
public class Edge {
	public double weight;
	public Vertex from;
	public Vertex to;
	
	public Edge() {
	}
	
	public Edge(double weight, Vertex from, Vertex to) {
		this.weight = weight;
		this.from = from;
		this.to = to;
	}
}
