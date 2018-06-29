/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comandos;

import Interfaces.Command;
import java.util.*;

/**
 *
 * @author mathe
 */
public class MacroCommand implements Command
{
    ArrayList<Command> macro = new ArrayList<>();
    
    public void addCommand(Command c)
    {
    
        macro.add(c);
    
    }
    
    @Override
    public void execute()
    {
        System.out.println("Macros From joystick:  ");
        for(Command c: macro)
        {
            
            c.execute();
        
        }
    
    }
    
}
