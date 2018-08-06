/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calc.Log;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author JR
 */
public class LogTest {
    @Test
    public void LogTest1() {
        Log logger = new Log();
        logger.agregarEntrada("0.0 l 0.0 = null\n10.0 + 10.0 = 20,00\n10.0 * 10.0 = 100,00");
        assertEquals(null +"0.0 l 0.0 = null\n10.0 + 10.0 = 20,00\n10.0 * 10.0 = 100,00", logger.imprimirLog());
    }
}
