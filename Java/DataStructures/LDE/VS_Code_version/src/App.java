public class App {
    public App() {
        LDE lista = new LDE();
        lista.insertNoFinal(12);
        lista.insertNoFinal(15);
        lista.insertNoFinal(18);
        lista.insertNoFinal(14);
        lista.insertNoFinal(17);
        lista.insertNoFinal(13);
        lista.insertNoFinal(10);
        // lista.print();
        // lista.bubbleSort();
        // lista.trocarConsecutivos(2);
        lista.print();
        System.out.println();

        LDE l2 = new LDE();
        LDE l3 = new LDE();

        this.includeList(lista, l2, l3);

        l2.print();
        l3.print();
        /*
         * LDE l1 = new LDE();
         * l1.insertNoFinal(16);
         * l1.insertNoFinal(19);
         * l1.insertNoFinal(20);
         * l1.insertNoFinal(18);
         * l1.insertNoFinal(13);
         * LDE l2 = new LDE();
         * l2.insertNoFinal(17);
         * l2.insertNoFinal(22);
         * l2.insertNoFinal(16);
         * l2.insertNoFinal(21);
         * LDE l3 = new LDE();
         * //this.fundirListas(l1, l2, l3);
         * this.parImpar(l1, l2, l3);
         * l3.print();
         */
    }

    public void includeList(LDE l1, LDE l2, LDE l3) {
        if (l1.ehVazia())
            return;

        Node aux = l1.head.next;

        while (aux != l1.tail) {
            l2.insertNoFinal(aux.info);
            aux = aux.next;

            l3.insertNoFinal(aux.next.info);
            aux = aux.next;

            l1.head.next = aux;
            aux.prev = l1.head;
        }
    }

    // Elaborar um m�todo que receba duas LDEs (l1 e l2) e a partir delas construa
    // uma terceira LDE (l3) apenas com os valores pares de l1 e os �mpares de l2.
    // Exemplo: l1: 16-19-20-18-13-, l2: 17-22-16-21-
    // Ap�s o m�todo:
    // l3: 16-20-18-17-21-
    public void parImpar(LDE l1, LDE l2, LDE l3) {
        // Verificando se alguma das listas (l1 ou l2) � vazia
        if (l1.ehVazia() || l2.ehVazia())
            return;

        // Posicionando os n�s auxiliares no in�cio de cada lista
        Node aux1 = l1.head.next;
        Node aux2 = l2.head.next;

        // Copiando os valores pares de l1 para l3
        while (aux1 != l1.tail) {
            if (aux1.info % 2 == 0) {
                l3.insertNoFinal(aux1.info);
            }
            aux1 = aux1.next;
        }

        // Copiando os valores �mpares de l2 para l3
        while (aux2 != l2.tail) {
            if (aux2.info % 2 == 1) {
                l3.insertNoFinal(aux2.info);
            }
            aux2 = aux2.next;
        }
    }

    // Elaborar um m�todo que receba duas LDEs (l1 e l2) e fa�a a fus�o dessas duas
    // em uma terceira LDE (l3). Suponha l1 e l2 de mesmo tamanho. Exemplo:
    // l1 : 15-19-20-18-, l2 : 17-22-16-21-
    // Ap�s o m�todo:
    // l3 : 15-17-19-22-20-16-18-21-
    public void fundirListas(LDE l1, LDE l2, LDE l3) {
        // Verificando se alguma das listas (l1 ou l2) � vazia
        if (l1.ehVazia() || l2.ehVazia())
            return;

        // Posicionando os n�s auxiliares no in�cio de cada lista
        Node aux1 = l1.head.next;
        Node aux2 = l2.head.next;

        // Copiando os valores de l1 e l2 para l3
        while (aux1 != l1.tail) {
            l3.insertNoFinal(aux1.info);
            l3.insertNoFinal(aux2.info);
            aux1 = aux1.next;
            aux2 = aux2.next;
        }
    }

    public static void main(String[] args) {
        App app = new App();
    }

}