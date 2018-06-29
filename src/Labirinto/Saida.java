/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labirinto;

import Abstratas.Personagem;
import Interfaces.Component;

/**
 *
 * @author mathe
 */

// nó folha tipo 2
public class Saida implements Component
{
     @Override
    public void andar(Personagem p)
    {
    
        System.out.println("Saida encontrada, personagem:" +p.getNome()+" venceu \n");
    
    }
}
