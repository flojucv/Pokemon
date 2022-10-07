public class Pokemon {
    private String nom;
    private double energie;
    private double poids;

    public Pokemon(){};
    public Pokemon(String prmNom, double prmEnergie, double prmPoids) {
        this.nom = prmNom;
        this.energie = prmEnergie;
        this.poids = prmPoids;
    }

    public String toString() {
        return "Je suis le Pokémon "+this.nom+" mon poids est de "+this.poids;
    }


    /*-----GUETTEUR-----*/
    protected String GetNom() {
        return this.nom;
    }
    protected double GetEnergie() {
        return this.energie;
    }
    protected double GetPoids() {
        return this.poids;
    }

    /*-----SETTEUR-----*/
    protected void SetEnergie(double prmEnergie) {this.energie = prmEnergie;}
}
