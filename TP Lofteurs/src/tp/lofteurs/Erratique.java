/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.lofteurs;

public class Erratique extends Lofteur {
 
    
    public void Erratique(Loft lf) {
        super(15, lf) ;
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
