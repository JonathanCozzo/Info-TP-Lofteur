/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.lofteurs;

public class Erratique extends Lofteur {
 
    
    public void Erratique(Loft lf) {
        super(15, lf) ;
    }
    
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
    
    public void deplacer() {
        int i = (int)(Math.random()*3) - 1 ;
        int j = (int)(Math.random()*3) - 1 ;
        
        while ( (0 > this.x + i) || (this.x + i > 99) || (0 > this.x + i) || (this.x + i > 99) )
            {
                i = (int)(Math.random()*3) - 1 ;
                j = (int)(Math.random()*3) - 1 ;
            }
        this.x += i ;
        this.y += j ;
    }
    
    /*
    public void dessinerObjet(Graphics g) {
        
    }
    */      
    
}
