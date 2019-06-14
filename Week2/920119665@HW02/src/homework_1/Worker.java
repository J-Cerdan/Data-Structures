/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_1;

/**
 *
 * @author josep
 */
public class Worker extends Human{
    private double weekSalary;
    private double workHoursPerDay;

    public Worker() {
        weekSalary = workHoursPerDay = 0.0;
    }

    public Worker(double weekSalary, double workHoursPerDay, String firstName, String lastName) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursPerDay = workHoursPerDay;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    public double getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(double workHoursPerDay) {
        this.workHoursPerDay = workHoursPerDay;
    }
    
    public double MoneyPerHour(double weekSalary, double workHoursPerDay){
        return weekSalary / ( workHoursPerDay * 5 );
    }
}
