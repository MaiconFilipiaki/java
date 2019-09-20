package Program;

import Entities.Employee;
import Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> workes = new ArrayList<>();

        System.out.println("Enter the number of employees");
        int n = sc.nextInt();


        for (int i = 0; i < n ; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n) ?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hours: ");
            double valuePerHours = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
                workes.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHours);
                workes.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");

        for (Employee e : workes) {
            System.out.println(e.getName() + " - $ " + e.payment());
        }
        
        sc.close();
    }

}
