import java.util.ArrayList;
import java.util.PriorityQueue;

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

	public void searchWidth() {
		ArrayList<Vertex> checkedVertices = new ArrayList<Vertex>();
		PriorityQueue queue = new PriorityQueue();
		queue.add(this.vertices.get(1));

		while (queue.isEmpty() == false) {
			Vertex visitedVertex = (Vertex)queue.remove();
			System.out.println(visitedVertex.info);
			for (int i = 0; i < visitedVertex.neighborEdges.size(); i++) {
				queue.add(visitedVertex.neighborEdges.get(i));
			}
		}
	}
}
