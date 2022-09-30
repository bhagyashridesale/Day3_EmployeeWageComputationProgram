package com.bridgelabz.employeewage;

public class EmployeeWageComputation {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        int employeeAttendance=(int)Math.round(Math.random());
            System.out.println("Employee Attendance");
        int dailyWage = 0;
            if (employeeAttendance==1) {
                System.out.println("Employee is Present");
                dailyWage= WAGE_PER_HOUR*FULL_DAY_HOUR;
            }
            else{
                System.out.print("Employee is Absent");
            }
        System.out.print("Daily Wage =>" +dailyWage);

    }
    }

