package com.employee;
import java.util.Random;
public class Employee
{
    //Constants
    public static final int IS_EMP_PRESENT=1;
    public static final int EMP_RATE_PER_HOUR=20;
    //Checking employee is present or absent
    public static void calculateDailyWage()
    {
        //variables
        int empHours=0;
        int empDailyWage=0;

        Random randNo=new Random();
        int empCheck=randNo.nextInt()%2;
        if(empCheck==IS_EMP_PRESENT)
        {
            empHours=8;
        }
        empDailyWage=empHours*EMP_RATE_PER_HOUR;
        System.out.println("Employee Daily wage="+empDailyWage);
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to employee wage computation");
        calculateDailyWage();
    }
}
