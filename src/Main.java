public class Main {
    public static void main(String[] args) {
        Pokemon sala = new Pokemon("salamech", 30, 18);
        TFeu salamech = new TFeu(sala, 4, 8, 40, 1.30);

        Pokemon insec = new Pokemon("insecateur", 25, 51);
        TInsecte insecateur = new TInsecte(insec, 2, 2, 2);

        Pokemon magi = new Pokemon("magicarpe", 1, 10);
        TMer magicarpe = new TMer(magi, 3);

        Pokemon fanto = new Pokemon("fantominus", 15, 1);
        TAddict fantominus = new TAddict(fanto, 2, 4, 10, 1);

        System.out.println("────────────────────────────────");
        System.out.println("salamech.toString() :");
        System.out.println(salamech.toString());
        System.out.println("────────────────────────────────");
        System.out.println("insecateur.toString() :");
        System.out.println(insecateur.toString());
        System.out.println("────────────────────────────────");
        System.out.println("magicarpe.toString() :");
        System.out.println(magicarpe.toString());
        System.out.println("────────────────────────────────");
        System.out.println("fantominus.toString() :");
        System.out.println(fantominus.toString());
        System.out.println("────────────────────────────────");
        System.out.println("fantominus energie :");
        System.out.println(fantominus.GetEnergie());
        salamech.attaqueFeu(fantominus);
        System.out.println("fantominus energie :");
        System.out.println(fantominus.GetEnergie());
        System.out.println("────────────────────────────────");

    }
}