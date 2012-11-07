/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.lofteurs;

import java.awt.Graphics;

/**
 *
 * @author jonathancozzo
 */
public abstract class Nourriture implements ObjetDessinable {
	protected int valEnerg;
	
	public Nourriture(int val){
		this.valEnerg = val;
	}
	
	public int getValEnerg(){
		return this.valEnerg;
	}
    
	public void setValEnerg(int val){
		this.valEnerg=val;
	}
	
	public abstract void dessinerObjet(Graphics g);
}
