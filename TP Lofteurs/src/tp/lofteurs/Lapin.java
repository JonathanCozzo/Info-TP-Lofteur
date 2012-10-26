/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.lofteurs;

public class Lapin extends Lofteur {

	public Lapin(Loft lf) {
		super(20);
	}

	public deplacer(){
	        int a, b;
	        boolean trouve = false;
	        for (i = -1; i++; i <= 1) {
	            for (j = -1; j++; j <= 1) {
	                if ((0 <= this.x + i) && (this.x + i <= 99) && (0 <= this.x + i) && (this.x + i <= 99)) {
	                    if (this.loft.tableLofteur[x+i][y+j].size() > 0) {
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
