package be.ifosup;

public interface Sous_marin {
    public static int profondeurMax= -100;
    public static int profondeurMin= -20;


   default void deplaceSousEau(int profondeur) {
        if (profondeurMax >= profondeur && profondeurMin <= profondeur){
            System.out.println("C'est bon on va sous l'eau");
        }else{
            System.out.println("On est pas dans l'eau c'est moche pour un sous-marin");
        }
    }

    void remontesurface();


}
