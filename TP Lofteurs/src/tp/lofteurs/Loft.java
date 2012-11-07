/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.lofteurs;

/**
 *
 * @author jonathancozzo
 */
public class Loft {

    protected int w;
    protected int h;
    protected Nourriture[][] tableNourriture;
    protected Lofteur[][][] tableLofteur;
    public static int TAILLE_CASE_X;
    public static int TAILLE_CASE_Y;

    public Loft() {
        this.w = 100;
        this.h = 100;
        TAILLE_CASE_X  = TPLofteurs.TAILLE_FENETRE_X / w;
        TAILLE_CASE_Y  = TPLofteurs.TAILLE_FENETRE_Y / h;
        this.tableNourriture = new Nourriture[100][100];
        this.tableLofteur = new Lofteur[100][100][10];
    }

    public Loft(int w1, int h1, int e, int c, int v, int l, int s, int a, int p) {
        this.w = w1;
        this.h = h1;
        this.tableNourriture = new Nourriture[w1][h1];
        this.tableLofteur = new Lofteur[w1][h1][10];

        int i, x, y;
        for (i = 0; i < e; i++) {
            this.tableLofteur[(int) (Math.random() * w1)][(int) (Math.random() * h1)][i] = new Erratique(this);
        }

        for (i = 0; i < c; i++) {
            this.tableLofteur[(int) (Math.random() * w1)][(int) (Math.random() * h1)][i] = new Cannibale(this);
        }

        for (i = 0; i < v; i++) {
            this.tableLofteur[(int) (Math.random() * w1)][(int) (Math.random() * h1)][i] = new Vorace(this);
        }

        for (i = 0; i < l; i++) {
            this.tableLofteur[(int) (Math.random() * w1)][(int) (Math.random() * h1)][i] = new Lapin(this);
        }

        for (i = 0; i < s; i++) {
            x = (int) (Math.random() * w1);
            y = (int) (Math.random() * h1);
            this.tableNourriture[x][y] = new Soda(x, y);
        }

        for (i = 0; i < a; i++) {
            x = (int) (Math.random() * w1);
            y = (int) (Math.random() * h1);
            this.tableNourriture[x][y] = new Alcool(x, y);
        }

        for (i = 0; i < p; i++) {
            x = (int) (Math.random() * w1);
            y = (int) (Math.random() * h1);
            this.tableNourriture[x][y] = new Pizza(x, y);
        }

    }

    public void supprimerNourriture(int x, int y) {
        this.tableNourriture[x][y] = null;

    }

    public void addLofteur(boolean sexe, int x, int y) {
        this.tableLofteur[x][y][this.tableLofteur[x][y].length] = new Lapin(this);
    }

    public void supprimeLofteur(int x, int y, int n) {
        this.tableLofteur[x][y][n] = null;

    }
}
