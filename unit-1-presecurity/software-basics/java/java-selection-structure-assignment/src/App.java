public class App {
    public static void main(String[] args) throws Exception {

        // Tehtava 1
        int luku1 = 120;

        if (luku1 > 100) {
            System.out.println("120 is bigger than 100");
        } else {
            System.out.println("120 is not bigger than 100");
        }

        // Tehtava 2

        int luku2 = 7;
        int luku3 = 7;

        if (luku2 == luku3) {
            System.out.println("Numbers are the same");
        } else {
            System.out.println("Numbers are not the same");
        }

        // Tehtava 3

        String var1 = "IOS";
        String var2 = "Android";

        System.out.println(var1);
        System.out.println(var2);

        if (var1.equals(var2)) {
            System.out.println("Values are the same");
        } else {
            System.out.println("Values are not the same");
        }

        // Tehtava 4

        int value1 = 3;
        int value2 = 3;
        int value3 = 3;

        if (value1 == value2 && value2 == value3) {
            System.out.println("Numbers are the same");
        } else {
            System.out.println("Numbers are not the same");
        }
    }
}
