import java.io.IOException;
/**
 *
 * @author Gabby Strong & Anthony Nardiello
 */
public class Relational extends StorageType{
    public Relational(int[] rarray){
         //constructor for the graph storage type, which inherits from the storage types
         strategy="table";
         data=rarray;
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
