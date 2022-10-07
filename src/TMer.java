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

    public void attaqueInsecte(Pokemon cible) {
        double degats = 10 * this.nbrNagoir;
        cible.SetEnergie((cible.GetEnergie() - degats));
        System.out.println(cible.GetNom() + "a perdue " + degats + " d'energie son solde est desormais de "+ cible.GetEnergie());
    }
}
