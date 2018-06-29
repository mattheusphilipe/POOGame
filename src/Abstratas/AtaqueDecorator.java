/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstratas;

/**
 *
 * @author Mattheus Phillipe
 */
public abstract class AtaqueDecorator extends Ataque
{
    private Ataque original;
    
    
    public AtaqueDecorator(Ataque original)
    {
        this.original = original; 
        this.setAtaque(original.getNomeAtaque());                      
    }   
    
    /// como setar o outro ataque???? 
    
    
       
    @Override
   public String getNomeAtaque()
   {
   
       return original.getNomeAtaque() + "," + super.getNomeAtaque();
   
   }
   

    
}
