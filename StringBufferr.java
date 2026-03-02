public class StringBufferr {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                sb.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                sb.append("B");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sb.length());
    }
}
