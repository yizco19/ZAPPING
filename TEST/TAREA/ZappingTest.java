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
        System.out.println("Test 1");
    }
    @Test
    public void testnumeroOptimoDeCanales2(){
        Zapping zap=new Zapping();
        int clicsEsperado=1;
        int clicsReal=zap.numeroOptimoDeCanales(1,2);
        assertEquals(clicsEsperado,clicsReal);
        System.out.println("Test 2");
    }
    @Test
    public void testnumeroOptimoDeCanales3(){
        Zapping zap=new Zapping();
        int clicsEsperado=20;
        int clicsReal=zap.numeroOptimoDeCanales(10,30);
        assertEquals(clicsEsperado,clicsReal);
        System.out.println("Test 3");
    }

    @Test
    public void testnumeroOptimoDeCanales4(){
        Zapping zap=new Zapping();
        int clicsEsperado=2;
        int clicsReal=zap.numeroOptimoDeCanales(2,99);
        assertEquals(clicsEsperado,clicsReal);
        System.out.println("Test 4");
    }
}