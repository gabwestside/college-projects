public class Aresta {
    public double peso;
    public Vertice origem;
    public Vertice destino;

    public Aresta() {
    }

    public Aresta(double peso, Vertice origem, Vertice destino) {
        this.peso = peso;
        this.origem = origem;
        this.destino = destino;
    }
}