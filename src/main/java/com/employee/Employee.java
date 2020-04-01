package com.employee;

import java.util.Random;

public class Employee
{
    //Checking employee is present or absent
    public static void attendenceChecking(int IS_EMP_PRESENT)
    {
        Random randNo=new Random();
        int empCheck=randNo.nextInt()%2;
        if(empCheck==1)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to employee wage computation");
        //Constants
        int IS_EMP_PRESENT=1;
        attendenceChecking(IS_EMP_PRESENT);
    }
}
