package be.ifosup;

public interface Sous_marin {
       default void deplaceSousEau(int profondeur) {
    }

    void remontesurface(int pression);


}
