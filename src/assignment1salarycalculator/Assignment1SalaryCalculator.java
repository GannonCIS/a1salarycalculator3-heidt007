/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author gubotdev
 */
public class Assignment1SalaryCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SalaryCalc sCalc = new SalaryCalc();
        
        System.out.println(sCalc.calcHourlyWage(95000));
        System.out.println(sCalc.calcSalary(8.50));
        System.out.println(sCalc.calcTaxes(95000, 13.8));
        System.out.println(sCalc.calcMonthlyAfterTax(95000, 13.8));
    }
}
