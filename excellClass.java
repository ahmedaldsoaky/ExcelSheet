/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excelsheet;

/**
 * -- *    array_2D
 * 
 * 
 *  * -- *    Inserting Name or ID in a specific place       →
*
* 
 * -- *    Searching by index
 * 
 * -- *    Searching by value
 * -- *    Searching Name
 * 
 * -- *    Deleting by index
 * 
 * -- *    Deleting By name 
 * -- *    Deleting By value
 * 
 * 
 * 
 * -- *    Get in Specific place 
 * 
 * 
 * -- *    Equation 
 *      {   
 *          
 *          AVARADGE
 *          MAX
 *          MIN
 *          OPERATIONS..
 * 
 *      }
 * 
 * -- *    (Equation)Apply on all
 *  
 * 
 * @author Ahmed Fawzy
 */

public class excellClass {
    
    private String [][] array;

    public excellClass()
    {
        array = new String[26][26];
        for (int i = 0; i < 26; i++)
            for (int j = 0; j < 26; j++)
                array[i][j] = "--";
    }
    
    
        public void display()
    {
        for (int i = 0; i < 26; i++) {
//            System.err.print(i+1 + ")");
//            if(i < 9)
//                System.out.print(" ");
            for (int j = 0; j < 26; j++) 
                System.out.print(array[i][j] + " ");
            System.out.println("");
        }
        System.out.println();
        
    }

    
    public void insert(char c , int i , String item)    // Inserting in a Specific Place
    {                                                                     //  (row before coulmn)
       
        try{
            
        int j = c - 65;
        
        array[i-1][j] = item;  
        }
        
        catch(Exception e)//Error
        {
            System.out.println("There is out of bound");
        }
        
    }
    
    
    public String GetElement(char c , int i)
    {
        try{
        int j = c - 65;
        
        return array[i-1][j];
        }catch(Exception e)
        {
            System.out.println("There is no place like that");
            return null;
        }
    }
    
    
    public void DelElement(char c , int i)
    {
        try{
        int j = c - 65;
        array[i-1][j] = "--";
            System.out.println("Done");
        }catch(Exception e)
        {
            System.out.println("There is out of bound");
        }
    }
    
