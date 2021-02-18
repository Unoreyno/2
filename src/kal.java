import java.util.Random;
import java.util.Scanner;

public class kal {
    public static void main(String[] args) throws Exception {
        
        Random r = new Random();
        
       
        
        

        

        Scanner Scanner = new Scanner(System.in);
        
        
        int wynikW = 0;
        int wynikP = 0;
        int wynikR = 0;

        System.out.println("Kliknij ENTER by zagrać w papier, kamień, nożyce");
        Scanner.nextLine();
        boolean gra = true;

        do{
        System.out.println("Napisz kamień (k), papier (p) albo nożyce (n)");
        String znak = Scanner.nextLine();

        
        

        
        switch(znak){
            case "k":
                System.out.println("Wybrałeś kamień");
                int zk = r.nextInt(3);
                if(zk == 0){
                    System.out.println("Wylosowałem kamień, zremisowaliśmy");
                    wynikR =+ 1;
                }else if(zk == 1){
                    System.out.println("Wylosowałem papier, przegrałeś");
                    wynikP =+ 1;
                }else{
                    System.out.println("Wylosowałem nożyce, wygrałeś");
                    wynikW =+ 1;
                }

            break;
            case "p":
                System.out.println("Wybrałeś  papier");
                int zp =r.nextInt(3);
                if(zp == 0){
                    System.out.println("Wylosowałem kamień, wygrałeś");
                    wynikW =+ 1;
                
                }else if(zp == 1){
                    System.out.println("Wylosowałem papier, zremisowaliśmy");
                    wynikR =+ 1;
                }else{
                    System.out.println("Wylosowałem nożyce, przegrałeś");
                    wynikP =+ 1;
                }

            break;
            case "n":
                System.out.println("Wybrałeś  nożyce");
                int zn =r.nextInt(3);
                if(zn == 0){
                    System.out.println("Wylosowałem kamień, przegrałeś");
                    wynikP =+ 1;
                
                }else if(zn == 1){
                    System.out.println("Wylosowałem papier, wygrałeś");
                    wynikW =+ 1;
                }else{
                    System.out.println("Wylosowałem nożyce, zremisowaliśmy");
                    wynikR =+ 1;
                }

            break;
            
            default:

                System.out.println("Zły znak");
            break;
        }
        

            Scanner.nextLine();
            System.out.println("Czy chcesz zagrać jeszcze raz? Napisz tak lub nie (Może być też t lub n)");
            String odpo = Scanner.nextLine();

            if (odpo.equals("tak")){
                gra = true;
            }else if (odpo.equals("t")){
                gra = true;
            }else{
                gra = false;
            }

            

    }while(gra);
        

        
        // System.out.println("Wygrałeś "+wynikW+" razy, przegrałeś "+wynikP+" razy, a "+wynikR+" razy zremisowaliśmy");
        System.out.println("Wygrane: "+wynikW);
        System.out.println("Przegrane: "+wynikP);
        System.out.println("Remisy: "+wynikR);
        
    
        
        Scanner.close();
        
        
    }
}
    
