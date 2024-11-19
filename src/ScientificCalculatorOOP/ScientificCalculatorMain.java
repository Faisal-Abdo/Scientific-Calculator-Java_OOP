package ScientificCalculatorOOP;

import ScientificCalculatorOOP.Calculators.*;

import java.util.Scanner;

public class ScientificCalculatorMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    Select an option: \
                    
                    1. Final Velocity\
                    
                    2. Displacement\
                    
                    3. Final Velocity Squared\
                    
                    4. Area of a Circle\
                    
                    5. Simple Interest\
                    
                    6. Force\
                    
                    7. Density\
                    
                    8. Compound Interest\
                    
                    9. Exit""");
            System.out.print("Enter your choice: ");
            Integer userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    FinalVelocityCalculator finalVelocityCalculator = new FinalVelocityCalculator();
                    finalVelocityCalculator.calculate();
                    break;
                case 2:
                    FinalVelocityCalculator finalVelocityCalculator1 = new FinalVelocityCalculator();
                    finalVelocityCalculator1.calculateDisplacement();
                    break;
                case 3:
                    FinalVelocityCalculator finalVelocityCalculator2 = new FinalVelocityCalculator();
                    finalVelocityCalculator2.calculateFinalVelocitySquare();
                    break;
                case 4:
                    AreaOfCircleCalculator areaOfCircleCalculator = new AreaOfCircleCalculator();
                    areaOfCircleCalculator.calculate();
                    break;
                case 5:
                    SimpleInterestCalculator simpleInterestCalculator = new SimpleInterestCalculator();
                    simpleInterestCalculator.calculate();
                    break;
                case 6:
                    ForceCalculator forceCalculator = new ForceCalculator();
                    forceCalculator.calculate();
                    break;
                case 7:
                    DensityCalculator densityCalculator = new DensityCalculator();
                    densityCalculator.calculate();
                    break;
                case 8:
                    SimpleInterestCalculator simpleInterestCalculator1 = new SimpleInterestCalculator();
                    simpleInterestCalculator1.calculateCompoundInterest();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}