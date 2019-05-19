public class RunnableTest {
    public static void main(String[] args) {

        System.out.println("=== RunnableTest ===");

        // Anonymous Runnable
        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                System.out.println("Hello world one!");
            }
        };

        // Lambda Runnable
         Runnable r2 = () -> System.out.println("Hello Lambda");

        // Run em!
        r1.run();
        // TODO uncomment next line to run thread
        r2.run();

    }
}
