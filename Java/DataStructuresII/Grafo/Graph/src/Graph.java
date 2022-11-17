import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	public ArrayList<Vertex> vertices = new ArrayList<Vertex>();
	public ArrayList<Edge> edges = new ArrayList<Edge>();

	public void addVertex(Vertex vertex) {
		this.vertices.add(vertex);
	}

	public void addEdge(double weight, Vertex from, Vertex to) {
		Edge newEdge = new Edge(weight, from, to);

		from.neighborEdges.add(to);
		to.neighborEdges.add(from);

		this.edges.add(newEdge);
	}

	public void searchWidth(Vertex randomVertex) {
		/*
		 * checkedVertices => marcados
		 */
		ArrayList<Vertex> checkedVertices = new ArrayList<Vertex>();
		/* queue => q */
		Queue<Vertex> queue = new LinkedList<Vertex>();
		/* randomVertex => o */
		queue.add(randomVertex);
		checkedVertices.add(randomVertex);

		while (queue.isEmpty() == false) {
			Vertex visitedVertex = queue.remove();
			System.out.print(visitedVertex.info + "-");

			for (int i = 0; i < visitedVertex.neighborEdges.size(); i++) {
				/*
				 * neighbour => w
				 */
				Vertex neighbour = visitedVertex.neighborEdges.get(i);

				if (!checkedVertices.contains(neighbour)) {
					queue.add(neighbour);
					checkedVertices.add(neighbour);
				}
			}
		}
	}

	public void searchDepth(Vertex randomVertex) {
		ArrayList<Vertex> checkedVertices = new ArrayList<Vertex>();
		Stack<Vertex> stack = new Stack<Vertex>();
		stack.push(randomVertex);
		checkedVertices.add(randomVertex);

		while (stack.isEmpty() == false) {
			Vertex visitedVertex = stack.peek();
			System.out.print(visitedVertex.info + "-");

			for (int i = 0; i < visitedVertex.neighborEdges.size(); i++) {
				Vertex neighbour = visitedVertex.neighborEdges.get(i);

				if (checkedVertices.contains(neighbour)) {
					checkedVertices.add(neighbour);
					stack.push(neighbour);
				} else {
					visitedVertex = stack.pop();
				}
			}
		}
	}

	public void buscaProfundidade(Vertex o) {
		ArrayList<Vertex> marcados = new ArrayList<Vertex>();
		Stack<Vertex> pilha = new Stack<Vertex>();

		pilha.push(o);
		marcados.add(o);

		boolean flag = false;

		while (pilha.isEmpty() == false) {
			Vertex v = pilha.peek();
			Vertex w = null;

			for (int i = 0; i < v.neighborEdges.size(); i++) {
				flag = false;
				w = v.neighborEdges.get(i);

				if (!marcados.contains(w)) {
					flag = true;
					break;
				}
			}

			if (flag) {
				marcados.add(w);
				pilha.push(w);
			} else {
				pilha.pop();
			}

		}
		
		for (int i = 0; i < marcados.size(); i++) {
			Vertex v = marcados.remove(i);
			System.out.println(v.info);
		}
	}
}
