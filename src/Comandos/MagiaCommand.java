/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comandos;
import Abstratas.Ataque;
import Ataques.RaioParalisante;
import Interfaces.*;
/**
 *
 * @author mathe
 */
public class MagiaCommand implements Command
{
    RaioParalisante a;
    
    public MagiaCommand(RaioParalisante a)
    {
        this.a = a;
    }
    
    @Override
    public void execute()
    {
    
        //System.out.println("\nFrom joystick\n ");
        System.out.println(this.a.getNomeAtaque());
    
    }
}
