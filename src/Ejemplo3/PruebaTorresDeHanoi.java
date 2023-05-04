package Ejemplo3;

/*@author Betterlee
 */
public class PruebaTorresDeHanoi {

    public static void main(String[] args) {
        int agujaInicial = 1; // se usa el valor 1 para indicar agujaInicial en la salida
        int agujaFinal = 3; // se usa el valor 3 para indicar agujaFinal en la salida
        int agujaTemp = 2; // se usa el valor 2 para indicar agujaTemp en la salida
        int totalDiscos = 3; // número de discos
        TorreDeHanoi torres = new TorreDeHanoi(totalDiscos);
        
         // llamada no recursiva inicial: mueve todos los discos.
 torres.resolverTorres(totalDiscos, agujaInicial, agujaFinal, agujaTemp);
    }
}
