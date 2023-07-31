package com.mycompany.question3b;
public class Question3b {

    public static void main(String[] args) {
         Employeesalary s1=new Employeesalary(75000.00);
        s1.setEmpName("Tharindu");
        s1.setbSalary(85000.00);

        double bAmount= s1.bonusAmount();
        System.out.println("New Salary is: "+bAmount);
    }
}
