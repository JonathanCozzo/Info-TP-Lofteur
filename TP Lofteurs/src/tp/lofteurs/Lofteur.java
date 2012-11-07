/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.lofteurs;

import java.awt.Graphics;

/**
 *
 * @author jonathancozzo
 */
public abstract class Lofteur implements ObjetDessinable {

    protected int energie;
    protected boolean sexe; // 0 : mec et 1 : fille
    protected int besoin;
    protected Loft loft;
    protected int x;
    protected int y;

    public Lofteur(int bs, Loft lf) {
        this.energie = 20;
        this.sexe = (Math.random() >= 0.5);
        this.besoin = bs;
        this.loft = lf;
        this.x = (int) (Math.random() * 100);
        this.y = (int) (Math.random() * 100);
    }

    public void manger() {
        if ((!(this.loft.tableNourriture[x][y]==null)) && (this.besoin > this.energie)) {
            if (besoin - energie >= this.loft.tableNourriture[x][y].getValEnerg()) {
                this.energie += this.loft.tableNourriture[x][y].getValEnerg();
                this.loft.supprimerNourriture(this.x, this.y);
            } else {
                this.loft.tableNourriture[x][y].setValEnerg(this.loft.tableNourriture[x][y].getValEnerg() + this.besoin - this.energie);
                this.energie = this.besoin;
            }
        }
    }

    public void seReproduire() {
        int i = 0;
        boolean b = false;
        if ((this.energie >= 5) && (this.loft.tableLofteur[x][y].length > 1)) {
            while ((i <= this.loft.tableLofteur[x][y].length) && (!b)) {
                if (this.sexe = this.loft.tableLofteur[x][y][i].sexe) {
                    i++;
                } else {
                    b = true;
                    this.energie -= 5;
                    this.loft.addLofteur(this.sexe, x,y);
                }
            }
        }
    }

    public void deplacer() {
        int i = (int) (Math.random() * 3) - 1;
        int j = (int) (Math.random() * 3) - 1;

        while ((0 > this.x + i) || (this.x + i > 99) || (0 > this.x + i) || (this.x + i > 99)) {
            i = (int) (Math.random() * 3) - 1;
            j = (int) (Math.random() * 3) - 1;
        }
        this.x += i;
        this.y += j;
    }

    public abstract void dessinerObjet(Graphics g);
}
