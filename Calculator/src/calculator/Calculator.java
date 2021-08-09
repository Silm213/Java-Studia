package calculator;


import java.util.Scanner;
/**
 *
 * @author Adrian
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        Scanner operation = new Scanner(System.in);
        
       
        float sum = 0;
        char op;
        
        
        System.out.print("Liczba: ");
        float value = num.nextFloat();
        System.out.print("Znak: ");
        op = operation.next().charAt(0);
        System.out.print("Liczba: ");
        float value1 = num.nextFloat();
           
        switch(op)
        {
            case '+':
                sum += value;
                sum = value + value1;
                System.out.print(value + " " + op + " " + value1 + " = " + sum);
                break;
            case '-':
                sum -= value;
                sum = value - value1;
                System.out.print(value + " " + op + " " + value1 + " = " + sum);
                break;
            case '/':
                sum /= value;
                sum = value / value1;
                System.out.print(value + " " + op + " " + value1 + " = " + sum);
                break;
            case '*':
                sum *= value;
                sum = value * value1;
                System.out.print(value + " " + op + " " + value1 + " = " + sum);
                break;
            case '%':
                sum %= value;
                sum = value % value1;
                System.out.print(value + " " + op + " " + value1 + " = " + sum);
                break;
        }
    }
    
}
