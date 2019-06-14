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
public class Student extends Human{
    private String studentNumber;
    
    public Student(){
        studentNumber="";
    }

    public Student(String studentNumber, String firstName, String lastName) {
        super(firstName, lastName);
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    
}
