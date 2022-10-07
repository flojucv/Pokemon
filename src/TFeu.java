public class TFeu extends Pokemon{
    private int nbrPatte, nbrBFeu, puissance;
    private double taille;

    public TFeu() {}
    public TFeu(Pokemon prmPokemon, int prmNbrPatte, int prmNbrBFeu, int prmPuissance, double prmTaille) {
        super(prmPokemon.GetNom(), prmPokemon.GetEnergie(), prmPokemon.GetPoids());
        this.nbrPatte = prmNbrPatte;
        this.nbrBFeu = prmNbrBFeu;
        this.puissance = prmPuissance;
        this.taille = prmTaille;
    }

    public double vitesseSol() {
        return (this.nbrPatte * this.taille);
    }

    public String toString() {
        return super.toString();
    }

    public void attaqueFeu(Pokemon cible) {
        double degats = 15 * vitesseSol();
        System.out.println((cible.GetEnergie() - degats));
        double energieapres=(cible.GetEnergie() - degats);
        cible.SetEnergie(energieapres);
        System.out.println(cible.GetNom() + "a perdue " + degats + " d'energie son solde est desormais de "+ cible.GetEnergie());
    }
}
