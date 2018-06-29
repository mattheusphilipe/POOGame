/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstratas;
import Abstratas.*;

/**
 *
 * @author mathe
 */
public abstract class PersonagemStore
{
  /*  
    SimpleFactory factory;
    
    public PersonagemStore(SimpleFactory factory)
    {
        this.factory = factory;
    }
   */
    public abstract Personagem createPersonagem(); 
    //public abstract PersonagemStore getInstance();
    /*
    public Personagem OrderPersonagem()
    {
    
        Personagem p = null;
        
      // metodo createPersonagem é estatico e nao precisa ser criada uma fabirca para isso
        p = SimpleFactory.createPersonagem();
       // p = factory.createPersonagem();
        
        return p;
    }
    
    */
  //  public abstract AdvancedFactory getInstancia();
  //  public abstract Personagem orderPersonagem();
            
}
