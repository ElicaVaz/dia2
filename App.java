
package segundodia;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Numeros objetoNumero = new Numeros();
        
        Scanner leitor = new Scanner(System.in);
                
        System.out.println("Digite um número: ");
        objetoNumero.x = leitor.nextInt();
        
        System.out.println("Digite outro número: ");
        objetoNumero.y = leitor.nextInt();
        
        System.out.println("Soma = " + objetoNumero.somarNumeros());
    }
}
