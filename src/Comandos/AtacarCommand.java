/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comandos;

import Abstratas.*;
import Interfaces.Command;

/**
 *
 * @author mathe
 */
public class AtacarCommand implements Command
{
    Personagem p;
    
    public AtacarCommand(Personagem per)
    {
    
        this.p = per;
    
    }
    
    @Override
    public void execute()
    {
       // System.out.println("\nFrom joystick\n ");
        //System.out.println(this.ataque.getNomeAtaque());
          p.atacar();
    }
    
}
