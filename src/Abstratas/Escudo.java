/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstratas;

/**
 *
 * @author mathe MY HANDLER
 */
public abstract class Escudo
{
 private String NomeEscudo;
 private Escudo sucessor;
 
 public void setEscudo(String v)
 {
     this.NomeEscudo = v;
 }
 
 public String getEscudo()
 {
 
     return this.NomeEscudo;
 
 }
 
 
 /*
 public void setSucessor(Escudo s)
 {
     if(sucessor == null)
     {         
        
         this.sucessor = s;
     
     }
     else
     {
     
         sucessor.setSucessor(s);
     
     }
 }
 */
 
 public void setSucessor(Escudo s)
 {
 
    this.sucessor  = s;
     
 }
 
 
    
 public Escudo getSucessor()
 {
 
     return this.sucessor;
 
 }
 
 public abstract boolean processaDefesa(Ataque a);
 
}
