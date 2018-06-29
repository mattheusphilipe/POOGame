/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enimigos;

import Abstratas.*;
import Interfaces.*;
/**
 *
 * @author a11521BSI249
 */
public class Enemy1 extends Enemy 
{
    private int x,y;
    
   public Enemy1(int x, int y,Ataque a)
   {
       
     this.x = x;
     this.y = y;
     setAtaque(a);
    
   }

  
   
          
  
    
}
