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
public abstract class Ataque 
{
   
    private String nomeataque;
    private int dano;    
       
    public void setAtaque(String a)
    {
        this.nomeataque = a;
    }
    
      public String getNomeAtaque()
    {
        return this.nomeataque;
    }
      
    public void setDano(int d)
    {
    
        this.dano = d;
    }
    public int getDano()
    {    
        return this.dano;
    }
}
