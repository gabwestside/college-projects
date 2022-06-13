public class App {
    public App() {
        LDE list = new LDE();
        list.insertNoFinal(12);
        list.insertNoFinal(15);
        list.insertNoFinal(18);
        list.insertNoFinal(14);
        list.insertNoFinal(17);
        list.insertNoFinal(13);
        list.insertNoFinal(10);
        // lista.print();
        // lista.bubbleSort();
        // lista.trocarConsecutivos(2);
        list.print();

        LSE lse = new LSE();
        lse.inserirNoFinal(12);
        lse.inserirNoFinal(14);
        lse.inserirNoFinal(17);
        lse.inserirNoFinal(19);    
        lse.inserirNoFinal(20);
        lse.inserirNoFinal(29);  
        
        lse.printIterativo();

        System.out.println("Duplicate a node:");

        list.duplicateElement(10);
        list.print();

        System.out.println("Switch a node:");

        lse.switchPosition(14);
        lse.printIterativo();
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