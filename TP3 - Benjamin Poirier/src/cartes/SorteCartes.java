package cartes;

import java.awt.Color;

public enum SorteCartes
{
    COEUR('♥', Color.RED),
    CARREAU('\u2666', Color.RED),
    PIQUE('♠', Color.BLACK),
    TREFLE('♣', Color.BLACK);

    private Color couleur;
    private char symbole;

    private SorteCartes(char symbole, Color couleur){
        this.symbole = symbole;
        this.couleur = couleur;
    }

    public char getSymbole() {
        return symbole;
    }

    public Color getColour() {
        return couleur;
    }
}
