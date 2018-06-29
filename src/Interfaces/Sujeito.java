/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author a11521BSI249
 */
public interface Sujeito
{
    
    public abstract void registerObserver(Observador o);
    public abstract void removeObserver(Observador o);
    public abstract void notifyObserver();
}
