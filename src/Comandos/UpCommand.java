/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comandos;

import Abstratas.Personagem;
import Interfaces.Command;

/**
 *
 * @author mathe
 */
public class UpCommand  implements Command
{
    Personagem p;
    public UpCommand(Personagem per)
    {
        this.p = per;    
    
    }
    
    @Override
    public void execute()
    {
        System.out.println("\nPersonagem movimentou para cima\n ");
        p.setPos(p.getX()-10,p.getY()-10);
        
    }
    
    
}
