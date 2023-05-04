
package Recursividad2;
import java.util.Scanner;
/*@author Betterlee
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero para calcular el factorial");
        int numero= entrada.nextInt();
        Recur r= new Recur();
        
        int factorial = r.Factorial(numero);
        System.out.println("El factorial de: "+ numero + " es " + factorial);
    }
}
