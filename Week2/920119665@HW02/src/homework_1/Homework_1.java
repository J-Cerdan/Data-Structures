/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_1;
import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Homework_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student[] students = {new Student("hf4878h","Joseph","Cerdan"),
                              new Student("nf3i28dsf","Haruki","Yoshimizu"),
                              new Student("fniubi","Hinako","Ishikawa"),
                              new Student("71f2","Hydeia","Duronslet"),
                              new Student("f62","Namgoong","Youngsoo"),
                              new Student("53","Sammy","Subramanian"),
                              new Student("28hfn33fs2","Sharan","Lao"),
                              new Student("l2nsi2","Tyler","Meier"),
                              new Student("z87h2n","Vanessa","Wong"),
                              new Student("1","Yoojin","Han")};
        
        Worker[] workers = {new Worker(848.9, 8.3, "Joseph","Cerdan"),
                            new Worker(512.5, 5.3, "Ryan","Fonkalrud"),
                            new Worker(746.5, 9.3, "Khang","Nguyen"),
                            new Worker(982.3, 7.5, "Ron","Gomez"),
                            new Worker(425.8, 8.2, "Leon","Monis"),
                            new Worker(692.3, 6.4, "Jason","Tran"),
                            new Worker(710.2, 2.7, "Zac","Puskas"),
                            new Worker(583.9, 5.3, "Robert","Pace"),
                            new Worker(423.6, 7.3, "Jareth","Laxamana"),
                            new Worker(941.3, 9.6, "Scarnon","Australia")};
        
        
        System.out.println("Unsorted Student Array: (Student Number, First Name, Last Name)");        
        for (int i=0; i<10; i++){
            System.out.print(students[i].getStudentNumber() + ", ");
            System.out.print(students[i].getFirstName() + ", ");
            System.out.println(students[i].getLastName());
        }
                
        Student tempStudent = new Student();
        
        for (int i=0; i<10; i++){
            for (int j=0; j<(9); j++){
                
                int compareValue;
                compareValue = compareStudents(students[j].getStudentNumber(), students[j+1].getStudentNumber());
                
                if (compareValue > 0){
                    tempStudent = students[j];
                    students[j] = students[j+1];
                    students[j+1] = tempStudent;
                }
               
            }
        }
        
        System.out.println("Sorted Student Array: (Student Number, First Name, Last Name)");        
        for (int i=0; i<10; i++){
            System.out.print(students[i].getStudentNumber() + ", ");
            System.out.print(students[i].getFirstName() + ", ");
            System.out.println(students[i].getLastName());
        }
        
        System.out.println("Unsorted Worker Array: (Worker PayPerHour, Weekly Salary, HoursPerDay, First Name, Last Name)");        
        for (int i=0; i<10; i++){
            double salary = workers[i].getWeekSalary();
            double workHours = workers[i].getWorkHoursPerDay();
            
            String moneyPerHour = String.format("%.02f", workers[i].MoneyPerHour(salary, workHours));
            
            System.out.print(moneyPerHour + ", ");
            System.out.print(workers[i].getWeekSalary() + ", ");
            System.out.print(workers[i].getWorkHoursPerDay() + ", ");
            System.out.print(workers[i].getFirstName() + ", ");
            System.out.println(workers[i].getLastName());
        }
                
        Worker tempWorker = new Worker();
        
        for (int i=0; i<10; i++){
            for (int j=0; j<(9); j++){
                
                double moneyPerHourWorker1 = workers[i].MoneyPerHour(workers[j].getWeekSalary(), workers[j].getWorkHoursPerDay());
                double moneyPerHourWorker2 = workers[i].MoneyPerHour(workers[j+1].getWeekSalary(), workers[j+1].getWorkHoursPerDay());                        
                
                
                if (moneyPerHourWorker1 < moneyPerHourWorker2){
                    tempWorker = workers[j];
                    workers[j] = workers[j+1];
                    workers[j+1] = tempWorker;
                }
               
            }
        }
        
        System.out.println("Sorted Worker Array: (Worker PayPerHour, Weekly Salary, HoursPerDay, First Name, Last Name)");        
        for (int i=0; i<10; i++){
            double salary = workers[i].getWeekSalary();
            double workHours = workers[i].getWorkHoursPerDay();
            
            String moneyPerHour = String.format("%.02f", workers[i].MoneyPerHour(salary, workHours));
            
            System.out.print(moneyPerHour + ", ");
            System.out.print(workers[i].getWeekSalary() + ", ");
            System.out.print(workers[i].getWorkHoursPerDay() + ", ");
            System.out.print(workers[i].getFirstName() + ", ");
            System.out.println(workers[i].getLastName());
        }
        
    }
    
    public static int compareStudents(String studentNumber1, String studentNumber2){
        return studentNumber1.compareTo(studentNumber2);
    }
    
}
