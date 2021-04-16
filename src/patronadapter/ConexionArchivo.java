/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronadapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConexionArchivo {
    
    //"jdbc:derby://localhost:1527/ADAPTADORBASE","EMMA","123"
    
    
    public Connection ConexionDB(){
        Connection con = null;

         try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/ADAPTADORBASE","EMMA","123");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;

     }
    
   

      
      public boolean addElemento(Elemento elemento) {
        Connection conexion;
        PreparedStatement ps;

     
        try {
            conexion = ConexionDB();
            ps = conexion.prepareStatement("INSERT INTO EMMA.OBJ ( Id, Name) values (?, ?)");
            ps.setInt(1, elemento.getId());
            ps.setString(2, elemento.getName());
         
            ps.executeUpdate();

            cerrarCon(conexion);
            return true;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return false;
    }


public List<Elemento> Listar() {
        Connection conex;
        PreparedStatement ps;
        List<Elemento> elementoLista = new ArrayList<>();

     

        try {
            conex = ConexionDB();
            ps = conex.prepareStatement( "SELECT * FROM  EMMA.OBJ");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Elemento ListEl = new Elemento();

                ListEl.setId(rs.getInt(1));
                ListEl.setName(rs.getString(2));
               

               elementoLista.add(ListEl);
            }
            cerrarCon(conex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return  elementoLista;
    }

   public void cerrarCon(Connection con) throws SQLException {
        con.close();
    }





    
}
