import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

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
