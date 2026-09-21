import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = " ";

        System.out.println("Enter your name");
        input = in.nextLine();
        String nimi = input;

        System.out.println("Enter your age");
        input = in.nextLine();
        int age = Integer.parseInt(input);

        if (nimi.equals("")) {
            System.out.println("Error");
        } else {
            System.out.println("Your name is " + nimi + " and your age is " + age);
        }

        System.out.println("Enter a number");
        input = in.nextLine();
        int number1 = Integer.parseInt(input);

        System.out.println("Enter another number");
        input = in.nextLine();
        int number2 = Integer.parseInt(input);
        int sum = number1 + number2;

        System.out.println("Sum output is " + sum);
        System.out.println(number1 + "+" + number2 + "=" + sum);

    }
}
