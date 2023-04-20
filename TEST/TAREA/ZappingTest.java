package TAREA;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.StandardSocketOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ZappingTest {
    @BeforeEach
    public  void start(){
        System.out.println("Ejecutar la Prueba");
    }
    @Test
    public void testnumeroOptimoDeCanales1(){
        Zapping zap=new Zapping();
        int clicsEsperado=0;
        int clicsReal=zap.numeroOptimoDeCanales(0,0);
        assertEquals(clicsEsperado,clicsReal);
    }
}