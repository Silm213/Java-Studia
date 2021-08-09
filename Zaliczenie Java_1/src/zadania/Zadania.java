/*
    1. Co robi ten cudowny program?
    ODP: Program zawier trzy mini gierki(zgdanij liczbę, kto bliżej ten lepszy, kółko i krzyżyk),
    liste wyników z pierwsze gry, 
    prymitywny sposób czyszczenia konsoli w NetBeans :D [cls()]

*/

package zadania;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Adrian
 */
public class Zadania 
{
    
    public static void cls()
    {
        System.out.println("Czyszczenie...");
        for(int i=0; i<30; i++)
            System.out.println("");
        
    }
    
    public static void main(String[] args) 
    {
        Scanner liczba = new Scanner(System.in);
        Scanner znak = new Scanner(System.in);
        Random los = new Random();

        int wybor = 0;
        String gra = "N";
        String imie = "";
        ArrayList<String> lista1 = new ArrayList<String>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        
        do
        {
            cls();
            System.out.println("Wybierz grę: \n 1-Zgadnij liczbę \n 2-Kto bliżej ten lepszy \n 3-Kółko i krzyżyk \n 4-Lista Wyników \n 0-Wyjdź");
            System.out.print("Wybór: ");
            wybor = liczba.nextInt();
            System.out.println();
            cls();
        
            switch(wybor)
            {
                case 1:
                {
                   do
                    {
                        System.out.println("Zgadnij jaka to liczba!");
                        System.out.println();
                        int tot = los.nextInt(101)+0;
                        int dana = 0;
                        int runda = 1;
                        
                        do
                        {

                            System.out.print("Podaj liczbę(0-100)[runda " + runda +"]: ");
                            dana = liczba.nextInt();
                            
                            if(tot==dana)
                            {
                                System.out.println("\033[34;1m" + "ZGADŁEŚ" + " " + "\033[0m");
                            }
                            else
                            {
                                if(tot<dana)
                                    System.out.println("\033[35;1m" + "Wylosowana liczba jest mniejsza od podanej" + " " + "\033[0m");
                                else
                                    System.out.println("\033[31;1m" + "Wylosowana liczba jest większa od podanej" + " " + "\033[0m");
                            }

                            runda++;

                        }while(tot!=dana);
                        
                        System.out.print("Podaj imię: ");
                        imie = znak.nextLine();
                        
                        lista1.add(imie);
                        lista2.add(runda-1);
                        
                        do
                        {
                            System.out.print("Czy chcesz zagrać jeszcze raz?(Y/N): ");
                            gra = znak.nextLine();
                        }while(!gra.equals("N") && !gra.equals("n") && !gra.equals("y") && !gra.equals("Y"));
                        
                    }while(!gra.equals("N") && !gra.equals("n")); 
                    break;
                }
                case 2:
                {
                    do
                    {
                        System.out.println("Kto bliżej ten lepszy!");
                        System.out.println();
                        int runda = 1;
                        int pkt_bot = 0;
                        int pkt_gracz = 0;

                        for(int i=0; i<5; i++)
                        {
                            int random = los.nextInt(101)+0;
                            int bot = los.nextInt(101)+0;
                            System.out.println("Runda " + runda);
                            System.out.print("Podaj liczbę z zakresu 0-100: ");
                            int gracz = liczba.nextInt();
                            int pom = 0;
                            int pom1 = 0;

                            pom = random - bot;
                            pom = Math.abs(pom);

                            pom1 = random - gracz;
                            pom1 = Math.abs(pom1);
                            
                            System.out.format("Bot %2d | Gracz %2d | Wlosowana liczba %2d \n",bot,gracz,random);
                            
                            if(pom>pom1)
                            {
                                System.out.println("Punkt dla gracza!");
                                pkt_gracz++;
                            }
                            else if(pom<pom1)
                            {
                                System.out.println("Puntk dla Bota!");
                                pkt_bot++;
                            }
                            else
                            {
                                System.out.println("Remis!");
                            }

                            runda++;

                            System.out.println("Gracz [" + pkt_gracz + "-" + pkt_bot + "] Bot");
                            System.out.println();
                        }
                        
                        if(pkt_gracz>pkt_bot)
                                System.out.println("Wygrał Gracz!!!");
                        else if(pkt_gracz<pkt_bot)
                                System.out.println("Wygrał Bot!!!");
                        else
                                System.out.println("Remis!");
                        
                        do
                        {
                            System.out.print("Czy chcesz zagrać jeszcze raz?(Y/N): ");
                            gra = znak.nextLine();
                        }while(!gra.equals("N") && !gra.equals("n") && !gra.equals("y") && !gra.equals("Y"));

                    }while(!gra.equals("N") && !gra.equals("n"));
                    break;
                }
                case 3:
                {
                    do
                    {
                    
                        int x = 0;
                        int y = 0;
                        int x1 =0;
                        int y1 = 0;
                        int win = 0;

                        char[][] tab = new char[3][3];
                        
                        for(int i=0; i<3; i++)
                        {
                            for(int j=0; j<3; j++)
                            {
                                tab[i][j] = ' ';
                            }
                        }
                        
                        System.out.println("Kółko i krzyżyk");
                        for(int i=0; i<3; i++)
                        {
                            System.out.format(" %1s | %1s | %1s \n",tab[i][0],tab[i][1],tab[i][2]); 
                            if(i==0 || i==1)
                                System.out.println("---+---+---");
                        }
                        
                        do
                        {
                            System.out.println("GRACZ 1 'O' ");
                            do
                            {
                                System.out.print("Podaj wiersz(1-3): ");
                                y = liczba.nextInt();
                                System.out.print("Podaj kolumne(1-3): ");
                                x = liczba.nextInt();
                                
                                if(tab[y-1][x-1]!=' ')
                                {
                                    System.out.println("Zajęta kratka !!!");
                                }
                            }while(tab[y-1][x-1]!=' ');
                            tab[y-1][x-1] = 'O';
                            
                            cls();
                            
                            System.out.println("Kółko i krzyżyk");
                            for(int i=0; i<3; i++)
                            {
                                System.out.format(" %1s | %1s | %1s \n",tab[i][0],tab[i][1],tab[i][2]); 
                                if(i==0 || i==1)
                                    System.out.println("---+---+---");
                            }
                            
                            if(tab[0][0]=='O' && tab[0][1]=='O' && tab[0][2]=='O' || tab[1][0]=='O' && tab[1][1]=='O' && tab[1][2]=='O' || tab[2][0]=='O' && tab[2][1]=='O' && tab[2][2]=='O' || tab[0][0]=='O' && tab[1][0]=='O' && tab[2][0]=='O' || tab[0][1]=='O' && tab[1][1]=='O' && tab[2][1]=='O' || tab[0][2]=='O' && tab[1][2]=='O' && tab[2][2]=='O' || tab[0][0]=='O' && tab[1][1]=='O' && tab[2][2]=='O' || tab[0][2]=='O' && tab[1][1]=='O' && tab[2][0]=='O')
                            {
                                System.out.println("Wygrywa Gracz!");
                                win = 1;
                                break;
                            }
                            else if(tab[0][0]!=' ' && tab[0][1]!=' ' && tab[0][2]!=' ' && tab[1][0]!=' ' && tab[1][1]!=' ' && tab[1][2]!=' ' && tab[2][0]!=' ' && tab[2][1]!=' ' && tab[2][2]!=' ' && tab[0][0]!=' ' && tab[1][0]!=' ' && tab[2][0]!=' ' && tab[0][1]!=' ' && tab[1][1]!=' ' && tab[2][1]!=' ' && tab[0][2]!=' ' && tab[1][2]!=' ' && tab[2][2]!=' ' && tab[0][0]!=' ' && tab[1][1]!=' ' && tab[2][2]!=' ' && tab[0][2]!=' ' && tab[1][1]!=' ' && tab[2][0]!=' ')
                            {
                                System.out.println("REMIS!");
                                win = 1;
                                break;
                            }
                            
                            do
                            {
                                y1 = los.nextInt(3);
                                x1 = los.nextInt(3);
                                
                            }while(tab[y1][x1]!=' ');
                            
                            tab[y1][x1] = 'X';
                            
                            cls();
                            
                            System.out.println("Kółko i krzyżyk");
                            for(int i=0; i<3; i++)
                            {
                                System.out.format(" %1s | %1s | %1s \n",tab[i][0],tab[i][1],tab[i][2]); 
                                if(i==0 || i==1)
                                    System.out.println("---+---+---");
                            }
                            
                            //          pierwszy warunek                          ||        drugi warunek                               || trzeci warunek                                     ||          czwarty warunek                           || piąty warunek                                      || szósty warunek                                     || siódmy warunek                                     || ósmy warunek
                            if(tab[0][0]=='X' && tab[0][1]=='X' && tab[0][2]=='X' || tab[1][0]=='X' && tab[1][1]=='X' && tab[1][2]=='X' || tab[2][0]=='X' && tab[2][1]=='X' && tab[2][2]=='X' || tab[0][0]=='X' && tab[1][0]=='X' && tab[2][0]=='X' || tab[0][1]=='X' && tab[1][1]=='X' && tab[2][1]=='X' || tab[0][2]=='X' && tab[1][2]=='X' && tab[2][2]=='X' || tab[0][0]=='X' && tab[1][1]=='X' && tab[2][2]=='X' || tab[0][2]=='X' && tab[1][1]=='X' && tab[2][0]=='X')
                            {
                                System.out.println("Wygrywa BOT");
                                win = 1;
                            }
                            
                        }while(win!=1);

                        do
                        {
                            System.out.print("Czy chcesz zagrać jeszcze raz?(Y/N): ");
                            gra = znak.nextLine();
                        }while(!gra.equals("N") && !gra.equals("n") && !gra.equals("y") && !gra.equals("Y"));
                        cls();
                        
                    }while(!gra.equals("N") && !gra.equals("n"));
                    break;
                }
                case 4:
                {
                    int dlugosc = lista1.size();
                    System.out.println("|    Imię    | Wynik |");
                    
                    for(int i=0; i<22; i++)
                    {
                        System.out.print("-");
                    }
                    System.out.println();
                    
                    for(int i=0; i<dlugosc; i++)
                        System.out.printf("| %10s | %5d |\n",lista1.get(i),lista2.get(i));
                    
                    System.out.print("\nKliknij Enter aby wrócić ");
                    gra = znak.nextLine();
                    
                    break;
                }
                default:
                {
                    break;
                }
            }
        
        }while(wybor!=0);
        for(int i=0;i<5;i++)
            System.out.println("\033[30;1m" + "DZIĘKI ZA GRĘ!!!" + " " + "\033[0m");
        
    }
    
}
