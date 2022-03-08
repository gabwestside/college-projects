public class Main {
    public Main() {
        Pilha p = new Pilha();

        p.push(80);
        p.push(72);
        p.push(75);
        p.push(80);

        Pilha p1 = new Pilha();

        p1.push(1);
        p1.push(3);
        p1.push(5);

        Pilha p2 = new Pilha();

        p2.push(2);
        p2.push(4);
        p2.push(6);

        this.intertpoleStack(p1, p2);

        System.out.println(this.isEquals(p));
        // this.removeElement(p1, 36);
        this.print(p);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Pilha intertpoleStack(Pilha p1, Pilha p2) {
        Pilha union = new Pilha();

        if (!p1.empty() && !p2.empty())
            return union;

        while (!p1.empty() && !p2.empty()) {
            union.push(p1.pop());
            union.push(p2.pop());
        }

        System.out.println(union);
    }

    // Verificar se a pilha é um palindromo
    public boolean isEquals(Pilha p) {
        Pilha aux = new Pilha();

        if (p.empty() == true)
            return false;

        while (p.size() > aux.size()) {
            aux.push(p.pop());
        }

        if (aux.size() != p.size())
            aux.pop();

        while (!p.empty()) {
            if (p.pop() != aux.pop())
                return false;
        }

        return true;
    }

    // Remover um elemento de determinada posição da pilha
    public void removeElement(Pilha p, int pos) {
        Pilha aux = new Pilha();

        // Verificando se a pilha está cheia
        if (p.empty())
            return;

        // Verificar se a posição é valida
        if (pos < 0 || pos >= p.size())
            return;

        // Desemplihar os elementos até a posição pos
        while (p.size() > pos) {
            aux.push(p.pop());
        }

        aux.pop();

        while (aux.empty() != true)
            p.push(aux.pop());
    }

    public void replaceElement(Pilha p, int element, int pos) {
        Pilha aux = new Pilha();

        // Verificando se a pilha est� cheia
        if (p.empty() == true)
            return;

        // Verificar se a posi��o � valida
        if (pos < 0 || pos >= p.size())
            return;

        // Desemplihar os elementos at� a posi��o pos
        while (p.size() > pos) {
            aux.push(p.pop());
        }

        // Empilhar o elemento recebido
        p.push(element);

        // Rettirando o topo da pilha auxiliar
        aux.pop();

        // Reempilhando a p a partir da aux
        while (aux.empty() == false) {
            p.push(aux.pop());
        }
    }

    // Incluir determinado elemento na minha pilha:
    public void insertElemnent(Pilha p, int element, int pos) {
        Pilha aux = new Pilha();

        // Verificando se a pilha est� cheia
        if (p.full() == true)
            return;

        // Verificar se a posi��o � valida
        if (pos < 0 || pos > p.size())
            return;

        // Desemplihar os elementos at� a posi��o pos
        while (p.size() > pos) {
            aux.push(p.pop());
        }

        // Empilhar o elemento recebido
        p.push(element);

        // Reempilhando a p a partir da aux
        while (aux.empty() == false) {
            p.push(aux.pop());
        }
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