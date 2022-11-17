import java.util.ArrayList;
import java.util.PriorityQueue;

public class Grafo {
	public ArrayList<Vertice> vertices = new ArrayList<Vertice>();
	public ArrayList<Aresta> arestas = new ArrayList<Aresta>();

	public void adicionarVertice(Vertice vertice) {
		this.vertices.add(vertice);
	}

	public void adicionarAresta(double peso, Vertice org, Vertice dst) {
		Aresta novaAresta = new Aresta(peso, org, dst);
		org.adjacentes.add(dst);
		dst.adjacentes.add(org);
		this.arestas.add(novaAresta);
	}

	public void buscaLargura() {
		ArrayList<Vertice> marcados = new ArrayList<Vertice>();
		PriorityQueue q = new PriorityQueue();
		q.add(this.vertices.get(1));

		while (q.isEmpty() == false) {
			Vertice v = (Vertice) q.remove();
			System.out.println(v.info);
			for (int i = 0; i < v.adjacentes.size(); i++) {
				q.add(v.adjacentes.get(i));
			}
		}

	}
}
