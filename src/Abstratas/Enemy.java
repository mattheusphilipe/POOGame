/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstratas;

import Interfaces.Sujeito;
import Interfaces.Observador;


/**
 *
 * @author Mattheus Phillipe
 */
public abstract class Enemy implements Observador 
{
    private int x;
    private int y;
    private Ataque a;
    
   
    
   
    public void setAtaque(Ataque a)
    {
        this.a = a;
    }
    
    public Ataque getAtaque()
    {    
        return this.a;        
    }
    
   
    @Override
    public void update(Sujeito s)  
    {
    
        Personagem personagem = (Personagem)s; /// what the fuck ?? type cast ..
    while(true)
    {    
         if(personagem.getVida() <= 0 )
            {
            
               System.out.println("Personagem Morto: "+personagem.getClass());
               break;
            }
        if((this.x - personagem.getX() == 0) && (this.y - personagem.getY() == 0) && personagem.getVida() > 0)
        {
            System.out.printf("\n Personagem: "+personagem.getNome()+" Atingido por..."
                    + getClass().getName() + " " +  a.getClass().getName() + "\n");
            /*
            
            personagem.setVida(personagem.getVida() - personagem.danoRecebido());    //processa cada dano recebido de cada inimigo
            
            ou ....
             */          
            personagem.danoRecebido();    //processa cada dano recebido de cada inimigo 
           //  personagem.receberDano(personagem.getAtaque());
            System.out.println("Vidal Atual : " + personagem.getVida());
            
           
            
          try{
               Thread.sleep(200); //Coloca a thread para dormir pelo tempo em milisegundos
            }
            catch(InterruptedException e)
            {
            }    
                           
               // personagem.setPos(personagem.getX()+5, personagem.getY()-5);             
            
            
            
                        
              // personagem.setPos(personagem.getX() -5, personagem.getY()+5);                
                       
         
        // mudar logica de andar os personagens para o enimigo 4 andar.  
        }
        else
        {
        //andar para frente 
            if (personagem.getX() > this.x)
            {
            
                this.x = this.x+1;
            
            }else
            {
                this.x = this.x-1;
            }
            // andar para tras
            if (personagem.getY() > this.y)
            {
            
                this.y = this.y+1;
            
            }else
            {
                this.y = this.y-1;
            }
        }
    
    }
    
  }// fim while
}
