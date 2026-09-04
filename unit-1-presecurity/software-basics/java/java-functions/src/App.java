public class App {
    public static void  main(String[] args) throws Exception {

        String tekija = "Rasmus";
        int luku1 = 5;
        int luku2 = 2;

        System.out.println("Hei olen Tulostin-ohjelma");
        System.out.println("Ohjelman tekija: " + tekija);

        int tulo = luku1 * luku2;
        System.out.println(luku1 +  "*" + luku2 + "=" + tulo);

        int summa = luku1 + luku2;
        System.out.println(luku1 +  "+" + luku2 + "=" + summa);

        int erotus = luku1 - luku2;
        System.out.println(luku1 +  "-" + luku2 + "=" + erotus);

        double jako = (double)luku1 / luku2;
        System.out.println(luku1 +  "/" + luku2 + "=" + jako);
    }
}
