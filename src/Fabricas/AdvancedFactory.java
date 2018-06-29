/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

/**
 *
 * @author mathe
 */
import Abstratas.PersonagemStore;
import Abstratas.*;
import Ataques.*;
import Poderes.*;

public class AdvancedFactory  extends PersonagemStore
{
    private static AdvancedFactory instancia = null;
 
    public static synchronized AdvancedFactory getInstancia()
    {
        if(instancia == null)
            instancia = new AdvancedFactory();
        return instancia;
    }
    private AdvancedFactory()
    {super();}
   /* 
    Personagem c1 = createPersonagemAdvanced();
    Personagem c2 = createPersonagemAdvanced();
    Personagem c3 = createPersonagemAdvanced();
    Personagem c4 = createPersonagemAdvanced();
    Personagem c5 = createPersonagemAdvanced();
    */

    /**
     *
     * @return
     */
    
    @Override
    public Personagem createPersonagem()
    {
    
      SimpleFactory s = SimpleFactory.getInstancia();
      Personagem p = s.createPersonagem();
      
        double n = (Math.random() * (1 - 0) + 0);
        
        if (n <= 0.2)
        {
            
            p.setAtaque(new AtaqueForte());             
        }
        else if (n <= 0.4)
        {
           p.setAtaque(new Ataque3x(p.getAtaque()));             
        }
         else if (n <= 0.6)
         {            
            p.setAtaque(new  Ataque2x(p.getAtaque()));             
         }
         else if (n <= 0.8) 
         {
             p.setAtaque(new PoderAgua(p.getAtaque()));  
            
        }
         
        return p;
    }
}
