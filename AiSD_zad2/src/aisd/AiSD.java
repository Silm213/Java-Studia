package aisd;

import java.util.Scanner;
import java.util.Random;

public class AiSD {
    
    public static void main(String[] args) {
        
        Scanner licz = new Scanner(System.in);
        Random ran = new Random();
        
        System.out.println("Sprawdzanie pierwiastka");
        System.out.print("Liczba do spierwiastkowania: ");
        double b = licz.nextDouble();
        
        double a=1,p=b;
        
        while(Math.abs(a-b)>0.1)
        {
            a = (a + b)/2;
            b = p/a;
        }
        System.out.println("Pierwiastek kwadratowy z liczby "+ p +" wynosi: " + a);
        System.out.println();
        // ....
        System.out.println();
        System.out.println("Szukanie min i max");
        System.out.print("Podaj długośc tablicy: ");
        int n = licz.nextInt();
        int min=100,max=1,posmin=0,posmax=0;
        int[] tab;
        
        if(n%2==0)
        {
            tab = new int[n];
            for(int i=0;i<n;i++)
            {
                tab[i] = ran.nextInt(100)+1;
            }
        }
        else
        {
            tab = new int[n+1];
            for(int i=0;i<n;i++)
            {
                tab[i] = ran.nextInt(100)+1;
            }
            tab[n] = tab[n-1];
        }
        
        for(int i=0;i<n;i+=2)
        {
            if(tab[i]>tab[i+1])
            {
                if(tab[i]>max)
                {
                    max = tab[i];
                    posmax = i;
                }
                if(tab[i+1]<min)
                {
                    min = tab[i+1];
                    posmin = i+1;
                }
            }
            else
            {
                if(tab[i+1]>max)
                {
                    max = tab[i+1];
                    posmax = i+1;
                }
                if(tab[i]<min)
                {
                    min = tab[i];
                    posmin = i;
                }
            
            }
            
        }
        
        System.out.println("Wartość min = " + min + ", a pozycja w tablicy to : " + posmin);
        System.out.println("Wartość max = " + max + ", a pozycja w tablicy to : " + posmax);
        
    }
    
}
