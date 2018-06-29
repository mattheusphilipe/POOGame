/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labirinto;

import Abstratas.Personagem;
import Interfaces.Component;

/**
 *
 * @author mathe
 */
public class Jogar implements Runnable
{
    private Personagem p;
    private Component labirinto;
    
    public Jogar(Component c,Personagem p)
    {
        this.p=p;
        this.labirinto =c;
    }
    
    @Override
    public void run()
    {
       
        labirinto.andar(p);
    }
    
    
}
