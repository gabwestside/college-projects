
public class Main {

	public static void main(String[] args) {
		/*
		 * Vertex v1 = new Vertex(1);
		 * Vertex v2 = new Vertex(2);
		 * Vertex v3 = new Vertex(3);
		 * Vertex v4 = new Vertex(4);
		 * 
		 * Graph graph = new Graph();
		 * 
		 * graph.addVertex(v1);
		 * graph.addVertex(v2);
		 * graph.addVertex(v3);
		 * graph.addVertex(v4);
		 * 
		 * graph.addEdge(5, v1, v2);
		 * graph.addEdge(9, v1, v3);
		 * graph.addEdge(8, v1, v4);
		 * graph.addEdge(10, v3, v4);
		 * 
		 * System.out.println("searchDepth");
		 * graph.buscaProfundidade(v1);
		 */

		Vertice v1 = new Vertice(1);
		Vertice v2 = new Vertice(2);
		Vertice v3 = new Vertice(3);
		Vertice v4 = new Vertice(4);

		Grafo grafo = new Grafo();
		grafo.adicionarVertice(v1);
		grafo.adicionarVertice(v2);
		grafo.adicionarVertice(v3);
		grafo.adicionarVertice(v4);

		grafo.adicionarAresta(5, v1, v2);
		grafo.adicionarAresta(9, v1, v3);
		grafo.adicionarAresta(8, v1, v4);
		grafo.adicionarAresta(10, v3, v4);

		grafo.buscaProfundidade(v1);// buscaLargura(v1);
	}
}
