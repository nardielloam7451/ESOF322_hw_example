/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
/**
 *
 * @author Gabby Strong & Anthony Nardiello
 */
public class NoSQL extends StorageType{
    
    public NoSQL(int[] array){
        //constructor for the NoSQL class, which inherits from the Abstract class StorageTypes
        strategy="document";
        data=array;
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
