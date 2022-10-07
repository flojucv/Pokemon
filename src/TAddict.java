public class TAddict extends Pokemon {
    private int nbrPatte, lvlJeu, nbrHeure;
    private double taille;

    public TAddict() {}
    public  TAddict(Pokemon prmPokemon, int prmNbrPatte, int prmLvlJeu, int prmNbrHeure, double prmTaille) {
        super(prmPokemon.GetNom(), prmPokemon.GetEnergie(), prmPokemon.GetPoids());
        this.nbrPatte = prmNbrPatte;
        this.lvlJeu = prmLvlJeu;
        this.nbrHeure = prmNbrHeure;
        this.taille = prmTaille;
    }
    public double vitesseSol() {
        return (this.nbrPatte * this.taille * 2);
    }

    public String toString() {
        return (super.toString() + " ma vitesse est de " + vitesseSol() + "km/h j'ai " + this.nbrPatte + " pattes, ma taille est de " + this.taille + "m je joue " + this.nbrHeure + "h par jour");
    }

    public void attaqueAddict(Pokemon cible) {
        double degats = 2*vitesseSol();
        cible.SetEnergie((cible.GetEnergie() - degats));
        System.out.println(cible.GetNom() + "a perdue " + degats + " d'energie");
    }
}
