package com.employee;
import java.util.Random;
public class Employee
{
    //Constants
    public static final int IS_EMP_FULL_TIME=1;
    public static final int IS_EMP_PART_TIME=2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static final int WORKING_DAYS_IN_MONTH=20;
    //Calculating monthly wage of employee
    public static void calculateDailyWage()
    {
        //variables
        int empHours=0;
        int empDailyWage=0;
        int empMonthlyWage=0;

        for(int i=1;i<=WORKING_DAYS_IN_MONTH;i++) {
            Random randNo = new Random();
            int empCheck = randNo.nextInt() % 3;
            switch (empCheck) {
                case IS_EMP_FULL_TIME:
                    empHours = 8;
                    break;
                case IS_EMP_PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            empDailyWage = empHours * EMP_RATE_PER_HOUR;
            empMonthlyWage=empMonthlyWage+empDailyWage;
        }
        System.out.println("Employee monthly wage="+empMonthlyWage);
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to employee wage computation");
        calculateDailyWage();
    }
}
