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
public class MultiplicacionTest {
    @Test
    public void Multiplicacion() {
        assertEquals("25.00", Calc.multiplicacion(5, 5));
    }    
    @Test
    public void Multiplicacion1() {
        assertEquals("-50.00", Calc.multiplicacion(-5, 10));
    }
}
