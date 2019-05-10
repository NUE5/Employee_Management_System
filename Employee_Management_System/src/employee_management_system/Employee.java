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
public abstract class Employee {
  
    protected String FirstName;
    protected String SurName;
    protected String Gender;
    protected String Email;
    protected int Age;
    protected String Password;
    protected double Salary;
  

    public Employee() {
    }

 
    public Employee( String FirstName, String SurName, String Gender, String Email, int Age, String Password) {
      
        this.FirstName = FirstName;
        this.SurName = SurName;
        this.Gender = Gender;
        this.Email = Email;
        this.Age = Age;
        this.Password=Password;
       this.Salary=Salary;
    }

    
   
    public abstract String getFirstName();

    public abstract String getSurName();
    public abstract String getGender();

    public abstract String getEmail();
   

    public abstract int getAge();
    public abstract String getPassword();
    public abstract double getSalary();
    public abstract void setFirstName(String FirstName) ;

    public abstract void setSurName(String SurName);
    public abstract void setGender(String Gender);
    public abstract void setEmail(String Email);

    public abstract void setAge(int Age);

    public abstract void setPassword(String Password) ;
    

    public abstract void setSalary(float Salary) ;

  


}
