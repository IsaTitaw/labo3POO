package be.ifosup;

public class Batmobile extends Vehicule implements Roulant, Volant, Amphibie, Sous_marin {

    int profondeur;

 Batmobile(int prof){
     profondeur=prof;
 }


//    public Batmobile() {
//        super("Je suis une batmobile");
//    }

    public String faisqqchose(){
        return "Une batmobile ça sait tout faire";
    }

    @Override
    public void deplaceSousEau() {
        deplaceSousEau(profondeur);
    }


    @Override
    public void roulesouseau() {

    }

    @Override
    public void roulesurterre() {

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
    public void atterit() {

    }


    @Override
    public void remontesurface() {

    }
}
