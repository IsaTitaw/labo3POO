package be.ifosup;

public class Vehicule {
    protected String nom;

    public Vehicule(String nom) {
        this.nom = nom;
    }


    public String Vehicule(){
        return nom;
    }



    @Override
    public String toString() {
        return "Vehicule{" +
                "nom='" + nom + '\'' +
                '}';
    }

    public void Avancer(int vitesse){
        System.out.println("On avance à une vitesse de "+vitesse);
    }

    public void Tourner( int angle, String direction){
        System.out.println("On tourne à "+angle+" à "+direction);
    }


}
