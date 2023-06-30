//Registration Number: 722518085
//Student Number: s22010304

import java.util.Scanner;

public class TravelAllowanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double empSalary = scanner.nextDouble();
        System.out.print("Enter distance from Office to Employee's home (in km): ");
        double empHometoOfficeKM = scanner.nextDouble();
        
        //calculating travel allowance using Reg. No & S_No
        int certainDistance = 72; 
        int certainPercentage = 4;
        
        double travelAllowance = 0;
        if (empHometoOfficeKM > certainDistance) {
            travelAllowance = empSalary * (certainPercentage / 100.0);
            
        }
        
        double finalSalary = empSalary + travelAllowance;
        
        System.out.println("\nEmployee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Final Salary with Travel ALlowance: " + finalSalary);
    }
}