/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronadapter;

/**
 *
 * @author emman
 */
public interface  ArregloElementos {

    public abstract Elemento getElemento (int p);
    public abstract void addElemento(Elemento elemento);
    public abstract void listar();
    
}
