/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.lofteurs;

public class Cannibale extends Vorace {

    public Cannibale(Loft lf) {
        super(lf);
    }

    public void manger() {
        super.manger();
        if ((this.loft.tableLofteur[x][y].length > 0) && (this.besoin > this.energie)) {
            this.energie += this.loft.tableLofteur[x][y][0].energie;
            this.loft.supprimeLofteur(x, y, 0);
        }

    }
}
