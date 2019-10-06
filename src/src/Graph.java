
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabby Strong & Anthony Nardiello
 */
public class Graph extends StorageType{
     public Graph(int[] garray){
         //constructor for the graph storage type, which inherits from the storage types
         strategy="node";
         data=garray;
         this.fileWriter();
     }
    
    public void setStoreStrategy(String stratName)
    {
    //sets the storage type 
        strategy=stratName;
        try{
            this.store();
            bw.close();
        }catch(IOException e){System.out.println(e);}
    }
}
