public class LDE {
  public Node head;
  public Node tail;

  public LDE() {
    head = new Node();
    tail = new Node();
    head.next = tail;
    tail.prev = head;
  }

  /*
   * (5) Elabore um m�todo para trocar de lugar dois n�s consecutivos que estejam
   * nas posi��es pos e pos+1, onde pos � recebido como argumento. O m�todo deve
   * efetivamente trocar os dois n�s de lugar, alterando suas refer�ncias de next
   * e previous e n�o apenas alterar o valor de suas informa��es (info).
   */
  public void trocarConsecutivos(int pos) {
    int tam = this.tamanho();
    // Valida��o do pos recebido
    if (pos < 0 || pos > tam - 2)
      return;

    // Posicionando o aux1 na posi��o pos
    Node aux1 = head.next;
    for (int i = 0; i < pos; i++)
      aux1 = aux1.next;
    // Posicionando o aux2 na posi��o pos+1
    Node aux2 = aux1.next;

    // Ajustando as refer�ncias
    aux2.prev = aux1.prev;
    aux1.next = aux2.next;
    aux1.prev = aux2;
    aux2.prev.next = aux2;
    aux1.next.prev = aux1;
    aux2.next = aux1;
  }

  // Ordenando uma lista pelo Bubble Sort
  public void bubbleSort() {
    Node aux1;
    Node aux2;
    int tam = this.tamanho();
    int count = 0;

    // Ordenando a lista por completo
    for (int i = 0; i < tam - 1; i++) {
      aux1 = head.next;
      aux2 = aux1.next;
      // Percorrendo a lista para ordenar o maior valor da mesma
      for (int j = i; j < tam - 1; j++) {
        // Verificando a necessidade de troca
        count++;
        if (aux1.info > aux2.info) {
          // Trocando os valores
          int aux3 = aux1.info;
          aux1.info = aux2.info;
          aux2.info = aux3;
        }
        aux1 = aux1.next;
        aux2 = aux2.next;
      }
    }
    System.out.println(count);
  }

  // Inserindo em uma posi��o indicada
  public void insertAtPos(int info, int pos) {
    // Validando a posi��o
    int tam = tamanho();
    if (pos < 0 || pos > tam)
      return;

    // Posicionando o aux no n� anterior � posi��o indicada
    Node aux = head;
    for (int i = 0; i < pos; i++) {
      aux = aux.next;
    }

    // Inserindo o novo ap�s o aux
    Node novo = new Node(info);
    novo.next = aux.next;
    novo.prev = aux;
    aux.next.prev = novo;
    aux.next = novo;
  }

  // Inserindo no in�cio da lista
  public void insertNoInicio(int i) {
    Node novo = new Node(i);
    novo.prev = head; // Antes do novo vem a head
    novo.next = head.next; // Depois do novo vem quem vinha depois do head
    head.next.prev = novo; // Antes do posterior do head vem o novo
    head.next = novo; // Depois da head vem o novo
  }

  // Inserindo no final da lista
  public void insertNoFinal(int i) {
    Node novo = new Node(i);
    novo.next = tail; // Depois do novo vem o tail
    novo.prev = tail.prev; // Antes do novo vem quem vinha antes do tail
    tail.prev.next = novo; // Depois do anterior do tail vem o novo
    tail.prev = novo; // Antes da tail vem o novo
  }

  // Removendo de uma posi��o indicada
  public void deleteAtPos(int pos) {
    // Validando a posi��o e o tamanho
    int tam = tamanho();
    if (tam == 0 || pos < 0 || pos >= tam)
      return;

    // Posicionando o aux no n� a ser removido
    Node aux = head.next;
    for (int i = 0; i < pos; i++) {
      aux = aux.next;
    }

    // Ajustando os ponteiros para remover o n� aux
    aux.prev.next = aux.next;
    aux.next.prev = aux.prev;
  }

  // Removendo os n�s com a info recebida
  public void deletePeloValor(int info) {
    // Validando a posi��o e o tamanho
    int tam = tamanho();
    if (tam == 0)
      return;

    // Posicionando o aux no in�cio da lista
    Node aux = head.next;

    // Percorrendo a lista
    while (aux != tail) {
      if (aux.info == info) {
        // Ajustando ponteiros para remover o n� aux
        aux.prev.next = aux.next;
        aux.next.prev = aux.prev;
      }
      aux = aux.next;
    }
  }

  // Calculando o tamanho (comprimento) da lista
  public int tamanho() {
    int tam = 0;
    Node aux = head.next;
    while (aux != tail) {
      aux = aux.next;
      tam++;
    }
    return tam;
  }

  // Verificando se a lista est� vazia
  public boolean ehVazia() {
    if (head.next == tail)
      return true;
    return false;
  }

  // Imprimindo os valores da lista
  public void print() {
    Node aux = head.next;
    while (aux != tail) {
      System.out.print(aux.info + "-");
      aux = aux.next;
    }
    System.out.println("");
  }
}