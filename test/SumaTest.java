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
public class SumaTest {
    
    
    @Test
    public void Suma() {
        assertEquals("10", Calc.suma(5, 5));
    }
    
    @Test
    public void Suma1() {
        assertEquals("-15", Calc.suma(-5, -10));
    }
    
    @Test
    public void Suma2() {
        assertEquals("-5", Calc.suma(-5, 10));   
    }
    
}
