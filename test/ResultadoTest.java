/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calc.Calc;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jroa
 */
public class ResultadoTest {    
    @Test
    public void Resultado1() {
        assertEquals("INF", Calc.Resultado(-5, 0, "/"));
    }    
    @Test
    public void Resultado2() {
        assertEquals("ERROR DE OPERACION", Calc.Resultado(-5, 0, "d"));
    }    
    @Test
    public void Resultado3() {
        assertEquals("0.50", Calc.Resultado(1, 2, "/"));
    }    
}
