/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronadapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emman
 */
public class AdaptadorArchivo implements ArregloElementos{

    ConexionArchivo ConA;
    
    
   public AdaptadorArchivo() {
        super();
        ConA = new ConexionArchivo();
    }

    @Override
    public Elemento getElemento(int p) {
     
            List<Elemento> ele = ConA.Listar();
        if (ele.size() > p - 1 && p - 1 >= 0) {
            return ele.get(p - 1);
        } else {
            System.out.println("LA POSICION NO EXISTE");
            return null;
        }
        
    }

    @Override
    public void addElemento(Elemento elemento) {


       ConA.addElemento(elemento);

    }

    @Override
    public void listar() {

       List<Elemento> elemento = ConA.Listar();
        elemento.forEach((elementos) -> {
            System.out.println( elementos.toString());
        });


    }
    
}
