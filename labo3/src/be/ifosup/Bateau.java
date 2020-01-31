package be.ifosup;

public class Bateau extends Vehicule implements Amphibie, Volant {
    private String modele;
    private String longueur;
    private int power;

    public Bateau(String nom, String modele, String longueur, int power) {
        super(nom);
        this.modele = modele;
        this.longueur = longueur;
        this.power = power;
    }

    public Bateau() {
        super("Je suis un bateau");
    }

    public String faisqqchose(){
        return "Un bateau ça vogue sur l'eau";
    }

    @Override
    public void vole() {

    }

    @Override
    public void decolle() {

    }

    @Override
    public void atterit() {

    }

    @Override
    public void roulesouseau() {

    }

    @Override
    public void roulesurterre() {

    }
}
