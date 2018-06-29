/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Defesas;

import Abstratas.*;

/**
 *
 * @author mathe
 */
public class CampoMagnetico extends Escudo
{

    public CampoMagnetico()
    {
        setEscudo("Campo Magnetico");
        
    }
    
    /**
     *
     * @param a
     * @return
     */
    @Override
    public boolean processaDefesa(Ataque a)
    {
    
        if(a.getNomeAtaque().contains("RaioParalisante"))
        {
            System.out.println("Escudo ativado: "+ getEscudo() +" sem dano do ataque: " + a.getNomeAtaque());
            return true;
        }
        else if(getSucessor() != null)
        {
           getSucessor().processaDefesa(a);
        }
        
        return false;
        
    }
    
    
}
