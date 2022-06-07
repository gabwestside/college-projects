public class Node {
  public int info;
  public Node next;
  public Node prev;

  public Node() {
    this.next = null;
    this.prev = null;
  }

  public Node(int i) {
    this.info = i;
    this.next = null;
    this.prev = null;
  }
}
