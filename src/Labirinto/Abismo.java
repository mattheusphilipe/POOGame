/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labirinto;

/**
 *
 * @author mathe
 */

import Abstratas.Personagem;
import java.util.*;
import Enimigos.*;
import Interfaces.Component;

// folha tipo 1
public class Abismo implements Component
{
    @Override
    public void andar(Personagem p)
    {
        System.out.println("Abismo encontrado, personagem " + p.getNome()+" Morreu \n");
    }
    
}
