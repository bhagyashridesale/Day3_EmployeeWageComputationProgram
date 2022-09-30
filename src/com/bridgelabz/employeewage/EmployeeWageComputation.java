package com.bridgelabz.employeewage;

public class EmployeeWageComputation {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 12;

    static final int PART_TIME_HOUR = 6;
    



    public static void main(String[] args) {
        int employeeAttendance=(int)Math.floor(Math.random()*10)%3;
            System.out.println("Employee Attendance");
        int dailyWage = 0;
            if (employeeAttendance==2) {
                System.out.println("Employee is Full Time");
                dailyWage= WAGE_PER_HOUR*FULL_DAY_HOUR;
            }
            else if (employeeAttendance==1){
                System.out.print("Employee is Part Time");
            }
            else {
                System.out.println("Employee is absent");
            }
            System.out.println(" Daily Wage =>" +dailyWage);

    }
    }

