package com.employee;
import java.util.Random;
public class Employee
{
    //Constants
    public static final int IS_EMP_FULL_TIME=1;
    public static final int IS_EMP_PART_TIME=2;
    public static final int EMP_RATE_PER_HOUR=20;
    //Calculating daily wage of employee
    public static void calculateDailyWage()
    {
        //variables
        int empHours=0;
        int empDailyWage=0;

        Random randNo=new Random();
        int empCheck=randNo.nextInt()%3;
        if(empCheck==IS_EMP_FULL_TIME)
        {
            empHours=8;
        }
        else if(empCheck==IS_EMP_PART_TIME)
        {
            empHours=4;
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
