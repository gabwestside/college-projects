import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

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

	public void buscaLargura(Vertice o) {
		ArrayList<Vertice> marcados = new ArrayList<Vertice>();
		Queue<Vertice> queue = new LinkedList<Vertice>();
		queue.add(o);
		marcados.add(o);

		while (queue.isEmpty() == false) {
			Vertice vertice = queue.remove();
			System.out.print(vertice.info + "-");

			for (int i = 0; i < vertice.adjacentes.size(); i++) {
				Vertice w = vertice.adjacentes.get(i);

				if (!marcados.contains(w)) {
					queue.add(w);
					marcados.add(w);
				}
			}
		}

	}
}
