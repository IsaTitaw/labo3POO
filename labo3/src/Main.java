import be.ifosup.*;


public class Main {
    public static void main(String[] args) {
        Vehicule monvehicule = new Vehicule("ma chouette auto");
        System.out.println("Voici "+monvehicule.Vehicule());
        Voiture mavoiture = new Voiture("Ma chouette auto", "Smart", "For2", "orange", 84);
        System.out.println(mavoiture);
        mavoiture.faisqqchose();
        mavoiture.demarrer();
        mavoiture.roule();
        mavoiture.Avancer(40);
        mavoiture.Tourner(40, "droite");
        mavoiture.arreter();
        System.out.println("-------------------------------------------------------------------------------------------------");


        Batmobile mabatmobile = new Batmobile("Ma super batmobile");
        System.out.println(mabatmobile.faisqqchose());
        mabatmobile.decolle();
        mabatmobile.roulesurterre(-10);
        mabatmobile.deplaceSousEau(50);
        mabatmobile.deplaceSousEau(-80);
        mabatmobile.remontesurface(50);
        System.out.println("-------------------------------------------------------------------------------------------------");

        Hovercraft monhovercraft = new Hovercraft("The mouche", "Super2000", 75, 2);
        System.out.println("Je m'apelle "+ monhovercraft.Vehicule());
        System.out.println(monhovercraft.faisqqchose());
        System.out.println("-------------------------------------------------------------------------------------------------");

        Bateau monbateau = new Bateau();
        System.out.println(monbateau.Vehicule());
        monbateau.roulesouseau(50);
        monbateau.faisqqchose();
        System.out.println("-------------------------------------------------------------------------------------------------");








    }


}
