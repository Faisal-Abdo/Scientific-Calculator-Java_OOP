package ScientificCalculatorOOP.Calculators;

import ScientificCalculatorOOP.DataClasses.Motion;
import ScientificCalculatorOOP.Interfaces.CalculatorInterface;

import java.util.Scanner;

public class FinalVelocityCalculator implements CalculatorInterface {
    static Scanner scanner = new Scanner(System.in);

    public static Motion insertDataForVelocity() {
        Motion motion = new Motion();
        System.out.print("Enter initial Velocity: ");
        Double velocity = scanner.nextDouble();
        motion.setInitialVelocity(velocity);
        System.out.print("Enter Acceleration: ");
        Double acceleration = scanner.nextDouble();
        motion.setAcceleration(acceleration);
        System.out.println("Enter Time: ");
        Double time = scanner.nextDouble();
        motion.setTime(time);

        motion.setUnit("m/s");

        return motion;
    }

    private static Double getSquare(Double number) {
        return number * number;
    }

    public static void calculateFinalVelocitySquare() {
        Motion motionData = insertDataForVelocity();
        Double finalVelocitySquared = getSquare(motionData.getInitialVelocity()) + (2 * (motionData.getAcceleration() * motionData.getTime()));
        System.out.println("Final velocity squared = " + finalVelocitySquared + motionData.getUnit());
    }

    @Override
    public void calculate() {
        Motion motionData = insertDataForVelocity();
        // formula = initial V + ( a * t )
        Double finalVelocity = motionData.getInitialVelocity() + (motionData.getAcceleration() * motionData.getTime());
        System.out.println("Final velocity = " + finalVelocity + motionData.getUnit());
    }
}
