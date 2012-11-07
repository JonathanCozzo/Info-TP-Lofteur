/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.lofteurs;

import java.awt.Graphics;
import java.awt.Color;

public class Soda extends Nourriture {

    public Soda(int x, int y) {
        super(5, x, y);
    }

    @Override
    public void dessinerObjet(Graphics g) {
        super.dessinerObjet(g);
        g.setColor(Color.black);
    }
}
