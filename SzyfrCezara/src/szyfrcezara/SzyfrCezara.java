package szyfrcezara;

import java.util.Scanner;

public class SzyfrCezara {
    
    
    public static void main(String[] args) {
        
        Scanner ciag = new Scanner(System.in);
        
        System.out.println("Szyfr Cezara");
        System.out.print("Podaj kod: ");
        String a = ciag.nextLine();
        String b = "";
        char[] tab = new char[a.length()];
        
        for(int i=0; i<a.length(); i++)
        {
            tab[i] = a.charAt(i);
            if(tab[i] >= 'A' && tab[i] <='W' || tab[i] >= 'a' && tab[i] <='w')
            {
                int p = tab[i];
                p += 3;
                b += (char)p;
            }
            else if(tab[i] >= 'X' && tab[i] <='Z' || tab[i] >= 'x' && tab[i] <= 'z')
            {
                int p = tab[i];
                p -= 23;
                b += (char)p;
            }
        }
        
        System.out.println("Zaszyfrowany: " + b);
        
        a = "";
        
        for(int i=0; i<b.length(); i++)
        {
            tab[i] = b.charAt(i);
            
            if(tab[i] >= 'D' && tab[i] <='Z' || tab[i] >= 'd' && tab[i] <='z')
            {
                int p = tab[i];
                p -= 3;
                a += (char)p;
            }
            else if(tab[i] >= 'A' && tab[i] <='C' || tab[i] >= 'a' && tab[i] <= 'c')
            {
                int p = tab[i];
                p += 23;
                a += (char)p;
            }
        }
        System.out.println("Odszyfrowany: " + a);
    }
    
}
