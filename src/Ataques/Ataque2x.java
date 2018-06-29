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
public class Ataque2x extends AtaqueDecorator
{
    public Ataque2x(Ataque a)
    {
        super(a);
        setDano(2 * a.getDano());
        setAtaque("Ataque 2x");
    }
}
