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
public class Personagem5 extends Personagem 
{
       Escudo e2 = new EscudoTerra();
    
    public Personagem5(int x, int y,String nome)
    {
        
        setNome(nome);
        System.out.printf(getNome()+"\n");
        show();
              
        setAtaque(new PoderTerra(new AtaqueFraco()));
        setPular(new Baixo());
        setCorrer(new Rapido());
        
        setEscudo(new EscudoGelo());
        
        e2.setSucessor(new EscudoGelo());
        e2.setSucessor(new EscudoFogo());
        e2.setSucessor(null);
        
        
        // e2.processaSaque();
      // receberAtaque(this.getAtaque());
        
        System.out.printf(" \n  \n");
        atacar();
    }
}
