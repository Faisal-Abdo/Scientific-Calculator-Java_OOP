package ScientificCalculatorOOP.Calculators;

import ScientificCalculatorOOP.DataClasses.Motion;
import ScientificCalculatorOOP.Interfaces.CalculatorInterface;
import ScientificCalculatorOOP.Interfaces.DataInput;

import java.util.Scanner;

public class FinalVelocityCalculator implements CalculatorInterface, DataInput {
    static Scanner scanner = new Scanner(System.in);

    @Override
    public Motion insertData() {
        Motion motion = new Motion();
        System.out.print("Enter initial Velocity: ");
        motion.setInitialVelocity(scanner.nextDouble());
        System.out.print("Enter Acceleration: ");
        motion.setAcceleration(scanner.nextDouble());
        System.out.print("Enter Time: ");
        motion.setTime(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Enter unit: ");
        motion.setUnit(scanner.nextLine());

        return motion;
    }

    @Override
    public void calculate() {
        Motion motionData = insertData();
        // formula = initial V + ( a * t )
        Double finalVelocity = motionData.getInitialVelocity() + (motionData.getAcceleration() * motionData.getTime());
        System.out.println("Final velocity = " + finalVelocity + motionData.getUnit());
    }

    public static Double getSquare(Double number) {
        return number * number;
    }

    public void calculateFinalVelocitySquare() {
        Motion motionData = insertData();
        Double finalVelocitySquared = getSquare(motionData.getInitialVelocity()) + (2 * (motionData.getAcceleration() * motionData.getTime()));
        System.out.println("Final velocity squared = " + finalVelocitySquared + motionData.getUnit());
    }

    public void calculateDisplacement() {
        Motion motionData = insertData();
        Double displacement = (motionData.getInitialVelocity() * motionData.getTime()) + ((motionData.getAcceleration() / 2) * Math.pow(motionData.getTime(), 2));
        System.out.println("Displacement = " + displacement + motionData.getUnit());
    }
}