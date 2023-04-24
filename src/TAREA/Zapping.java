package TAREA;

public class Zapping {

    public  int numeroOptimoDeCanales(int canalActual, int canalObjetivo) {
        //devuelve el valor absoluto de un número.
        int clicks= Math.abs(canalObjetivo - canalActual);
        return Math.min(clicks, 99 - clicks);

    }

}
