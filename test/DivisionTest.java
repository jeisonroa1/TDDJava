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
public class DivisionTest {
    @Test
    public void Division() {
        assertEquals("1.00", Calc.division(5, 5));
    }
    
    @Test
    public void Division1() {
        assertEquals("-0.50", Calc.division(-5, 10));
    }
    
    @Test
    public void Division2() {
        assertEquals("INF", Calc.division(-5, 0));
    }
}
