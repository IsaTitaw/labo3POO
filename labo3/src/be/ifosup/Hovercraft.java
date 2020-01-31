package be.ifosup;

public class Hovercraft extends Vehicule implements Amphibie, Volant {
    private String modele;
    private int tailleHelice;
    private int nbHelice;

    public Hovercraft(String nom, String modele, int tailleHelice, int nbHelice) {
        super(nom);
        this.modele = modele;
        this.tailleHelice = tailleHelice;
        this.nbHelice = nbHelice;
    }

    public Hovercraft() {
        super("Je suis un hovercraft");

    }



    public String faisqqchose(){
        return "Un hovercraft ça va sur l'eau avec 1/2 hélices";
    }

    @Override
    public void roulesouseau() {

    }

    @Override
    public void roulesurterre() {

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
}
