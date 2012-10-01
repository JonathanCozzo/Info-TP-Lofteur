/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.lofteurs;

/**
 *
 * @author jonathancozzo
 */
public abstract class Lofteur {
        protected int energie ;
    protected boolean sexe ; // 0 : mec et 1 : fille
    protected int beasoin ;
    protected Loft loft ;
    protected int x ;
    protected int y ;
    
    public abstract void manger() ;
    
    public void seReproduire() {
        int i = 0 ;
        boolean b = false ;
        if ( (this.energie>=5) && (this.loft.tableLofteur[x][y].size()>1)) {
            while ((i<=this.loft.tableLofteur[x][y].size()) && (!b)) {
                if (this.sexe = this.loft.tableLofteur[x][y].get(i).sexe) {
                    i++ ;
                }
                else {
                    b = true ;
                    this.energie -= 5 ;
                    this.loft.add(this.sexe, this.loft.tableLofteur[x][y]) ;
                }
            }
        } 
    }
    
}
