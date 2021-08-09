package bubblesort;

import java.util.Random;
/**
 *
 * @author Adrian
 */
public class BubbleSort {

    
    public static void main(String[] args) {
        
        Random x = new Random();
        int num[] = new int[10];
        
        System.out.print("Przed: ");
        for(int i=0; i<10; i++)
        {
            num[i] = x.nextInt(101);
            System.out.print(num[i] + " ");
        }
        System.out.println();
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                if(num[j] > num[j+1])
                {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        System.out.print("Po: ");
        for(int i=0; i<10; i++)
        {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
    
}
