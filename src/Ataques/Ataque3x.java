/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ataques;
import Abstratas.*;

/**
 *
 * @author mathe
 */
public class Ataque3x extends AtaqueDecorator
{
     public Ataque3x(Ataque a)
    {
        super(a);
        setDano(3 * a.getDano());
        setAtaque("Ataque 3x");
    }
}
