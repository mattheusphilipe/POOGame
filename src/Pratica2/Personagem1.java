/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratica2;

import Poderes.PoderTerra;
import Ataques.Medio;
import Ataques.AtaqueForte;
import Abstratas.*;
import Defesas.EscudoFogo;
import Defesas.EscudoGelo;
import Defesas.EscudoTerra;

/**
 *
 * @author mattheus
 */
public class Personagem1 extends Personagem
{
    
    Escudo e2 = new EscudoTerra();
    Escudo e3 = new EscudoGelo();
    Escudo e4 = new EscudoFogo();
    Escudo e5 = null;
    public Personagem1(int x, int y,String nome)
    {
        
        setNome(nome);
        System.out.printf(getNome()+"\n");
       // setPos(x,y);        
             
        setAtaque(new PoderTerra(new AtaqueForte()));
        setPular(new Medio());
        setCorrer(new Medio());
        
        setEscudo(e2);
        
        e2.setSucessor(e3);
        e2.setSucessor(e4);
        e2.setSucessor(null);              
       
      //  receberAtaque(this.getAtaque());   
        
        
        System.out.printf(" \n  \n");
        //System.out.print(" \n \nTeste sem escudos \n \n");
        atacar();
      //  this.show(); 
        
    }   
    
   
}
