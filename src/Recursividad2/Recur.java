
package Recursividad2;

/* @author Betterlee
 */
public class Recur {
    public int Factorial(int param){
        if(param > 0){
            int valor= param * Factorial(param - 1);
            return valor;
        }
        return 1;
    }
}
