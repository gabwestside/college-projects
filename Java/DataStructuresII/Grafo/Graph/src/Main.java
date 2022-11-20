
public class Main {

	public static void main(String[] args) {

		Vertex tej = new Vertex(1);
		Vertex jua = new Vertex(2);
		Vertex pen = new Vertex(3);
		Vertex ita = new Vertex(4);
		Vertex umi = new Vertex(5);
		Vertex uru = new Vertex(6);
		Vertex tur = new Vertex(7);

		Graph graph = new Graph();

		graph.addVertex(tej);
		graph.addVertex(jua);
		graph.addVertex(pen);
		graph.addVertex(ita);
		graph.addVertex(umi);
		graph.addVertex(uru);
		graph.addVertex(tur);

		graph.addEdge(4, tej, jua);
		graph.addEdge(6, tej, pen);
		graph.addEdge(9, tej, uru);
		graph.addEdge(9, jua, pen);
		graph.addEdge(7, jua, ita);
		graph.addEdge(11, jua, umi);
		graph.addEdge(7, jua, tur);
		graph.addEdge(8, pen, ita);
		graph.addEdge(5, pen, umi);
		graph.addEdge(12, pen, uru);
		graph.addEdge(5, ita, umi);
		graph.addEdge(3, ita, uru);
		graph.addEdge(13, ita, tur);
		graph.addEdge(3, umi, uru);
		graph.addEdge(7, umi, tur);
		graph.addEdge(2, uru, tur);

		System.out.println("busca em largura:");
		graph.searchWidth(tej);
		System.out.println("\n---------");

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

		System.out.println("busca em profundidade:");
		grafo.buscaProfundidade(v1);
	}
}
