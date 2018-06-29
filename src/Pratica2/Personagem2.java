/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratica2;

import Abstratas.Escudo;
import Ataques.Rapido;
import Ataques.Alto;
import Ataques.AtaqueForte;
import Abstratas.Personagem;
import Defesas.EscudoFogo;
import Poderes.*;
import Defesas.EscudoGelo;
import Defesas.EscudoTerra;

/**
 *
 * @author mattheus
 */
public class Personagem2 extends Personagem
{
    Escudo e2 = new EscudoTerra();
    Escudo e3 = new EscudoGelo();
    Escudo e4 = new EscudoFogo();
    
    public Personagem2(int x, int y, String nome)
    {
        
       
        setNome(nome);
        System.out.printf("-----------"+ getNome()+ " ---------\n ");
        System.out.printf(getNome()+"\n");
        setPos(x,y);
        setAtaque(new PoderFogo(new AtaqueForte()));
        setPular(new Alto());
        setCorrer(new Rapido());
        
        
        setEscudo(e4);
        e2.setSucessor(e3);
        e2.setSucessor(e4);
        e2.setSucessor(null);
        
            
        
        System.out.printf(" \n  \n");
        //System.out.printf("\n \n Teste sem escudos \n \n");
        atacar();
       
    
    }
}
