import java.util.Scanner;
import java.util.StringTokenizer;

public class Nombre {  
     static int i;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String palabra = scanner.nextLine();
        
        int countVocales = 0;
        
        for (int x = 0; x < palabra.length(); x++) {
            if ((palabra.charAt(x) == 'a') || (palabra.charAt(x) == 'e') || (palabra.charAt(x) == 'i')
                    || (palabra.charAt(x) == 'o') || (palabra.charAt(x) == 'u')) 

            countVocales++;
            
        }
        
        System.out.println("su palabra tiene este numero de vocales: " + countVocales);
    }
}
