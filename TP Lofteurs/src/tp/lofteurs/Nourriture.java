/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.lofteurs;

import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author jonathancozzo
 */
public abstract class Nourriture implements ObjetDessinable {

    protected int valEnerg;
    protected int x;
    protected int y;

    public Nourriture(int val, int x1, int y1) {
        this.valEnerg = val;
        this.x = x1;
        this.y = y1;
    }

    public int getValEnerg() {
        return this.valEnerg;
    }

    public void setValEnerg(int val) {
        this.valEnerg = val;
    }

    public void dessinerObjet(Graphics g) {
        g.fillOval(x * Loft.TAILLE_CASE_X, y * Loft.TAILLE_CASE_Y, Loft.TAILLE_CASE_X, Loft.TAILLE_CASE_Y);
        g.setColor(Color.black);
    }
}
