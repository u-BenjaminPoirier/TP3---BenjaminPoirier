package tp5G1PoirierB2242919.paquet;

import tp5G1PoirierB2242919.utile.TableauObject;
import tp5G1PoirierB2242919.utile.Utile;

import java.util.Arrays;

import static tp5G1PoirierB2242919.paquet.Carte.COULEURS_VALIDES;
import static tp5G1PoirierB2242919.paquet.Carte.couleurEstValide;


public class Paquet {

    public TableauObject paquet;

    public Paquet(boolean melange) {
        remplirPaquet();
        if (melange == true) {
            melanger();
        }
    }

    public boolean estVide() {
        return paquet.longueur == 0;
    }

    public int getNombreDeCartes() {
        return paquet.longueur;
    }

    public void melanger() {
        paquet.shuffle();
    }

    public Carte piger() {
        Carte carte = (Carte) paquet.remove(0);

        return carte;

    }

    private void remplirPaquet() {
        this.paquet = new TableauObject(52);
        int indexDeCarte = 0;
        String couleur;

        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j <= 3; j++) {
                couleur = COULEURS_VALIDES[j];
                paquet.t1[indexDeCarte] = new Carte(i, couleur);
                indexDeCarte++;
            }
        }
    }


    @Override
    public String toString() {
        String resultat = "";

        for (int i = 0; i < paquet.longueur; i++) {
            resultat += paquet.t1[i];
        }
        
        return resultat;
    }
}
