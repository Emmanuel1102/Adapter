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
public class Elemento {
    
    protected int Id;
    protected String Name;
    
    
     public Elemento(){
     
     
     }
     
     
     public Elemento(int Id, String Name){
     
         this.Id=Id;
         this.Name=Name;
     
     }
    
    
       public int getId()
       {
         return Id;
       }
       
        public void setId(int Id)
        {
           this.Id = Id;
        }

        
         public String getName()
       {
         return Name;
       }
       
        public void setName(String Name)
        {
           this.Name = Name;
        }
    
         @Override
    public String toString() {
        return "ID = " + Id + ", Nombre del objeto = " + Name ;
    }
    
}
