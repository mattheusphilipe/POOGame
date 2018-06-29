/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poderes;

import Abstratas.AtaqueDecorator;
import Abstratas.Ataque;

/**
 *
 * @author Mattheus Phillipe
 */
public class PoderAgua extends AtaqueDecorator
{
    public PoderAgua(Ataque a)
    {
        super(a);
        setAtaque("Poder Agua");
        setDano(3);
    }
    
}
