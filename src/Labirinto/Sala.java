/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labirinto;

import Abstratas.*;
import Interfaces.Component;

/**
 *
 * @author mathe
 */

// concrete composite 
public class Sala implements Component
{
    private Component caminho1;
    private Component caminho2;
    private String nome;
    private Enemy e;
    
    public Sala(Component c1, Component c2, String nome, Enemy e)
    {
        this.caminho1 = c1;
        this.caminho2 = c2;
        this.nome = nome;
        this.e = e;
    } 
    
    @Override
    public void andar(Personagem p)
    {
        
             try{
            Thread.sleep(2000);
        }
        catch(InterruptedException  e)
        {}
        System.out.println("Persoangem :" +p.getNome() +" Entrou na sala: " + this.nome);
        System.out.println("Persoangem :" +p.getNome() +" Encontrou o inimigo: " +e.getClass().getName());
        
        p.receberAtaque(e.getAtaque());        
        
        if(Math.random() < 0.5)
        {
            
                            
            System.out.println("Persoangem :" +p.getNome() +"pegou o caminho 1 \n");
            caminho1.andar(p);
        
        }else
        {
        
            System.out.println("Persoangem : " +p.getNome() +"pegou o caminho 2 \n");
            caminho2.andar(p);
        }
        
        
    }
    
}
