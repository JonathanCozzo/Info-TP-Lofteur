/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.lofteurs;

/**
 *
 * @author jonathancozzo
 */
public abstract class Lofteur implements ObjetDessinable {
    protected int energie ;
    protected boolean sexe ; // 0 : mec et 1 : fille
    protected int besoin ;
    protected Loft loft ;
    protected int x ;
    protected int y ;
    
    public void Lofteur(int bs, Loft lf) {
        this.energie = 20 ;
        this.sexe = (Math.random() >= 0.5) ;
        this.besoin = bs ;
        this.loft = lf ;
        this.x = (int)(Math.random() * 100) ;
        this.y = (int)(Math.random() * 100) ;
    }
    
    public abstract void manger(){
        public void manger() {
            if ( ( !this.loft.tableNourriture[x][y].isEmpty() ) && (this.besoin > this.energie) ) 
            {
                if (besoin-energie >= this.loft.tableNourriture[x][y].getValeurEnerg())
                    {
                        this.energie += this.loft.tableNourriture[x][y].getValeurEnerg() ;
                        this.loft.supprimerNourriture(this.x, this.y) ;
                    }
                else
                    {
                        this.loft.tableNourriture[x][y].setValeurEnerg() = this.loft.tableNourriture[x][y].getValeurEnerg() + this.besoin - this.energie ;
                        this.energie = this.besoin ;
                    }
            }
        }
    }
    
    public void seReproduire() {
        int i = 0 ;
        boolean b = false ;
        if ( (this.energie>=5) && (this.loft.tableLofteur[x][y].size())) {
            while ((i<=this.loft.tableLofteur[x][y].size()) && (!b)) {
                if (this.sexe = this.loft.tableLofteur[x][y].get(i).sexe) {
                    i++ ;
                }
                else {
                    b = true ;
                    this.energie -= 5 ;
                    this.loft.addLofteur(this.sexe, this.loft.tableLofteur[x][y]) ;
                }
            }
        } 
    }
    
    public abstract void deplacer() ;
    
    public abstract void dessinerObjet(Graphics g) ;
    
}
