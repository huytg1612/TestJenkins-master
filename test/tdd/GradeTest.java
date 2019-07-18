/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thien Phuc
 */
public class GradeTest {
    
    @Test
    public void testPF() {
        assertEquals('P', GradeChecker.checkGrade(10));
        assertEquals('E', GradeChecker.checkGrade(11));
    }
    
}
