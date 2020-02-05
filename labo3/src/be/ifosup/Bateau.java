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

    public void faisqqchose(){
        System.out.println("Un bateau ça vogue sur l'eau");
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
    public void roulesouseau(int profondeur) {
        if (profondeur <=0){
            System.out.println("Let's go on roule sous l'eau mais achète plutôt un sous-marin!");
        }else{
            System.out.println("Il faut définitivement acheter un autre véhicule!");
        }

    }

    @Override
    public void roulesurterre(int profondeur) {
        if (profondeur >=0){
            System.out.println("Let's go on roule sur la terre mais sur une voiture alors!");
        }else{
            System.out.println("Va plutôt falloir se mettre en mode aquatique et donc acheter un sous-marin!");
        }
    }
}
