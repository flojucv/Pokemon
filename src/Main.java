public class Main {
    public static void main(String[] args) {
        Pokemon pokemonDefault = new Pokemon("Quentin", 5, 18);

        TInsecte pokemonInsect = new TInsecte(pokemonDefault, 5, 8, 7);

        TFeu pokemonFeu = new TFeu(pokemonDefault, 5, 8, 3, 19);

        TMer pokemonMer = new TMer(pokemonDefault, 7);

        TAddict pokemonAddict = new TAddict(pokemonDefault, 7, 8, 2, 5);

        System.out.println(pokemonDefault.toString());
        System.out.println(pokemonAddict.toString());
        System.out.println(pokemonFeu.toString());
        System.out.println(pokemonMer.toString());
        System.out.println(pokemonInsect.toString());
    }
}