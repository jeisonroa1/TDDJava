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
        assertEquals("10 * 12 = 120 /n 10 / 0 = INF ", Log.verLog());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
