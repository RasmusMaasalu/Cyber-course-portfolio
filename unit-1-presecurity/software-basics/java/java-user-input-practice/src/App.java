import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        String input = "";
        System.out.println("Enter a number");
        input = in.nextLine();
        int luku1 = Integer.parseInt(input);

        System.out.println("Enter another number");
        input = in.nextLine();
        int luku2 = Integer.parseInt(input);

        int summa = luku1 + luku2;
        if (summa > 10) {
            System.out.println("Output is over 10. Output is " + summa);
        } else {
            System.out.println(summa);
        }

        System.out.println("Would you like to add or subtract?");

        input = in.nextLine();
        String vastaus = input;

        if (vastaus.equals("+")) {
            int sum = luku1 + luku2;
            System.out.println(luku1 + "+" + luku2 + "=" + sum);
        }
        if (vastaus.equals("-")) {
            int sub = luku1 - luku2;
            System.out.println(luku1 + "-" + luku2 + "=" + sub);
        }
    }
}
