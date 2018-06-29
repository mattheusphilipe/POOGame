/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poderes;

import Abstratas.*;

/**
 *
 * @author mathe
 */
public class PoderFlecha extends AtaqueDecorator
{
    
    public PoderFlecha(Ataque a)
    {
        super(a);
        setAtaque("Ataque Flecha");
    }
    
}
