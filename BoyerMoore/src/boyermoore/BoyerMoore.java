package boyermoore;

import java.util.Scanner;

public class BoyerMoore {

    
    public static void main(String[] args) {
        
        Scanner string=new Scanner(System.in);
        
        System.out.println("Podaj tekst: ");
        String tekst=string.nextLine();
        
        System.out.println("Podaj wzór: ");
        String wzor=string.nextLine();
        
        System.out.println(tekst);
        tekst=tekst.toUpperCase();
        wzor=wzor.toUpperCase();
        
        int pz = 65,oz = 90,p,i;  
        
        int[]tab=new int[oz-pz+1];
        
        for(i=0;i<=oz-pz;i++)
            tab[i]=-1;
        
        for(i=0; i<wzor.length(); i++)
            tab[wzor.charAt(i)-pz]=i;
        
        p=i=0;
        while(i<=tekst.length()-wzor.length())
        { 
            int pom=wzor.length()-1;
            while(pom>-1 && wzor.charAt(pom)==tekst.charAt(i+pom)) 
                pom--;
            
            if(pom==-1)
            {
                while(p<i)
                { 
                    System.out.print(" ");
                    p++;
                }
                for(int j=0;j<wzor.length();j++)
                {
                    if(j==0 || j==wzor.length()-1)
                        System.out.print("^"); 
                    else
                        System.out.print("*"); 
                    
                    p++;
                    i++;
                        
                }
            }
            else
            {
                i+=Math.max(1,pom-tab[tekst.charAt(i+pom)-pz]);
            }

        } 
        System.out.println();
    }
    
}
