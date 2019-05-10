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

    public Trainee(double GPA, String University, int AcademicYear,String FirstName, String SurName, String Gender, String Email, int Age,  String Password,double salary) {
        super( FirstName, SurName, Gender, Email, Age,  Password);
        this.GPA = GPA;
        this.University = University;
        this.AcademicYear = AcademicYear;
        salary=1000.0;
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
        return 1000.0;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String SurName) {
        this.SurName = SurName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public void setSalary(float Salary) {
       this.Salary=Salary;
    }


   

  
    
}
