public class App {
    public App() {
        Row row = new Row();
        row.enqueue(14);
        row.enqueue(22);
        row.enqueue(40);
        row.enqueue(51);
        row.enqueue(55);
        row.enqueue(60);

    }

    public void print(Row r) {
        int length = r.size();
        for (int i = 0; i < length; i++) {
            int value = r.dequeue();
            System.out.println(value + "-");
            r.enqueue(value);
        }
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
    }
}