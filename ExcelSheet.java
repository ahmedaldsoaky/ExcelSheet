/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excelsheet;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Laptop Shop
 */
public class ExcelSheet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        //  HI this is Sheet Excel 
        // What do you want 
        // (insert , delete , makeEquation, find Name , totalGrade , recEquation)
        Scanner in = new Scanner(System.in);
        excellClass ex = new excellClass();
        
        System.out.println("Hi, This is mini Excel Sheet ..⏔⇊⇓\n\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("You hava many choices that you can take: \n\n");
        TimeUnit.SECONDS.sleep(1);
        
        char c = 'a';
        String s ;
        char x;
        byte i;
        String A;
        
        while(c != 'e')
        {
            System.out.println("Insert,         Get in a Specific place,        Delete and specific place, \n\nSearch by name, \tSearch by value, \n\nDelete by name, \tDelete by value, \n\nDisplay, \n\nMake an equation, \n\nRecursive this equation  ");
                    TimeUnit.SECONDS.sleep(1);
            System.err.println("\n\n\tPlease Select any of these characters \n\n");
            System.out.println("i -> Insert        g -> Get in a Specific place        d -> Delete and specific place\n       \ns-n  -> Search by name        s-v  -> Search by value\n");
            System.out.println("d-n -> Delete by name         d-v  ->  Delete by value       \nDs -> Display        \nm-e  -> Make an equation      \n r-e  -> Recursive this equation");
            TimeUnit.SECONDS.sleep(2);
            s = in.next();
            switch (s)
            {
                case"i": 
                    
                    System.out.println("Enter the position Like this \"A1\" , And then Enter what you like to Insert : ");
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                    System.out.println("Enter the Char: ");
                    x = in.next().charAt(0);
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                    System.out.println("Enter the Number: ");
                    i = in.nextByte();
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                    System.out.println("Insert what you want: ");
                    in.nextLine();
                    A = in.nextLine();
                    
                    ex.insert(x, i, A); 
                    break; 
                    
                case "g": 
                    
                    System.out.println("Enter the position Like this \"A1\" , that you like to Get : ");
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                    System.out.println("Enter the Char: ");
                    x = in.next().charAt(0);
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                    System.out.println("Enter the Number: ");
                    i = in.nextByte();
                    
                    System.out.println(ex.GetElement(x, i)); 
                    break;
                    
                case "d":
                    
                    System.out.println("Enter the position Like this \"A1\" , that you like to Delete : ");
                   
                    TimeUnit.SECONDS.sleep(1);
                    
                    System.out.println("Enter the Char: ");
                    x = in.next().charAt(0);
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                    System.out.println("Enter the Number: ");
                    i = in.nextByte();
                    ex.DelElement(x,i);
                    break;
                    
                case "s-n": // Search by name
                    
                    System.out.println("Enter the name that you like to Search(In the first row) : ");
                    in.nextLine();
                    A = in.nextLine();
                    String isFound = ex.findName(A);
                    
                    if(isFound != null)
                        System.out.println("The Position of this name is : "+isFound);
                    else
                        System.err.println("Not Found");
                    break; 
                    
                case "s-v": // Search by value
                    
                    System.out.println("Enter the Value that you like to Search(In any column) : ");
                    
                    in.nextLine();
                    A = in.nextLine();
                    isFound = ex.findNum(A);
                    
                    if(isFound != null)
                        System.out.println("The Position of this Number is : "+isFound);
                    else
                        System.err.println("Not Found");
                    break; 
                    
                case "d-n": // Delete by name
                    
                    System.out.println("Enter the name that you like to Delete(In the first row) : ");
                    in.nextLine();
                    A = in.nextLine();
                    boolean done = ex.deleteName(A); 
                    
                    if(done)
                        System.out.println("Deleted");
                    else
                        System.err.println("Not Found");
                    
                    break; 
                    
                case "d-v": // Delete by value
                    
                    System.out.println("Enter the Value that you like to Delete(In any column) : ");
                    in.nextLine();
                    A = in.nextLine();
                    done = ex.deleteNum(A); 
                    
                    if(done)
                        System.out.println("Deleted");
                    else
                        System.err.println("Not Found");
                    
                    break; 
                    
                case "Ds": // Display
                    System.out.println("This is the Excel Sheet\n");
                    System.err.println("(Note)  \"--\" referes to there is no elements \n");
                    System.out.println("------------------------------------------------------------------------------------------\n");
                    ex.display();
                    System.out.println("------------------------------------------------------------------------------------------");
                    break; 
                    
                case "m-e": // Make an equation
                    System.err.println("\n\n\t\tWE ARE IN THE MOST COMPLECATED METHOD IN THIS PROGRAM...\n\n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Enter the position that the equation will apply in Like this \"A1\" , And then Enter the equation \n");
                    System.err.println("=SUM(A1:E1)\n" +
                                                "=MAX(A1:E1)\n" +
                                                "=MIN(A1:E1)\n" +
                                                "=AVERAGE(A1:E1)\n" +
                                                "Or an Operator like this \n" +
                                                "=A1+B2\n" +
                                                "=A1-B2");
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                    System.out.println("Enter the Char: ");
                    x = in.next().charAt(0);
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                    System.out.println("Enter the Number: ");
                    i = in.nextByte();
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                    System.out.println("Enter the Equation: ");
                    in.nextLine();
                    A = in.nextLine();
                    try{
                    ex.Equation(x, i, A); 
                    }catch(Exception e)
                    {
                        System.err.println("-----");
                    }
                    break; 
                    
                case "r-e": // Recursive this equation
                    System.out.println("Enter the position that the equation will apply in Like this \"A1\" , then Enter the equation, and Enter the position that you want to apply  ");
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                    System.out.println("Enter the Char: ");
                    x = in.next().charAt(0);
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                    System.out.println("Enter the Number: ");
                    i = in.nextByte();
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                    System.out.println("Enter the Equation: ");
                    in.nextLine();
                    A = in.nextLine();
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                    System.out.println("Enter the secound char: ");
                    char xx = in.next().charAt(0);
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                    System.out.println("Enter the secound Number: ");
                    byte ii = in.nextByte();
                    
                    try{
                    ex.RecEquation(x, i, A,xx,ii); 
                    }catch(Exception e)
                    {
                        System.err.println("Invalid");
                    }
                    break; 
                    
                default:
                    System.err.println("## -> Invalid Input  <- ##");
            }
            System.out.println("\nEnter \'e\' to exite. else any character");
            c = in.next().charAt(0);
        }

    }
                                    
}