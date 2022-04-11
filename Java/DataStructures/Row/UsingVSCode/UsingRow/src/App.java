public class App {
    public App() {
        Row row = new Row();
        row.enqueue(14);
        row.enqueue(22);
        row.enqueue(40);
        row.enqueue(51);
        row.enqueue(55);
        row.enqueue(60);

        Row r1 = new Row();
        r1.enqueue(3);
        r1.enqueue(8);
        r1.enqueue(2);
        r1.enqueue(9);
        r1.enqueue(5);

        Row r2 = new Row();
        r2.enqueue(5);
        r2.enqueue(8);
        r2.enqueue(2);
        r2.enqueue(7);
        r2.enqueue(6);

        // this.print(row);

        // this.removeElem(row, 22);

        // this.print(row);

        this.print(r1);

        this.print(r2);

        System.out.println(this.sameValues(r1, r2));

        this.print(r1);

        this.print(r2);
    }

    public void removeElem(Row f, int elem) {
        int length = f.size();

        for (int i = 0; i < length; i++) {
            int front = f.dequeue();

            if (front != elem) {
                f.enqueue(front);
            }
        }
    }

    public int sameValues(Row r1, Row r2) {
        Row row1 = new Row();
        Row row2 = new Row();

        int length = r1.size();

        int count = 0;

        for (int i = 0; i < length; i++) {
            int front1 = r1.front();

            int front2 = r2.front();

            if (front1 == front2) {
                count++;
            }

            row1.enqueue(front1);

            row2.enqueue(front2);
        }

        return count;
    }

    public void print(Row r) {
        int length = r.size();
        for (int i = 0; i < length; i++) {
            int value = r.dequeue();
            System.out.print(value + "-");
            r.enqueue(value);
        }

        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
    }
}