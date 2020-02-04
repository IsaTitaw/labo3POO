package be.ifosup;

public interface Sous_marin {
    public static int profondeurMax= -100;
    public static int profondeurMin= -20;
//    void deplacesouseau(int profondeurMin,int profondeurMax ){
//        if (profondeurMax >= -20 && profondeurMin <= -100){
//            System.out.println("C'est bon on va sous l'eau");
//        }else{
//            System.out.println("On est pas dans l'eau c'est moche pour un sous-marin");
//        }
//    };
    void remontesurface();
}
