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
public class EscudoFogo extends Escudo
{
    public EscudoFogo()
    {
        setEscudo("Escudo Fogo");
    }
    
   
    
    @Override
    public boolean processaDefesa(Ataque a)
    {
    
          if(a.getNomeAtaque().contains("Poder Fogo"))
          {
            System.out.println("Escudo ativado: "+ getEscudo() +" sem dano do ataque: " + a.getNomeAtaque());
              return true;
          }
          else if(getSucessor() != null)
          {
          
              System.out.println("Sem escudos disponiveis");
              
              
          }
          
          return false;
              
    
    }
}
