import java.util.Random;
import java.util.Scanner;

public class kal {
    public static void main(String[] args) throws Exception {
        
        Random r = new Random();
        
       
        
        

        

        Scanner Scanner = new Scanner(System.in);
        
       
        System.out.println("Kliknij enter");
        Scanner.nextLine();
        System.out.println("Napisz kamień (k), papier (p) albo nożyce (n)");
        String znak = Scanner.nextLine();

        
        int wynik = 0;

        
        switch(znak){
            case "k":
                System.out.println("Wybrałeś kamień");
                int zk = r.nextInt(3);
                if(zk == 0){
                    System.out.println("Wylosowałem kamień, zremisowaliśmy");
                
                }else if(zk == 1){
                    System.out.println("Wylosowałem papier, przegrałeś");
                }else{
                    System.out.println("Wylosowałem nożyce, wygrałeś");
                }

            break;
            case "p":
                System.out.println("Wybrałeś  papier");
                int zp =r.nextInt(3);
                if(zp == 0){
                    System.out.println("Wylosowałem kamień, wygrałeś");
                
                }else if(zp == 1){
                    System.out.println("Wylosowałem papier, zremisowaliśmy");
                }else{
                    System.out.println("Wylosowałem nożyce, przegrałeś");
                }

            break;
            case "n":
                System.out.println("Wybrałeś  nożyce");
                int zn =r.nextInt(3);
                if(zn == 0){
                    System.out.println("Wylosowałem kamień, przegrałeś");
                
                }else if(zn == 1){
                    System.out.println("Wylosowałem papier, wygrałeś");
                }else{
                    System.out.println("Wylosowałem nożyce, zremisowaliśmy");
                }

            break;
            
            default:

                System.out.println("Co innego");
            break;
        }
        System.out.println("Czy chcesz zagrać jeszcze raz? Napisz tak lub nie");
            String odp = Scanner.nextLine();
        
        
    
        
        Scanner.close();
        
        
    }
}
    
