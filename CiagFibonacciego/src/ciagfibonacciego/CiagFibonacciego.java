package ciagfibonacciego;

/**
 *
 * @author Adrian
 */
public class CiagFibonacciego {

    
   
    public static void main(String[] args) {
        
        int x = 1,y = 0;
        
        for(int i=0; i<15; i++)
        {
            System.out.print(x + " ");
            x += y;
            y = x - y;
        }
        
        
    }  
}
