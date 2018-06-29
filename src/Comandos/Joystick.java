/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comandos;
import Abstratas.*;
import Interfaces.*;
import java.util.*;


/**
 *
 * @author mathe
 */
// invoker
public class Joystick
{
    //Command slot[] = new Command[10];
    ArrayList<Command> slot = new ArrayList<>();
    MacroCommand L = new MacroCommand();
    MacroCommand R = new MacroCommand();
    ArrayList<Command> log = new ArrayList();
    
    
    int i;
   // Command slot;
    Command undoCommand;
    
    public void setCommand(Command c,int n)
    {
        //slot[n] = c;
        slot.add(c);
        if(n == 6 || n == 7)            
        L.addCommand(c);        
        else if(n == 8|| n == 9)
        R.addCommand(c);   
    }
    
   
    
    public void BotaoPressionado(int n)
    { 
        //slot[n].execute();
        slot.get(n).execute();
        if(n == 6)            
        L.execute();        
        else if(n == 8)
        R.execute();   
        log.add(slot.get(n));
       // undoCommand = slot[n];
        undoCommand = slot.get(n);
    }
    
    public  String replay()
    {
        StringBuffer stringb = new StringBuffer();
        stringb.append("\n Replay \n");
        
        for(i = 0 ;  i<log.size();i++)
        {
            //log.get(i);
            stringb.append("[comando" + i + "]" + log.get(i).getClass().getName() + "\n");
        
        }
        
        /*
        for(i =0;i<10;i++)
        {
            stringb.append("[slot" + i + "]" + slot[i].getClass().getName() + "\n");
        }
                */
        
        return stringb.toString();
    }
    public void undo()
    {
    
        undoCommand.execute();
    
    }
    
}
