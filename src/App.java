import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* wpisywanie
        System.out.println("podaj swoje imię:");
        
        Scanner Scanner = new Scanner(System.in);
        String firstName = Scanner.nextLine();
        System.out.println("Twoje imię to " + firstName );
        Scanner.close();
        */
        //zmienne liczbowe (string to słowa)
        /*
        int a = 5;
        int b = 10;
        System.out.println(a+b);
        */
        

        //Dodawanie "a", "b" i "c"
        
         // Scanner Scanner = new Scanner(System.in);
            /*
                    //pyta o liczby
            System.out.println("podaj a:");
            int a = Scanner.nextInt();

            System.out.println("podaj b:");
            int b = Scanner.nextInt();

            System.out.println("podaj c:");
            int c = Scanner.nextInt();
            
                    //wyświetla i oblicza wynik
            System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
            Scanner.close();

            */
            /*
            System.out.println("podaj liczbe od 1 do 5:");
            int nr = Scanner.nextInt();
        // int nr = 10;
        if(nr == 1){
            System.out.println("liczba wynosi 1");

        }else if(nr == 2){
            System.out.println("liczba wynosi 2");
        }else if(nr == 3){
            System.out.println("liczba wynosi 3");
        }else if(nr == 4){
            System.out.println("liczba wynosi 4");
        }else if(nr == 5){
            System.out.println("liczba wynosi 5");
        }else{
            System.out.println("Nie podałeś liczby z przedziału");
        }
        */
        //Scanner.close();
        
        /*
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("podaj liczbe a");
        int a = Scanner.nextInt();
        
        Scanner.nextLine();
        System.out.println("podaj znak matematyczny + lub -");
        String z = Scanner.nextLine();

        System.out.println("podaj liczbe b");
        int b = Scanner.nextInt();

        
        
        
       
        if(z.equals("+")){
            System.out.println(a+" + "+b+" = "+(a+b));
        }else if(z.equals("-")){
            System.out.println(a+" - "+b+" = "+(a-b));
        }else{
            System.out.println("Zły znak matematyczny");

            
        }

        Scanner.close();
        */

        // kalulator
        /*
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("podaj liczbe a");
        int a = Scanner.nextInt();

        Scanner.nextLine();
        System.out.println("podaj znak +, -, /, * lub %");
        String znak = Scanner.nextLine();

        System.out.println("podaj liczbe b");
        int b = Scanner.nextInt();
        
        
        switch(znak){
            case "+":
                System.out.println(a+" + "+b+" = "+(a+b));
            break;
            case "-":
                System.out.println(a+" - "+b+" = "+(a+b));
            break;
            case "*":
                System.out.println(a+" * "+b+" = "+(a*b));
            break;
            case "/":
                System.out.println(a+" / "+b+" = "+(a/b));
            case "%":
                System.out.println("reszta z dzielenia wynosi: "+(a%b));
            break;
            default:

                System.out.println("Co innego");
            break;
        }
        
        Scanner.close();

        */

        /*
       //zadanko ze zgadywankiem
      
      boolean s =(false);

      int liczba = (int)(Math.random() * 100);

      System.out.println("Masz 5 prób na zgadnięcie wylosowanej liczby");

      // System.out.println(liczba); 

        int proba = 1;


        while(proba < 6){
          
          System.out.println("To twoja "+proba+" próba, podaj liczbę");
          int zgad = Scanner.nextInt();
          if(zgad < liczba){
            System.out.println("Niestety podałeś za małą liczbę");
          }else if(zgad > liczba){
            System.out.println("Niestety podałeś za dużą liczbę");
          }else if(zgad == liczba){
            s =true; 
            break;
          }
          proba++;
        }

        if(s){
          System.out.println("Brawo, zgadłeś");
        }else{
          System.out.println("Niestety nie zgadłeś, liczba to "+liczba);
        }

      */

      
        Scanner Scanner = new Scanner(System.in);
        
        int wynik = 0;
         // Zadeklaruj wartości
      String[][] dane = {
        {"Więcej niż jedno zwierzę","stado","klucz","dwa","owca","lama"},
        {"Sporty na s","sztafeta","skok o tyczce", "skoki narciarskie", "sumo", "szachy"}
      };

      
      
      // Pętla wykonująca się tyle razy, ile jest pytań
      for(int i = 0; i < dane.length; i++){ 
        
            
        System.out.println(dane[i][0]); // Wyświetl pytanie (pierwszy element każdej tablicy)
        
        // pobierz odpowiedź
        String odp = Scanner.nextLine(); 
        boolean correct = false;
        // Pętla sprawdzająca odpowiedzi 
        for(int it = 1; it < dane[i].length; it++){

            
        
          
          // System.out.println("ODP: "+dane[i][it]); // Wyświetl każdą odpowiedź

          // Sprawdź, czy odpowiedź użytkownika znajduje się w tablicy
          // dodaj punkty do wyniku
            if(odp.equals(dane[i][it])){

                System.out.println("BRZDĘK");
                correct = true;
                wynik += it*10;
              
            }


          }

          
        if(!correct){
            System.out.println("X");
        }else{

        }
        
    }
    System.out.println("Wynik to: "+wynik); // wyświetl wynik
      
        
    Scanner.close();
        
    } 
}
