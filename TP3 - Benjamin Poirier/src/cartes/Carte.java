
package cartes;


public class Carte {


    public final static char IMAGE_DOS = ;
    private SorteCartes sorte;
    private ValeurCartes valeur;
    private boolean visible;

    public Carte(ValeurCartes valeur, SorteCartes sorte) {
        setSorte(sorte);
    }


    public boolean estVisible() {
        return visible;
    }

    //get
    public SorteCartes getSorte() {
        return sorte;
    }
    public char getSorteSymbole(){

    }

    public ValeurCartes getValeur() {
        return valeur;
    }

    public String getValeurSymbole(){

    }

    //set
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    private void setValeur(ValeurCartes valeur){
        this.valeur = valeur;
    }

    private void setSorte(SorteCartes sorte) {
        this.sorte = sorte;
    }

    public int compareTo(Carte c){

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carte carte)) return false;
        return false;
    }


    public String toStringCarte(){
        return "";
    }
    @Override
    public String toString() {
        return "";
    }
}

