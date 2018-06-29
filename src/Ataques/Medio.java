/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ataques;

import Interfaces.Pular;
import Interfaces.Correr;

/**
 *
 * @author mattheus
 */
public class Medio implements Correr, Pular
{
    
    @Override
    public void correr()
    {
    
        System.out.printf("Correr Médio \n");
    
    }
    
    @Override
    public void pular()
    {
        System.out.println("Pulando  Médio \n");
    
    }
    
}
