/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printnumbers;

/**
 *
 * @author Dell-PC
 */
public class PrintNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n;
        
        n = 1;
        
        printnum(n);
        
        // TODO code application logic here
    }
    
    public static void printnum(int n)
    {
        if(n == 11)
        {
           n = 11;
        }
        
        else
        {
          System.out.printf("%d\n",n);
          
          printnum(n+1);
        }
        
    }
    
}
