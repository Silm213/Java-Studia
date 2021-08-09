package kolo;


public class Prostokat extends Figura{
    private double a;
    private double b;
    
    public Prostokat()
    {
        this(2,4,"brak koloru",false);
    }
    
    public Prostokat(double a, double b)
    {
        this(a,b,"brak koloru",false);
    }
    
    public Prostokat(double a, double b, String color, boolean wyp)
    {
        super(color,wyp);
        this.a = a;
        this.b = b;
    }
    
    public double ObliczPole()
    {
        return a * b;
    }
    
    public double ObliczObw()
    {
        return 2 * (a + b);
    }
    
    public double getBok1()
    {
        return a;
    }
    
    public double getBok2()
    {
        return b;
    }
    
    public String toString()
    {
        return getClass().getName() + "\nProstokat o bokach: " + getBok1() + " " + getBok2() + "\n" + "Pole: " + ObliczPole() + "\n" + "Obwód: " + ObliczObw() + "\nKolor: " + super.getColor() + "\nWypelniony: " + super.getWyp() + "\n";
    }
    
    public void wypisz()
    {
        System.out.println("Prostokat o bokach: " + getBok1() + " " + getBok2());
        System.out.println("Pole: " + ObliczPole());
        System.out.println("Obwód: " + ObliczObw() + "\n");
        
    }
    
    
}