                                        //A     2       
    public void Equation(char c, int i, String A1)
    {
        
        if(A1.length() != 6 && A1.length() != 11 && A1.length() != 15)
        {
            System.err.println("Invalid Equation");
            return;
        }
        
        int j= c - 65;
        i = i - 1;
        double Z = 0;
        
        int Index1_1;
        int Index1_2;
        int Index2_1;
        int Index2_2;
        A1 = A1.toUpperCase();

        
//          =SUM(A1:E1)

//          =SUM(A1:E2)

//          =MAX(A1:E1)
//          =MIN(A1:E1)


//          =AVERAGE(A1:E1)

       
//                  =A1+B2
//                  =A1-B2
//                  =A1*B2
//                  =A1/B2
//                  =A1%B2

        
        
        if(A1.length() != 6)
        {
            if(A1.length() == 11)
            {
                Index1_2 = A1.charAt(5) - 65;//A
                Index1_1 = A1.charAt(6) - 49;//1
        
                Index2_2 = A1.charAt(8) - 65;//E
                Index2_1 = A1.charAt(9) - 49;//3
            }
            else
            {
                Index1_2 = A1.charAt(9) - 65;//A
                Index1_1 = A1.charAt(10) - 49;//1
        
                Index2_2 = A1.charAt(12) - 65;//E
                Index2_1 = A1.charAt(13) - 49;//1
            }
            switch(A1.substring(1, 3))
            {
                
                case "SUM":
                    
                    double sum = 0;
                    
                    if(Index1_1 == Index2_1)
                        for (int k = Index1_2; k <= Index2_2; k++) 
                            sum += Double.parseDouble(array[Index1_1][k]);
                                                                                                  //                   0       1       2
                    else                                                                       //A1:C2          0       1       2
                        for (int k = Index1_1; k <= Index2_1; k++) 
                            for (int l = Index1_2; l <= Index2_2; l++) 
                                sum += Double.parseDouble(array[k][l]);
                    array[i][j] = String.valueOf(sum);
                    break;
                    
                case "MAX":
                    /*
                Index1_2 = A1.charAt(9) - 65;//A
                Index1_1 = A1.charAt(10) - 49;//1
        
                Index2_2 = A1.charAt(12) - 65;//E
                Index2_1 = A1.charAt(13) - 49;//1

                    */
                    
                    double first = Double.parseDouble(array[Index1_1][Index1_2]);
                    double max = first;            //Suppose max the first element
                    
                    if(Index1_1 == Index2_1)
                        for (int k = Index1_2; k <= Index2_2; k++) 
                            if(max > Double.parseDouble(array[Index1_1][k]))
                                max = Double.parseDouble(array[Index1_1][k]);

                    else
                        for (int m = Index1_1 + 1; m <= Index2_1; m++)
                            for (int l = Index1_2 + 1; l <= Index2_2; l++)
                                if(max > Double.parseDouble(array[m][l]))
                                    max = Double.parseDouble(array[m][l]);
                    array[i][j] = String.valueOf(max);
                    break;
                    
                case "MIN":
                    
                     first = Double.parseDouble(array[Index1_1][Index1_2]);
                    double min = first;            //Suppose max the first element
                    
                    if(Index1_1 == Index2_1)
                        for (int k = Index1_2 + 1; k <= Index2_2; k++) 
                            if(min < Double.parseDouble(array[Index1_1][k]))
                                min = Double.parseDouble(array[Index1_1][k]);

                    else
                        for (int m = Index1_1 + 1; m <= Index2_1; m++)
                            for (int l = Index1_2 + 1; l <= Index2_2; l++)
                                if(min < Double.parseDouble(array[m][l]))
                                    min = Double.parseDouble(array[m][l]);
                    array[i][j] = String.valueOf(min);
                    break;
                case "AVE":
                     sum = 0;
                     double count = 0;
                    if(Index1_1 == Index2_1)
                        for (int k = Index1_2; k <= Index2_2; k++) 
                            sum += Double.parseDouble(array[Index1_1][k]);
                                                                                                  //                   0       1       2
                    else                                                                       //A1:C2          0       1       2
                        for (int k = Index1_1; k <= Index2_1; k++) 
                            for (int l = Index1_2; l <= Index2_2; l++) 
                                sum += Double.parseDouble(array[k][l]);
                    array[i][j] = String.valueOf(sum);

                    double ava = sum / count;
                    array[i][j] = String.valueOf(ava);
                    break;
                    
                default:
                     System.err.println("Error");
                     return;
            }
        }
        else
        {
         Index1_2 = A1.charAt(1) - 65;      //A
         Index1_1 = A1.charAt(2) - 49;      //1
        
         Index2_2 = A1.charAt(4) - 65;
         Index2_1 = A1.charAt(5) - 49;
            
            switch(A1.charAt(3))
            {
                case '+':
                        double X = Double.parseDouble(array[Index1_1][Index1_2]);
                        double Y = Double.parseDouble(array[Index2_1][Index2_2]);
                        Z = X + Y;
                        break;
                case '-' :
                         X = Double.parseDouble(array[Index1_1][Index1_2]);
                         Y = Double.parseDouble(array[Index2_1][Index2_2]);
                         Z = X - Y;
                        break;
                case '/' :
                         X = Double.parseDouble(array[Index1_1][Index1_2]);
                         Y = Double.parseDouble(array[Index2_1][Index2_2]);
                         Z = X / Y;
                        break;
                case '*' :
                         X = Double.parseDouble(array[Index1_1][Index1_2]);
                         Y = Double.parseDouble(array[Index2_1][Index2_2]);
                         Z = X * Y;
                        break;
                case '%' :
                         X = Double.parseDouble(array[Index1_1][Index1_2]);
                         Y = Double.parseDouble(array[Index2_1][Index2_2]);
                         Z = X % Y;
                        break;
                default:
                    System.err.println("Error");
            }
        array[i][j] = String.valueOf(Z);
        }
        
        System.out.println("Done..");
    }
    
    
    public void RecEquation(char c, int i, String A1, char cc, int ii)
    {
        
//          =SUM(A1:E1)
//          =MAX(A1:E1)
//          =MIN(A1:E1)
//          =AVERAGE(A1:E1)

       
//                  =A1+B2
        
//    String s = "=SUM(A7:E7)";
//    String ss = "=SUM(A1:E1)";
        
        if(A1.length() != 6 && A1.length() != 11 && A1.length() != 15)
        {
            System.err.println("Invalid Equation");
            return;
        }
        
        if(c != cc)
        {
            System.err.println("Invaild");
            return;
        }
        
        A1 = A1.toUpperCase();
        
        int Index1_1;//       →→‖
        
        if(A1.length() != 6)
        {
            if(A1.length() == 11) //          =SUM(A1:E1)
            {
                Index1_1 = A1.charAt(6) - 49;//1        →→‖
            }
            else        //          =AVERAGE(A1:E1)
            {
                Index1_1 = A1.charAt(10) - 49;//1
            }
        }
         else //                  =A1+B2
        {
         Index1_1 = A1.charAt(2) - 49;//A-1
        }

        if(Index1_1 > ii)
        {
            System.err.println("Invalid");
            return;
        }
        
        
         
    for (int j = Index1_1; j <= ii; j++) 
            Equation(c, i, A1.replaceAll("\\d",Integer.toString(j)));
        
    
    }
   
    
    public String findName (String A1)
    {
        
        for (int i = 0; i < 26; i++) 
            for (int j = 0; j < 26; j++)
            { 
                    if(A1.equalsIgnoreCase(array[i][j]))
                         return String.valueOf( (char) (j + 65) ) + String.valueOf(i+1);
            }

        return null;
    }
    
    
    public boolean deleteName (String A1)
    {
        if(findName(A1) == null)
            return false;

        int i = findName(A1).charAt(0) - 65;
        int j = findName(A1).charAt(1) - 1;
        
        array[i][j] = "--";
        return true;
    }
    
    
    public String findNum (String A1)
    {
        for (int i = 0; i < 26; i++) 
            for (int j = 0; j < 26; j++) 
                if(A1.equalsIgnoreCase(array[i][j]))
                    return String.valueOf( (char)(j + 65) ) + String.valueOf(i+1);
        return null;
            
    }
    
    
    public boolean deleteNum (String A1)
    {
        if(findNum(A1) == null)
            return false;

        int i = findName(A1).charAt(0) - 65;
        int j = findName(A1).charAt(1) - 1;
        array[i][j] = "--";
        return true;
    }
    
    
    
    }
