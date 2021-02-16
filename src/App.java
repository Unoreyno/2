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

            Scanner.close();
        }

        
    } 
}
