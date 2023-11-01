import java.util.Scanner;
import java.util.StringTokenizer;

public class Nombre {  
     static int i;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra = "";
        palabra = scanner.nextLine();
        System.out.println("Ingrese su nombre");

        for (int x = 0; x < palabra.length(); x++) {
            if ((palabra.charAt(x) == 'a') || (palabra.charAt(x) == 'e') || (palabra.charAt(x) == 'i')
                    || (palabra.charAt(x) == 'o') || (palabra.charAt(x) == 'u')) 

            System.out.println("su palabra : " + scanner + " tiene este numero de vocales: " + x);
        }

    }}
