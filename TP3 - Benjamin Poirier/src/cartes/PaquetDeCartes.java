package cartes;

import java.util.ArrayList;
import java.util.Objects;

public class PaquetDeCartes {

    final public static int NBR_ECHANGE = 100;
    private ArrayList<Carte> paquet;

    public PaquetDeCartes(ArrayList<Carte> list) {
        paquet = list;
    }

    public PaquetDeCartes() {
        //Remplir le paquet 4*13
    }

    public void brasser() {
        int i = 0;
        Carte o;

        while (i < NBR_ECHANGE) {
            int r1 = (int) Math.floor(Math.random() * (paquet.size() - 1 + 1) + 0);
            int r2 = (int) Math.floor(Math.random() * (paquet.size() - 1 + 1) + 0);

            if (!(r1 == r2)){
                permuterCarte(r1,r2);
                i++;
            }
        }
    }

    private void permuterCarte(int index1, int index2){
        Carte o1;
        Carte o2;

        o1 = paquet.get(index1);
        o2 = paquet.get(index2);

        paquet.remove(index1);
        paquet.add(index1, o2);
        paquet.add(index2, o1);
        paquet.remove(index2);
    }

    public Carte consulterCarte(int position) {
        return paquet.get(position);
    }

    public boolean isEmpty() {
        return paquet.size() == 0;
    }

    public int size() {
        return paquet.size();
    }

    public Carte prendreCarte(int position) {
        Carte c;
        c = paquet.get(position);
        paquet.remove(position);
        return c;
    }


    public void retournerTouteLesCartes(Boolean visible){

    }


}
