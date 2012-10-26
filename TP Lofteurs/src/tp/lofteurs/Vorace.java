/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.lofteurs;

public class Vorace extends Lofteur {

    public Vorace(Loft lf) {
        super(30, lf);
    }

    public void deplacer() {
        int a, b;
        boolean trouve = false;
        for (i = -1; i++; i <= 1) {
            for (j = -1; j++; j <= 1) {
                if ((0 <= this.x + i) && (this.x + i <= 99) && (0 <= this.x + i) && (this.x + i <= 99)) {
                    if (!this.loft.tableNourriture[x + i][y + j].isEmpty()) {
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
    
}
