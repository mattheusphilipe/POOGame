/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Abstratas.PersonagemStore;
import Abstratas.Personagem;
import Pratica2.Arqueiro;

/**
 *
 * @author mathe
 */
public class MedievalFactory extends PersonagemStore
{
    private static MedievalFactory instance = null;
    
    public static synchronized MedievalFactory getInstancia()
    {
        if(instance == null)
            instance =  new MedievalFactory();
        
        return instance;
    
    }
    
    private MedievalFactory()
    {
        super();
    }
    
    @Override
    public Personagem createPersonagem()
    {
        Arqueiro arq = new Arqueiro(0,0);
        
        return arq;
    }
}
