package TAREA;

public class Zapping {

    public  int numeroOptimoDeCanales(int canalActual, int canalObjetivo) {
        if(canalActual==canalObjetivo) return 0;
        if(canalActual<canalObjetivo) return  canalObjetivo-canalActual;

        return 0;
    }

}
