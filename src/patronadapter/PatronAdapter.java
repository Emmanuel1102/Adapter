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
public class PatronAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("TEST DE ARREGLO COMUN\n");
         ArregloElementos arregloTEST = new Arreglo();
        Elemento e7 = new Elemento(7, "ELEMENTO GENERICO 7");
        Elemento e8 = new Elemento(8, "ELEMENTO GENERICO 8");
        arregloTEST.addElemento(e7);
        arregloTEST.addElemento(e8);
        arregloTEST.listar();
        arregloTEST.getElemento(1);
        
        System.out.print("TEST DE DB\n");
        
        ArregloElementos DBA = new AdaptadorArchivo();
        
        DBA.addElemento(e7);
        DBA.addElemento(e8);
        DBA.getElemento(10);
        DBA.listar();
        
        
    }
    
}
