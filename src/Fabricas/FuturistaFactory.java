/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Abstratas.PersonagemStore;
import Abstratas.Personagem;
import Pratica2.Robo;

/**
 *
 * @author mathe
 */
public class FuturistaFactory extends PersonagemStore
{
    private static FuturistaFactory instance = null;
    
    private FuturistaFactory()
    {super();}
    
    public static synchronized FuturistaFactory getInstancia()
    {
        if(instance == null)
            instance = new FuturistaFactory();
        
        return instance;
       
    }
    
    @Override
    public Personagem createPersonagem()
    {
        Personagem robo = new Robo(0,0);

        return robo;
    }
}
