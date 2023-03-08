package tp5G1PoirierB2242919.paquet;

import tp5G1PoirierB2242919.utile.Utile;

import java.util.Objects;

public class Carte {

    public static final String[] COULEURS_VALIDES = {"pique", "trèfle", "carreau", "coeur"};
    static final char[] COULEURS_CAR = {'\u2660', '\u2663', '\u2666', '\u2764'};

    public String couleur;
    public int nbre;
    public char symbole;

    public Carte(int nbre, String couleur) {
        couleurEstValide(couleur);
        valeurEstValide(nbre);

        setCouleur(couleur);
        setValeur(nbre);

        getCharCarte();

    }


    public static boolean couleurEstValide(String couleur) {
        int retour;

        retour = Utile.trouverStr(couleur, COULEURS_VALIDES);

        return (!(retour == -1));
    }


    public static boolean valeurEstValide(int val) {
        return val >= 1 && val <= 13;
    }

    public void setCouleur(String couleur) {
        if (!(couleurEstValide(couleur))) {
            throw new IllegalArgumentException("La couleur est invalide. (" + couleur + ")");
        }

        this.couleur = couleur.toLowerCase();
    }

    public void setValeur(int valeur) {
        if (!(valeurEstValide(valeur))) {
            throw new IllegalArgumentException("La valeur est invalide. (" + valeur + ")");
        }
        this.nbre = valeur;
    }

    public String getCouleur() {
        return couleur;
    }

    public char getCharCarte() {
        int index;

        index = Utile.trouverStr(couleur, COULEURS_VALIDES);

        symbole = COULEURS_CAR[index];

        return COULEURS_CAR[index];
    }


    public int getValeur() {
        return nbre;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carte carte)) return false;
        return nbre == carte.nbre && symbole == carte.symbole && getCouleur().equals(carte.getCouleur());
    }


    @Override
    public String toString() {
        return nbre + " de " + couleur + " (" + symbole + ")";
    }
}

