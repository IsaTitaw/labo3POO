package be.ifosup;

public class Hovercraft extends Vehicule implements Amphibie, Volant {
    private int tailleHelice;
    private int nbHelice;

    public Hovercraft(String nom, String modele, int tailleHelice, int nbHelice) {
        super(nom);
        this.tailleHelice = tailleHelice;
        this.nbHelice = nbHelice;
    }


    public String faisqqchose(){
        return "Un hovercraft ça va sur l'eau avec 1/2 hélices";
    }


    @Override
    public void roulesouseau(int profondeur) {

    }

    @Override
    public void roulesurterre(int profondeur) {

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
