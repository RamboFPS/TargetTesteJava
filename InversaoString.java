import java.util.Scanner;

public class InversaoString {
    public static void main(String[] args) {
        
    
    Scanner  scanner = new Scanner(System.in);
    System.out.println("Digite alguma palavra:");
    String entrada = scanner.nextLine();
    String saida = "";

   for(int i = entrada.length() -1; i >= 0; i--) {
       saida += entrada.charAt(i);
   }

    System.out.println("String Invertida: " + saida);
}
}