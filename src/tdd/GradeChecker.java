/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

/**
 *
 * @author Thien Phuc
 */
public class GradeChecker {
    public static char checkGrade(double grade) {
        if (grade >= 5) {
            return 'P';
        }
        return 'F';
    }
}
