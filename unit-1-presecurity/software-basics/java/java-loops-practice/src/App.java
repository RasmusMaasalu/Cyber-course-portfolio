public class App {

    public static void main(String[] args) throws Exception {

        // Tehtava 1
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Tehtava 2
        for (int i = 10; i < 21; i++) {
            System.out.println(i);
        }

        // Tehtava 3
        for (int i = 0; i < 21; i++) {
            if (i == 5 || i == 16 || i == 20) {
                System.out.println(i);
            }
        }

        // Tehtava 4
        for (int i = 0; i < 5; i++) {
            System.out.println("loop");
        }

        // Tehtava 5
        int i = 0;
        while (i < 5) {
            i++;
            System.out.println(i);
        }

        // Tehtava 6

        int i = 0;
        do {
            System.out.print("*");
            i++;
        } while (i < 10);
    }
}
