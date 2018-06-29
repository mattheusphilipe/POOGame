/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enimigos;

import Abstratas.*;

/**
 *
 * @author a11521BSI249
 */
public class Enemy2 extends Enemy
{
   private int x,y;
    
   public Enemy2(int x, int y,Ataque a)
   {
       
     this.x = x;
     this.y = y;
     setAtaque(a);
     
   }
    
}
