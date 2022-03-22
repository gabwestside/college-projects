import javax.swing.border.EmptyBorder;

public class Main {
    public Main() {
        Pilha p = new Pilha();

        p.push(10);
        p.push(2);
        p.push(5);
        p.push(9);

        Pilha p1 = new Pilha();

        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);

        Pilha p2 = new Pilha();

        p2.push(5);
        p2.push(6);
        p2.push(7);
        p2.push(8);

        Pilha p3 = this.commonElements(p1, p2);

        // print(p1);
        // System.out.println();

        // print(p2);
        // System.out.println();

        // print(p3);

        Pilha pilha = this.intertpoleStack(p1, p2);

        print(pilha);

        // System.out.println(this.isEquals(p));

        // this.removeElement(p1, 36);

        // System.out.println(this.highestValue(p));

        // System.out.println(this.removeMinor(p));

        // this.print(p);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }

    public int removeMinor(Pilha p) {
        Pilha aux = new Pilha();
        int minor = p.top();

        while (!p.empty()) {
            int top = p.pop();

            if (top < minor)
                minor = top;

            aux.push(top);
        }

        while (!aux.empty()) {
            int top = aux.pop();

            if (top != minor) {
                p.push(top);
            }
        }

        return minor;
    }

    public Pilha commonElements(Pilha p1, Pilha p2) {
        Pilha p3 = new Pilha();
        Pilha aux = new Pilha();
        Pilha aux2 = new Pilha();

        while (!p1.empty()) {
            int top = p1.pop();
            int top2 = p2.pop();

            if (top == top2) {
                p3.push(top);
            }

            aux.push(top);
            aux2.push(top2);
        }

        while (!aux.empty()) {
            p1.push(aux.pop());
            p2.push(aux2.pop());
        }

        return p3;
    }

    public int highestValue(Pilha p) {
        int highest = p.top();
        Pilha aux = new Pilha();

        while (!p.empty()) {
            int t = p.pop();

            if (t > highest)
                highest = t;

            aux.push(t);
        }

        while (!aux.empty()) {
            p.push(aux.pop());
        }

        return highest;
    }

    public int avgStackElements(Pilha p) {
        int avg = p.top();
        Pilha aux = new Pilha();

        while (!p.empty()) {
            // to implements
        }

        while (!aux.empty()) {
            // to implements
        }

        return avg;
    }

    public Pilha intertpoleStack(Pilha p1, Pilha p2) {
        Pilha pilha = new Pilha();
        Pilha aux = new Pilha();
        Pilha aux2 = new Pilha();

        while (!p1.empty()) {
            int top = p1.pop();
            int top2 = p2.pop();

            aux.push(top);
            aux2.push(top2);
        }

        while (!aux.empty()) {
            int topAux = aux.pop();
            int topAux2 = aux2.pop();

            if (topAux < topAux2) {
                pilha.push(topAux);
                pilha.push(topAux2);
            } else {
                pilha.push(topAux2);
                pilha.push(topAux);
            }
        }

        return pilha;
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