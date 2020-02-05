package be.ifosup;

public class Batmobile extends Vehicule implements Roulant, Volant, Amphibie, Sous_marin {



    public Batmobile(String nom) {
        super(nom);
    }


    public String faisqqchose(){
        return "Une batmobile ça sait tout faire";
    }

    @Override
    public void deplaceSousEau(int profondeur) {
        if (profondeur >= -100 && profondeur <= -20){
            System.out.println("C'est bon on va sous l'eau");
        }else{
            System.out.println("On est pas dans l'eau c'est moche pour un sous-marin");
        }

    }

    @Override
    public void roulesouseau(int profondeur) {
        if (profondeur <=0){
            System.out.println("Let's go on roule sous l'eau!");
        }else{
            System.out.println("Mode terrestre enclenché");
        }
    }

    @Override
    public void roulesurterre(int profondeur) {
        if (profondeur >=0){
            System.out.println("Let's go on roule sur la terre");
        }else{
            System.out.println("Va plutôt falloir se mettre en mode aquatique!");
        }
    }

    @Override
    public void roule() {

    }

    @Override
    public void demarrer() {

    }

    @Override
    public void arreter() {

    }

    @Override
    public void vole() {

    }

    @Override
    public void decolle() {
        System.out.println("La batmobile décolle");
    }

    @Override
    public void atterit(){
        System.out.println(("La batmobile atterit"));

    }


    @Override
    public void remontesurface(int pression) {
        if (pression >= 100){
            System.out.println("Attention d'abord respecter les palliers de décompression!!!! On ne remonte pas! ");
        }else{
            System.out.println("Ok on remonte");
        }

    }
}
