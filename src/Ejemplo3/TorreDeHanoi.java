package Ejemplo3;

/* @author Betterlee
 */
public class TorreDeHanoi {

    private int numDiscos; // número de discos a mover

    public TorreDeHanoi(int discos) {
        numDiscos = discos;
    } // fin del constructor de TorresDeHanoi

    // mueve discos de una torre a otra, de manera recursiva
    public void resolverTorres(int discos, int agujaOrigen, int agujaDestino, int agujaTemp) {
        // caso base -- sólo hay que mover un disco
        if (discos == 1) {
            System.out.printf("\n%d --> %d", agujaOrigen, agujaDestino);
            return;
        } // fin de if

        // paso recursivo -- mueve (disco - 1) discos de agujaOrigen
        // a agujaTemp usando agujaDestino
        resolverTorres(discos - 1, agujaOrigen, agujaTemp, agujaDestino);

        // mueve el último disco de agujaOrigen a agujaDestino
        System.out.printf("\n%d --> %d", agujaOrigen, agujaDestino);

        // mueve ( discos - 1 ) discos de agujaTemp a agujaDestino
        resolverTorres(discos - 1, agujaTemp, agujaDestino, agujaOrigen);
    }
}
