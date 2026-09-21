public class App {
    public static void main(String[] args) throws Exception {

        int luku1 = 5;
        int luku2 = 2;
        int luku3 = 7;

        String nimi1 = "John";
        String nimi2 = "Bob";
        String nimi3 = "Peter";

        // Tehtava 1

        if (luku1 == luku2) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }

        if (luku1 > luku2) {
            System.out.println("It is bigger");
        } else if (luku1 < luku2) {
            System.out.println("It is smaller");
        } else {
            System.out.println("Numbers are the same");
        }

        if (luku1 >= luku2) {
            System.out.println("Its bigger or same");
        } else {
            System.out.println("Smaller");
        }

        if (luku1 != luku2) {
            System.out.println("Not equal");
        }

        // Tehtava 2

        if (luku1 == luku2 || luku1 == luku3) {
            System.out.println("Numbers 1, 2 OR 3 are equal");
        } else {
            System.out.println("Numbers 1, 2 OR 3 are not equal");
        }

        if (luku1 > luku2 && luku1 == luku3) {
            System.out.println("Number 1 is bigger than number 2 and number 1 is equal to number 3");
        } else {
            System.out.println("Number 1 is smaller than number 2 and number 1 is not equal to number 3");
        }

        if (luku1 == luku2 && luku2 == luku3) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("No numbers are equal");
        }

        if (luku1 > luku2) {
            System.out.println("Number 1 is bigger than number 2");
        } else if (luku2 > luku3) {
            System.out.println("Number 2 is bigger than number 3");
        }

        if (luku1 == luku2) {
            System.out.println("Number 1 and number 2 are equal");
        } else if (luku1 == luku3) {
            System.out.println("Number 1 and number 3 are equal");
        }

        // Tehtava 3

        if (nimi1.equals(nimi2)) {
            System.out.println("Names are the same");
        } else {
            System.out.println("Names are not the same");
        }

        if (!nimi1.equals(nimi2)) {
            System.out.println("Names are not the same");
        } else {
            System.out.println("Names are the same");
        }

        if (nimi1.equals(nimi2)) {
            System.out.println("Names 1 and 2 are the same");
        } else if (nimi1.equals(nimi3)) {
            System.out.println("Names 1 and 3 are the same");
        } else {
            System.out.println("No names are the same");
        }
    }
}
