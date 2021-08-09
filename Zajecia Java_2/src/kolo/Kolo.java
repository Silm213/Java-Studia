package kolo;


public class Kolo extends Figura{

    private double r;
    
    public Kolo()
    {
        this(2.2,"aqua",false);
    }
    
    public Kolo(double r)
    {
        this(r,"brak koloru",false);
    }
    
    public Kolo(double r, String color, boolean wyp)
    {
        super(color,wyp);
        this.r = r;
    }
    
    public double ObliczPole()
    {
        return Math.PI * r * r;
    }
    
    public double ObliczObw()
    {
        return 2 * Math.PI * r;
    }
    
    public double getPromien()
    {
        return r;
    }
    
    public String toString()
    {
        return getClass().getName() + "\nKolo o promienu: " + getPromien() + "\n" + "Pole: " + ObliczPole() + "\n" + "Obwód: " + ObliczObw() + "\nKolor: " + super.getColor() + "\nWypelniony: " + super.getWyp() + "\n";
    }
    
    public void wypisz()
    {
        System.out.println("Kolo o promienu: " + getPromien());
        System.out.println("Pole: " + ObliczPole());
        System.out.println("Obwód: " + ObliczObw() + "\n");
        
    }
    
    
    public static void main(String[] args) {
        
//        Kolo k1 = new Kolo(4.5);
//        k1.wypisz();
//        
//        Kolo k2 = new Kolo();
//        k2.wypisz();
//        
//        Kolo k3 = new Kolo(6.6);
//        System.out.println(k1);
//        
//        Prostokat p1 = new Prostokat(4,5,"pink",false);
//        System.out.println(p1);
//        
//        Kolo k4 = new Kolo(4,"gray",true);
//        System.out.println(k1);
//
//
//        Figura[] f = new Figura[5];
//        f[0] = k1;
//        f[1] = k2;
//        f[2] = k3;
//        f[3] = k4;
//        f[4] = p1;
//        
//        for(int i=0; i<f.length; i++)
//        {
//            System.out.println(f[i]);
//        }

        Figura[] f1 = new Figura[4];
        f1[0] = new Kolo();
        f1[1] = new Kolo(5);
        f1[2] = new Kolo(2,"red",false);
        f1[3] = new Prostokat();
        
        for(int i=0;i<f1.length;i++)
        {
            System.out.println(f1[i].ObliczPole());
            System.out.println(f1[i].ObliczObw());
        }
        
    }
    
}
