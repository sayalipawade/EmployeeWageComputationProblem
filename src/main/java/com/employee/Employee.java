package com.employee;
import java.util.Random;
public class Employee
{
    //Constants
    public static final int IS_EMP_FULL_TIME=1;
    public static final int IS_EMP_PART_TIME=2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static final int WORKING_DAYS_IN_MONTH=20;
    public static final int MAXIMUM_WORK_HOURS=100;

    //getting employee working hours
    public static int getWorkingHours(int empCheck)
    {
        //variables
        int empHours = 0;
        switch (empCheck)
        {
            case IS_EMP_FULL_TIME:
                empHours = 8;
                break;
            case IS_EMP_PART_TIME:
                empHours = 4;
                break;
            default:
                empHours = 0;
        }
        return empHours;
    }

    //Calculating daily wage of employee
    public static int calculateDailyWage(int empHours)
    {
        int DailyWage=0;
        DailyWage=empHours*EMP_RATE_PER_HOUR;
        return DailyWage;
    }

    //calculating monthly wage of employee
    public static void calculateMonthlyWage()
    {
        //variables
        int totalEmpHours = 0;
        int totalSalary = 0;
        int totalWorkingDays = 0;
        int empHours=0;
        int empDailyWage[]=new int[100];
        while (totalEmpHours < MAXIMUM_WORK_HOURS && totalWorkingDays < WORKING_DAYS_IN_MONTH)
        {
            Random randNo = new Random();
            int empCheck = randNo.nextInt()%3;
            empHours = getWorkingHours(empCheck);
            totalEmpHours = totalEmpHours + empHours;
            totalWorkingDays++;
            empDailyWage[totalWorkingDays]=calculateDailyWage(empHours);
            System.out.println(totalWorkingDays+"="+empDailyWage[totalWorkingDays]);
            totalSalary=totalSalary+empDailyWage[totalWorkingDays];
        }
        System.out.println("Total salary of employee="+totalSalary);
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to employee wage computation");
        calculateMonthlyWage();
    }
}
