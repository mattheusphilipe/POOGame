/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratica2;

import Abstratas.Escudo;
import Poderes.*;
import Ataques.Rapido;
import Ataques.Baixo;
import Ataques.AtaqueFraco;
import Abstratas.Personagem;
import Defesas.EscudoFogo;
import Defesas.EscudoGelo;
import Defesas.EscudoTerra;

/**
 *
 * @author mathe
 */
public class Personagem4 extends Personagem
{
     Escudo e2 = new EscudoTerra();
    
    public Personagem4(int x, int y, String Nome)
    {
        System.out.printf("Personagem 4 \n ");
        show();
        setNome(Nome);      
        setAtaque(new PoderAgua(new AtaqueFraco()));
        setPular(new Baixo());
        setCorrer(new Rapido());
        
        setEscudo(new EscudoGelo());
        
        e2.setSucessor(new EscudoGelo());
        e2.setSucessor(new EscudoFogo());
        e2.setSucessor(null);
        
        
        
       // receberAtaque(this.getAtaque());
        
        System.out.printf(" \n  \n");
       // System.out.printf(" \n \nTeste sem escudos \n \n");
        atacar();
    }
    
}
