/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comandos;

import Abstratas.Personagem;
import Interfaces.*;

/**
 *
 * @author mathe
 */
public class CorrerCommand implements Command
{
   // Correr correr;
    Personagem p;
    
    public CorrerCommand(Personagem per)
    {
        this.p = per;
    }
    
    @Override
    public void execute()
    {
    
       // System.out.println("\nFrom joystick\n ");
        this.p.setCorrer(p.getCorrer());       
    
    }
    
    
}
