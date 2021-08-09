package mergesort;

import java.util.Random;

public class MergeSort {

    static void scalanie(int tab[], int p, int s, int k) 
    { 
        
        int n1 = s - p + 1; 
        int n2 = k - s; 
  
        int tab1[] = new int [n1]; 
        int tab2[] = new int [n2]; 
  
        
        for (int i=0; i<n1; ++i) 
            tab1[i] = tab[p + i]; 
        for (int j=0; j<n2; ++j) 
            tab2[j] = tab[s + 1+ j]; 
  
        int a = 0, b = 0,c = p;
        
        while (a < n1 && b < n2) 
        { 
            if (tab1[a] <= tab2[b]) 
            { 
                tab[c] = tab1[a]; 
                a++; 
            } 
            else
            { 
                tab[c] = tab2[b]; 
                b++; 
            } 
            c++; 
        } 
  
        while (a < n1) 
        { 
            tab[c] = tab1[a]; 
            a++; 
            c++; 
        } 
  
        while (b < n2) 
        { 
            tab[c] = tab2[b]; 
            b++; 
            c++; 
        } 
    } 
  
    static void half(int tab[], int p, int k) 
    { 
        if (p < k) 
        {
            int s = (p+k)/2; 
  
            half(tab, p, s); 
            half(tab, s+1, k); 
  
            scalanie(tab, p, s, k); 
        } 
    }
    
    public static void main(String[] args) 
    {
        Random gen = new Random();
        
        System.out.print("Sortowanie przez Scalanie! \nTablica 10 elementów. \n");
        System.out.print("Tablica nieposortowana: ");
        int[] tablica = new int [10];
        
        for(int i=0; i<10; i++)
        {
            tablica[i] = gen.nextInt(101);
            System.out.print(tablica[i] + " ");
        }
        
        half(tablica, 0, tablica.length-1);
        System.out.println();
        System.out.print("Tablica posortowana: ");
        
        for(int i=0; i<10; i++)
            System.out.print(tablica[i] + " ");
        
        System.out.println();
        
    }
    
}
