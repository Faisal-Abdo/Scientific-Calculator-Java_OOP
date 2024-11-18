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
        Double velocity = scanner.nextDouble();
        motion.setInitialVelocity(velocity);
        System.out.print("Enter Acceleration: ");
        Double acceleration = scanner.nextDouble();
        motion.setAcceleration(acceleration);
        System.out.print("Enter Time: ");
        Double time = scanner.nextDouble();
        motion.setTime(time);
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

    private static Double getSquare(Double number) {
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