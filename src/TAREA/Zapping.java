package TAREA;

public class Zapping {

    public  int numeroOptimoDeCanales(int canalActual, int canalObjetivo) {
        if(canalActual==canalObjetivo) return 0;
        int clicks=canalObjetivo-canalActual;
        if( clicks>99/2){
            return 99-clicks;
        }else {
            return clicks;
        }
    }

}
