package nardiello_strong;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Gabrielle Strong and Anthony Nardiello
 */
public abstract class StoreageType {//creates the abstract class storage type from which our storage types will inherit. 
    public int[] data;//an integer array data, that stores all of our data while we are working with it
    public String strategy;//the string for our data type that takes in and states what our current storage type is. 
    
    public final void store()throws IOException{
        //this implements the store type that is currently set as the storage strategy. 
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));//this takes in and creates a buffered writer to output to the file. 
        for(int i=0;i>data.length;i++){//goes through and takes each data point out of the array and prints them to our storage type. 
            String dataPoint = Integer.toString(i);
            bw.write(dataPoint);
        }
        bw.newLine();
        bw.write("The storage strategy being used is "+strategy);
    } 
    abstract void setStoreStrategy();//this method takes in our storage type, and then calls the store method accordingly. 
    
}
