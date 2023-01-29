package linkedin_learning.java;

import java.util.Scanner;

public class WaterBill {
    public static double calculateWaterBill(double gallonsUsage) {
        double cost=18.84;
        double min=1496.00;
        if(gallonsUsage<=min){
            return cost;
        }
        else{
            double g=gallonsUsage-min;
            double a=Math.ceil(g/748)*3.9+cost;
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
