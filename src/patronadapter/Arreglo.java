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
public class Arreglo implements ArregloElementos {

    private Elemento[] elementos;
    
    
    public Arreglo() {
        super();
        elementos = new Elemento[0];
    }
    
    @Override
    public Elemento getElemento(int p) {

     Elemento e = new Elemento();
        if (p < elementos.length) {
            e = elementos[p];
            System.out.println("EL ELEMENTO ES: "+e.getName());
        }
        return e;


    }

    @Override
    public void addElemento(Elemento elemento) {

        
        Elemento[] tem = new Elemento[elementos.length + 1];
        System.arraycopy(elementos, 0, tem, 0, elementos.length);
        tem[elementos.length] = elemento;
        elementos= tem;


    }

    @Override
    public void listar() {        
        for  (int x=0; x<elementos.length; x++)
       System.out.println(elementos[x]);
    }
    
    
    
    
}
