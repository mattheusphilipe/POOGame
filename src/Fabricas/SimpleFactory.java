/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Abstratas.*;
import Pratica2.*;

/**
 *
 * @author mathe
 */
public class SimpleFactory 
{
    private static SimpleFactory instancia = null;
    
    private SimpleFactory()
    {
       super();
    }
    public static synchronized SimpleFactory getInstancia()
    {
        if(instancia == null)
            instancia = new SimpleFactory();
        return instancia;
    }
    public  Personagem createPersonagem()
    {
        double n = (Math.random() * (1 - 0) + 0);
        
        Personagem p = null;
        if( n <= 0.2)
        {        
            p = new Personagem1(0,0,"Usher");
            
        }else if(n > 0.2 & n<= 0.4)
        {        
            p = new Personagem2(0,0,"Drake");   
            
        } else if(n > 0.4 & n <= 0.6 )
        {        
            p = new Personagem3(0,0,"Nas");
        
        }else if(n > 0.6 & n <= 0.8)
        {
            p = new Personagem4(0,0,"Eminem");
            
        }else if(n <= 1.0 & n > 0.8)
        {
            p = new Personagem5(0,0,"Nicky Cannon");
        }
        
        return p;
    }
    
}
