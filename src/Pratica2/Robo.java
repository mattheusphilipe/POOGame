/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratica2;

import Abstratas.*;
import Ataques.*;
import Defesas.*;
import Poderes.PoderFlecha;

/**
 *
 * @author mathe
 */
public class Robo extends Personagem
{
    Escudo e2 = new EscudoTerra();
    Escudo e3 = new EscudoGelo();
    Escudo e4 = new EscudoFogo();
    Escudo e5 = null;
    
    public Robo (int x, int y)
    {
    
        System.out.printf("---------Robo---------\n ");
        show();
        
        setAtaque(new RaioParalisante());
        setEscudo(new CampoMagnetico());
        
        e2.setSucessor(new EscudoGelo());
        e2.setSucessor(new EscudoFogo());
        e2.setSucessor(null);
        
        atacar();
        
    
    
    }
}
