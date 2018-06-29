
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstratas;

import Interfaces.Sujeito;
import Interfaces.Pular;
import Interfaces.Correr;
import Interfaces.Observador;
import java.util.*;
/**
 *
 * @author mattheus
 */
public abstract class Personagem implements Sujeito 
{
    
  private Ataque a;
  private Pular p;
  private Correr c;
 // private ArrayList<Escudo> escudos = new ArrayList<Escudo>();
  boolean verify = false;
  private Escudo escudos; 
  private int  x, y;
  private String nome;
  
  private double vida;
  
  private ArrayList<Observador> vetor = new ArrayList<>(); 
  
  
  public Personagem()
  {
  
      this.vida = 100;
      
  }
  
  public void setNome(String n)
  {
      this.nome = n;
  }
  
  public String getNome()
  {
      return this.nome;
  }
  public void setAtaque(Ataque a)
  {
      this.a = a;
     
  }

  public void setCorrer(Correr c)
  {
  
      this.c  = c;
      c.correr();
      
  }
 
  
  public void setPular(Pular p)
  {
  
      this.p = p;
      p.pular();
  }
  
    public void atacar()
    {
        System.out.println("Ataques: " + a.getNomeAtaque());
    }
  
  public Ataque getAtaque() {   return a; }
  
  public Pular getPular() {  return p;  }
  
  public Correr getCorrer(){ return c;  }
  
  
    public void setPos(int x, int y)
  {  
      this.x = x;
      this.y = y;
      
  }
 
  /*  
  public int danoRecebido()
  {
  
     System.out.println("Dano de vida sofrido. Vida anterior : "+ this.getVida());
     return a.getDano();         
  }

    ou ...
    */
    
     
 public void  danoRecebido()
  {
  
     System.out.println("Dano de vida sofrido. Vida anterior : "+ this.getVida());
     setVida(this.getVida() - a.getDano()); // aqui ou no enimigo
          
  }
 
  public void setEscudo(Escudo e)
  {
       this.escudos = e; 
  } 
  
  
  public void receberAtaque(Ataque a)
    {
    
       // for(Escudo es :escudos)
        //{
        
            verify = escudos.processaDefesa(a);
            if(verify == false)
            {
                receberDano(a);
            
            }
        //}
    
    }
  
   public void receberDano(Ataque a)
    {
    
        double i = (a.getDano()) * 0.025;
        System.out.println("Personagem " + this.getClass().getName() + " sofreu dano, Vida anterior: " +this.vida);
        this.vida = vida - i;
        System.out.println("Vida Atual :" + this.vida);
        
    }
 
  public void setVida(double v)
  {     
      this.vida = v;      
  }

    public int getX() { return this.x;}
    
    public int getY(){ return this.y;}    
   
    public double getVida(){ return vida;} 
   
    @Override
    public void registerObserver(Observador o)
    {    
        vetor.add(o);       
    
    }
    
    @Override
    public void removeObserver(Observador o)
    {
    
        vetor.remove(o);
    
    }
    
    @Override
    public void notifyObserver()
    {
    
        for(Observador o: vetor)
        {
        
            o.update(this); // passando o proprio objetoobjeto 
        
        }
    
    }
    
   
    public void show()
    {
    
        notifyObserver();
    
    }
    
}


