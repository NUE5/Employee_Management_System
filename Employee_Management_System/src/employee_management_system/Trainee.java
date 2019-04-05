/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_management_system;

/**
 *
 * @author nanon
 */
public class Trainee extends Employee{
    private double GPA;
    private String University;
    private int AcademicYear;

    public Trainee(double GPA, String University, int AcademicYear, int ID, String FirstName, String SurName, String Gender, String Email, int Age, double Salary, String Password, String DOB) {
        super(ID, FirstName, SurName, Gender, Email, Age, Salary, Password, DOB);
        this.GPA = GPA;
        this.University = University;
        this.AcademicYear = AcademicYear;
        Salary=1000.0;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String University) {
        this.University = University;
    }

    public int getAcademicYear() {
        return AcademicYear;
    }

    public void setAcademicYear(int AcademicYear) {
        this.AcademicYear = AcademicYear;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    
    
}
