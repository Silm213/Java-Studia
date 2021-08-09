package quicksort;

import java.util.Random;

 class QuickSort {
     
    static void quick(int tab[], int p, int k) {
 
        int i=p,j=k,pivot,pom;

        pivot=tab[(p+k)/2];
        
        do {
            while (tab[i]<pivot)
                i++;
            while (pivot<tab[j])
                j--;
            if (i<=j)
            {
                pom=tab[i];
                tab[i]=tab[j];
                tab[j]=pom;
                i++;
                j--;
            }
        }while (i<=j);
        
        if (p<j)
            quick(tab,p,j);
        if (i<k)
            quick(tab,i,k);
}

    public static void main(String[] args) {
       
       Random gen = new Random();
        
       int[] tablica = new int[10];
       
       for(int i=0; i<10; i++)
           tablica[i] = gen.nextInt(101);
       
       System.out.print("Przed posortowaniem: ");
       
       for(int i=0; i<10; i++)
           System.out.print(tablica[i] + " ");
       
       quick(tablica, 0, tablica.length-1);
       System.out.println();
       
       System.out.print("Po posortowaniu: ");
       
       for(int i=0; i<10; i++)
           System.out.print(tablica[i] + " ");
       
       System.out.println();
        
    }
    
}
