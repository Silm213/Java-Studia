package selectionsort;

import java.util.Random;
/**
 *
 * @author Adrian
 */
public class SelectionSort {

    public static void main(String[] args) {
        
        Random rd = new Random();
        
        int tab[] = new int[10];
        
        for(int i=0; i<10; i++)
        {
            tab[i] = rd.nextInt(101);
            System.out.print(tab[i] + " ");
        }
        
        System.out.println();
        
        for(int i=0; i<9; i++)
        {   
            int pos = i;
            
            for(int j=i; j<9; j++)
            {
                if(tab[j+1] < tab[pos])
                    pos = j+1;
            }
            
            int temp = tab[i];
            tab[i] = tab[pos];
            tab[pos] = temp;
        }
        
        for(int i=0; i<10; i++)
            System.out.print(tab[i] + " ");
        
        System.out.println();
    }
    
}
