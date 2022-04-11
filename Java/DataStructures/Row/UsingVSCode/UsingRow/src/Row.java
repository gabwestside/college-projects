public class Row {
    private int capacity = 100;

    private int vetor[] = new int[capacity];

    private int end = 0;

    private int start = 0;

    private int length = 0;

    public int size() {
        return length;
    }

    public boolean empty() {
        return (length == 0);
    }

    public boolean full() {
        return (length == capacity);
    }

    public int front() {
        if (!empty())
            return vetor[start];

        return -1;
    }

    public void enqueue(int elem) {
        if (size() < capacity) {
            vetor[end] = elem;

            end = (end + 1) % capacity;
            length++;
        }
    }

    public int dequeue() {
        if (!empty()) {
            int value = vetor[start];
            start = (start + 1) % capacity;
            length--;
            return value;
        }
        return -1;
    }
}
