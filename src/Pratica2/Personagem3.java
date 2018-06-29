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
 * @author mattheus
 */
public class Personagem3 extends Personagem             
{
   Escudo e2 = new EscudoTerra();
    
    public Personagem3(int x, int y,String nome)
    {
        System.out.printf("--------------Personagem 3 ------------\n ");
        setPos(x,y);
        setNome(nome);      
        setAtaque(new PoderAgua(new AtaqueFraco()));
        setPular(new Baixo());
        setCorrer(new Rapido());
        
        setEscudo(new EscudoGelo());
        
        e2.setSucessor(new EscudoGelo());
        e2.setSucessor(new EscudoFogo());
        e2.setSucessor(null);
        
        
        
      // receberAtaque(this.getAtaque());
        
        System.out.printf(" \n  \n");
        //System.out.printf(" \n \nTeste sem escudos \n \n");
        atacar();
    }
    
}
