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

    public double VitesseSol() {
        return (this.nbrPatte * this.taille);
    }

    public String toString() {
        return super.toString();
    }
}
