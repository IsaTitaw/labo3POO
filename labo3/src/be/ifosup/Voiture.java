package be.ifosup;

public class Voiture extends Vehicule implements Roulant {
    private String marque;
    private String modele;
    private String couleur;
    private int power;

    public Voiture(String nom, String marque, String modele, String couleur, int power) {
        super(nom);
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", couleur='" + couleur + '\'' +
                ", power=" + power +
                '}';
    }

    public Voiture() {
        super("Je suis une voiture");
    }

    public void faisqqchose(){
        System.out.println( " sert à aller d'un point A à un point B en transportant des gens et/ou des objets");
    }



    @Override
    public void roule() {
        System.out.println("La voiture roule");
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture a démarré");
    }

    @Override
    public void arreter() {
        System.out.println("La voiture s'est arrêtée");

    }
}
