/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author jared
 */
public class SalaryCalc {
    public double calcHourlyWage(int salary){
        return (double) salary / 365 / 24;
    }
    
    public double calcSalary(double hourlyWage){
        return hourlyWage * (40*52);
    }
    
    public double calcTaxes(int salary, double perc){
        return perc * salary;
    }
    
    public double calcMonthlyAfterTax(int salary, double perc){
        return (((100 - perc)/100) * salary) / 12;
    }
}
