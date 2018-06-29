/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Abstratas.*;
import Ataques.RaioParalisante;
import Comandos.*;

/**
 *
 * @author mathe
 */
public class CommandFactory
{
    public static CommandFactory instancia = null;
    private CommandFactory()
    {
        super();
    }
    
    public static synchronized CommandFactory getInvoker()
    {
    
        if(instancia == null)
            instancia = new CommandFactory();
        return instancia;
        
    }
    
    public void createJoystick(Personagem p)
    {
    
        Joystick j = new Joystick();
        
         j.setCommand(new PularCommand(p),0);
         j.setCommand(new AtacarCommand(p),1);
         j.setCommand(new DownCommand(p),2);
         j.setCommand(new MagiaCommand(new RaioParalisante()),3);
         j.setCommand(new RightCommand(p),4);
         j.setCommand(new LeftCommand(p),5);
         j.setCommand(new UpCommand(p),6);
         j.setCommand(new CorrerCommand(p),7);
         j.setCommand(new RightCommand(p),8);
         j.setCommand(new PularCommand(p),9);
         j.setCommand(new PularCommand(p),10);
         
         int i;
         for(i=0;i<11;i++)
             j.BotaoPressionado(i);
         
        System.out.println(j.replay()); 
    }
}
