public class TInsecte extends Pokemon{
    private int nbrPattes;
    private int nbrAile;
    private double taille;

    public TInsecte() {};
    public TInsecte(Pokemon prmPokemon, int prmNbrPattes, int prmNbrAile, double prmTaille) {
        super(prmPokemon.GetNom(), prmPokemon.GetEnergie(), prmPokemon.GetPoids());
        this.nbrAile = prmNbrAile;
        this.nbrPattes = prmNbrPattes;
        this.taille = prmTaille;
    }

    public double vitesseSol() {
        return (this.nbrPattes * this.taille * 3);
    }

    public  double vitesseAir() {
        return (this.nbrAile * this.taille * 10);
    }

    public String toString() {
        return super.toString() + "ma vitesse au sol est de " + vitesseSol() + "km/h, en vol est de " + vitesseAir()+", " + this.nbrPattes + "pattes, ma taille est de " + this.taille + "m, mon activité est de butiner, ma fréquence cardiaque est de 120 pulsations à la minute";
    }
}
