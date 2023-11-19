package com.mycompany.salarydetails;

import java.util.*;

public class SalaryDetails {

    static Scanner sc= new Scanner (System.in);
    static double salary , taxes , salaryaftertax, netsalary;
    static int incentive = 0;
   
    public static void CalculaterSalary()
    {
        

        
        System.out.println("Enter Your Salary : ");
        salary = sc.nextDouble();
        System.out.println("Enter The Tax : ");
        taxes = sc.nextDouble();
        taxes = taxes/100;
        System.out.println("Enter The Incentive : " );
        incentive= sc.nextInt();
        System.out.println();
        salaryaftertax = salary - (salary * taxes);
        netsalary = salaryaftertax + incentive;
    }
    
     public static void printSalary()
    {
        System.out.println("Salary Details : "+ "\n--------------------");
        System.out.println("Your Base Salary : "+ salary);
        System.out.println("Taxes :"+ taxes);
        System.out.println("Salary after Tax : " + salaryaftertax);
        System.out.println("Incentive : "+ incentive+ "\n-----------------------");
        System.out.println("Net Salary : "+ netsalary );
        
    }
     
     
    public static void main(String[] args) {
     
     System.out.println("How many loops for salary ? ");
    int loop = sc.nextInt();   // How many would you repetition?
    for (int i = 0; i < loop; i++) 
    {
        CalculaterSalary();
        printSalary(); 
    } 
    }
}
