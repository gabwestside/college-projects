public class Main {
    public Main() {
        Pilha p = new Pilha();

        p.push(10);
        p.push(12);
        p.push(14);

        this.print(p);
    }

    public static void main(String[] args) {
        Main app = new Main();
    }

    public void print(Pilha p) {
        Pilha aux = new Pilha();

        while (p.empty() == false) {
            aux.push(p.pop());
        }

        while (aux.empty() == false) {
            System.out.print(aux.top() + "-");
            p.push(aux.pop());
        }
    }
}
