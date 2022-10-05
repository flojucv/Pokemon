public class TMer extends Pokemon {
    private int nbrNagoir;

    public TMer() {}
    public TMer(Pokemon prmPokemon, int prmNbrNagoir) {
        super(prmPokemon.GetNom(), prmPokemon.GetEnergie(), prmPokemon.GetPoids());
    }

    public double VitesseEau() {
        return (super.GetPoids()/25 * this.nbrNagoir);
    }

    public String toString() {
        return (super.toString() + ", ma vitesse est de " + VitesseEau() + "km/h j'ai " + this.nbrNagoir + " nageoires");
    }
}
