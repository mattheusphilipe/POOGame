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
public class EscudoTerra extends Escudo
{
    public EscudoTerra()
    {
    
            setEscudo("Escudo Terra");
    }
    
    @Override
    public boolean processaDefesa(Ataque a)
    {
        if(a.getNomeAtaque().contains("Poder Terra"))
        {
            System.out.println("Escudo Ativado: sem dano do ataque"+ a.getNomeAtaque());
            return true;
            
        }
        else if(getSucessor() != null) //?
        {
        
            getSucessor().processaDefesa(a);
            
        }
        return false;
    
    }
    
}
