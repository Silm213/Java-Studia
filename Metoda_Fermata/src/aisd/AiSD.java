package aisd;

import java.util.Scanner;

public class AiSD {

    public static void Fer(int a){
      int x,y,z,m,n;
      
      x =(int)Math.ceil(Math.sqrt(a));
      do{
        z = x * x - a;
        y=(int)Math.ceil(Math.sqrt(z));
        if(z == y * y){
            m = x + y;
            n = x - y;

            if(n==1){
                break;
            }
            Fer(m);
            Fer(n);
            return;
        }
        x++;
      }while(x + y < a);
      
      System.out.print(a + " "); 
    }
    
    public static void main(String[] args) {
        
        Scanner licz = new Scanner(System.in);
        
        System.out.print("Rozkład liczby na czynniki pierwsze: ");
        int p2 = licz.nextInt();
        int i=2;
        int k = 1;  //do wzoru zastępowane kolejną liczbą naturalną
        int pom = -1;  // używane do wzoru 6k+-1 do zastępowania 1 na -1
        while(p2>1){ 
            while(p2%i==0){ //wynaczanie dzielnika
                System.out.print(i+" ");
                p2 /= i;
            }
            if(i < 3){
                i++;
            }else{
                i = 6 * k + pom;  //wykorzystanie wzoru 6k+-1, zamiana istneiejącego dzielnika na nowy
                if(pom == 1){
                    pom = -1; 
                    k++;
                }
                else {
                    pom = 1;
                }
            }
        }
        // kolejna metoda rozkładu na czynniki pierwsze 
        
        System.out.println();
        System.out.println("Metoda Fermata");
        System.out.print("Podaj liczbę: ");
        int a = licz.nextInt();
        
        System.out.print("Liczba '" + a + "' rozłożona na czynniki pierwsze: ");
        while(a%2==0){
            System.out.print(2+" ");
            a/=2;
        }
        if(a>1){
            Fer(a);
        }
        
        System.out.println();
    }
    
}
