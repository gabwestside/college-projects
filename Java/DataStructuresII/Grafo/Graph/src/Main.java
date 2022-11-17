
public class Main {

	public static void main(String[] args) {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);

		Graph graph = new Graph();

		graph.addVertex(v1);
		graph.addVertex(v2);
		graph.addVertex(v3);
		graph.addVertex(v4);

		graph.addEdge(5, v1, v2);
		graph.addEdge(9, v1, v3);
		graph.addEdge(8, v1, v4);
		graph.addEdge(10, v3, v4);

		
		System.out.println("searchDepth");
		graph.buscaProfundidade(v1);
		
		
	}

}
