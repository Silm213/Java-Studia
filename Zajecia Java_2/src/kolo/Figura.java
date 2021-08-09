package kolo;


public abstract class Figura {
    
    private String color;
    private boolean wyp;

    public Figura()
    {
        this("red",false);
    }
    
    public Figura(String a, boolean b)
    {
        color = a;
        wyp = b;
    }
    
    public abstract double ObliczPole();
     
    public abstract double ObliczObw();
    
    public String getColor()
    {
        return color;
    }
    
    public boolean getWyp()
    {
        return wyp;
    }
    
    public String toString()
    {
        return "Kolor: " + getColor() + "\nWypelnienie: " + getWyp() + "\n";
    }
    
//    public static void main(String[] args) {
//        
//        Figura f1 = new Figura("green",true);
//        System.out.println(f1);
//        
//        Figura f2 = new Figura();
//        System.out.println(f2);
//    
//    }
}

