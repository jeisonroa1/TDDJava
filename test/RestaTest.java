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
public class RestaTest {
    
    @Test
    public void Resta() {
        assertEquals("-1.00", Calc.resta(5, 6));
    }
    
    @Test
    public void Resta1() {
        assertEquals("5.00", Calc.resta(-5, -10));
    }
    
    @Test
    public void Resta2() {
        assertEquals("-15.00", Calc.resta(-5, 10));   
    }
}
