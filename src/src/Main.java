import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author Gabby Strong & Anthony Nardiello
 */
public class Main {
     public static void main(String args[])
    {
       int[] num = {12, 55, 6, 23, 200, 102, 600, 44};
       NoSQL store1 = new NoSQL(num);
       Relational store2 = new Relational(num); 
       Graph store3 = new Graph(num);
       
       Scanner in = new Scanner(System.in); //user input
       int choice = 2;
       int choice2 = 2;
       int choice3 = 2;
       int choice4 = 2;
       System.out.println("Strategy System Storer");
       
       while (choice !=1)
       {
           //menu
           System.out.println("1. Quit.");
           System.out.println("2. NoSQL.");
           System.out.println("3. Relational.");
           System.out.println("4. Graph.");
           
           //read in users's menu choices and store in variable choce
           System.out.print("\n Please Enter Your choice:");
           choice = in.nextInt();
           System.out.println();
           
           //program actions
           switch (choice)
           {
               case 1: //if user picks 1 to quit
                   System.out.println("Thank you for using the Storage System.");
                   break;
               case 2: 
                    //if user picks 2 to use NoSQL storage
                   try{
                    store1.store();
                    System.out.println("NoSQL stored data as a document");
                   }catch(IOException e){System.out.println(e);}
                   //checking if the user wants to store the data as not the default storage type
                  while (choice2 !=1)
                  {
                      System.out.print("\n Would you like to change the storage type?:");
                      System.out.println();
                      //returns to the main menu
                      System.out.println("1. No, Main Menu.");
                      //calling "table" storage
                      System.out.println("2. Yes, Table.");
                      //calling "node" storage
                      System.out.println("3. Yes Node(s).");
                      
//prompts user
                     //read in users's menu choices and store in variable choce
                     System.out.print("\n Please Enter Your choice:");
                     choice2 = in.nextInt();
                     System.out.println();
                     switch (choice2)
                     {
                       case 1:
                           break;
                           
                       case 2:
                           //changes to "table" storage
                           store1.setStoreStrategy("table");
                           System.out.println("Strorage type changed to table");
                           choice2 =1;
                           break;
                       case 3:
                           //changes to "node" storage
                           store1.setStoreStrategy("node");
                           System.out.println("Strorage type changed to node");
                           choice2 =1;
                           break;
                       default: // if the user picks anything other thatn 1 through 4
                           System.out.println("That is an invalid choice. Please try again.\n");   
                     }
                  }
                   System.out.println();
                   break;       
               case 3: // if user picks 3 to use Relational
                   
                   try{
                    store2.store();
                    System.out.println("Relatoinal stored data as a table");
                   }catch(IOException e){System.out.println(e);}
                   //checking if the user wants to store the data as not the default storage type
                  while (choice3 !=1)
                  {
                      System.out.print("\n Would you like to change the storage type?:");
                      System.out.println();
                      
                      //returns to the main menu
                      System.out.println("1. No, Main Menu.");
                      //calling "table" storage
                      System.out.println("2. Yes, Document.");
                      //calling "node" storage
                      System.out.println("3. Yes Node(s).");
           
                      //read in users's menu choices and store in variable choce
                     System.out.print("\n Please Enter Your choice:");
                     choice3 = in.nextInt();
                     System.out.println();
                     switch (choice3)
                     {
                       case 1:
                           break;
                           
                       case 2:
                           //changes to "table" storage
                           store2.setStoreStrategy("document");
                           System.out.println("Strorage type changed to document");
                           choice3 = 1;
                           break;
                       case 3:
                           //changes to "node" storage
                           store2.setStoreStrategy("node");
                           System.out.println("Strorage type changed to node");
                           choice3 = 1;
                           break;
                       default: // if the user picks anything other thatn 1 through 4
                           System.out.println("That is an invalid choice. Please try again.\n");   
                     }
                  }
                case 4: 
                    try{
                    store3.store();
                    System.out.println("Graph stored data as a Node");
                   }catch(IOException e){System.out.println(e);}
                   //checking if the user wants to store the data as not the default storage type
                  while (choice4 !=1)
                  {
                      System.out.print("\n Would you like to change the storage type?:");
                      System.out.println();
                      //returns to the main menu
                      System.out.println("1. No, Main Menu.");
                      //calling "table" storage
                      System.out.println("2. Yes, Document.");
                      //calling "node" storage
                      System.out.println("3. Yes Table.");
           
                      //read in users's menu choices and store in variable choce
                     System.out.print("\n Please Enter Your choice:");
                     choice4 = in.nextInt();
                     System.out.println();
                     switch (choice4)
                     {
                       case 1:
                           break;
                           
                       case 2:
                           //changes to "table" storage
                           store3.setStoreStrategy("document");
                           System.out.println("Strorage type changed to document");
                           choice4 = 1;
                           break;
                       case 3:
                           //changes to "node" storage
                           store3.setStoreStrategy("table");
                           System.out.println("Strorage type changed to table");
                           choice4 = 1;
                           break;
                       default: // if the user picks anything other thatn 1 through 4
                           System.out.println("That is an inval1id choice. Please try again.\n");   
                     }
                  }
               default: // if the user picks anything other thatn 1 through 4
                   System.out.println("Taking you back to the menu.\n");
           }
       }
    }
}
