/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.lofteurs;

import java.awt.Graphics;

public class Vorace extends Lofteur {

    public Vorace(Loft lf) {
        super(30, lf);
    }

    public void deplacer() {
        int a=0, b=0, i, j;
        boolean trouve = false;
        for (i = -1; i<=1; i++) {
            for (j = -1; j<=1; j++) {
                if ((0 <= this.x + i) && (this.x + i <= 99) && (0 <= this.x + i) && (this.x + i <= 99)) {
                    if (!(this.loft.tableNourriture[x + i][y + j]==null)) {
                        a = i;
                        b = j;
                        trouve = true;
                    }
                }
            }
        }
        if (!trouve) {
            super.deplacer();
        } else {
            this.x += a;
            this.y += b;
        }

    }

	@Override
	public void dessinerObjet(Graphics g) {
		// TODO Auto-generated method stub
		
	}
    
}
