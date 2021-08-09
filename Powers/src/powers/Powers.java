package powers;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Powers {

    public static int pow(int x, int y)
    {
        int z = 1;
        for(int i=0; i<y; i++)
        {
            z *= x;
        }
        return z;
    }
    
    public static void main(String[] args) {
   
        Scanner num = new Scanner(System.in);
        
        System.out.print("Podaj liczbę: ");
        int a = num.nextInt();
        
        System.out.print("Podaj potege: ");
        int b = num.nextInt();
        
        if(b==0)
            System.out.println("1");
        else if(b==1)
            System.out.println(a);
        else
        {
            System.out.println(pow(a,b));
        }
        
    }
    
}
