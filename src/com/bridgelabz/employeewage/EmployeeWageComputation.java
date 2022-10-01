package com.bridgelabz.employeewage;

public class EmployeeWageComputation {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 12;
    static final int PART_TIME_HOUR = 6;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    static final int WORKING_DAY_PER_MONTH = 20;
    static final int WORKING_HOURS_PER_MONTH = 100;

    public static void main(String[] args) {
        int day = 1;
        int totalWage = 0;
        int employeeHours = 0;
        while (day <= WORKING_DAY_PER_MONTH && employeeHours <=WORKING_HOURS_PER_MONTH) {
            int dailyWage = 0;
            int employeeAttendance = (int) Math.floor(Math.random()*10)%3;

            switch (employeeAttendance)
            {
                case IS_FULL_TIME:
                    System.out.println("Employee is Full Time");
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    employeeHours = employeeHours + FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Part Time");
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    employeeHours = employeeHours + PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Employee is absent");
            }
            totalWage = totalWage + dailyWage;
            System.out.println(" Daily Wage For =>" + day + "day =>" + dailyWage);
            day++;
        }
        System.out.println("Total Working Hours =>" + employeeHours);
        System.out.println("Total Wage =>" + totalWage);
    }
}

