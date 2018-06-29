/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Defesas;
import java.util.*;
import Abstratas.*;
/**
 *
 * @author mathe
 */
public class Defesa
{
    private Ataque a;
    private ArrayList<Escudo> escudos = new ArrayList<Escudo>();
    private double vida ;
    private String nome;
    boolean verify;
    
    public Defesa()
    {  
               
    }
    
    public Defesa(Ataque a, Escudo e, String n)
    {
    
        this.nome = n;
        this.escudos.add(e);
        this.vida = 100;
        this.a = a;
    
    }
    
    public void receberAtaque(Ataque a)
    {
    
        for(Escudo es :escudos)
        {
        
            verify = es.processaDefesa(a);
            if(verify == false)
            {
                receberDano(a);
            
            }
        }
    
    }
    
    public void receberDano(Ataque a)
    {
    
        double i = (a.getDano()) * 0.025;
        System.out.println("Personagem " + this.nome + "sofreu dano, Vida anterior: " +this.vida);
        this.vida = vida - i;
        System.out.println("Vida Atual :" + this.vida);
        
    }
    
    public void atacar(Defesa d)
    {
        d.receberAtaque(a);
    
    }
    
    public Ataque getAtaque()
    {
        return this.a;
    }
    
    public double getVida()
    {
    
    
        return this.vida;
    }
    
    
}
