package be.ifosup;

public class Vehicule {
    private String nom;

    public Vehicule(String nom) {
        this.nom = nom;
    }

    public String Vehicule(){

        return "Je suis un véhicule";
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
