package TAREA;

public class Zapping {

    public  int numeroOptimoDeCanales(int canalActual, int canalObjetivo) {
        //devuelve el valor absoluto de un número.
        int clicks= Math.abs(canalObjetivo - canalActual);
        if( clicks>99/2){
            return 99-clicks;
        }else {
            return clicks;
        }
    }

}
