package ScientificCalculatorOOP.Calculators;

import ScientificCalculatorOOP.DataClasses.Motion;
import ScientificCalculatorOOP.DataClasses.Physics;
import ScientificCalculatorOOP.Interfaces.CalculatorInterface;

import java.util.Scanner;

public class ForceCalculator implements CalculatorInterface {
    static Scanner scanner = new Scanner(System.in);
    static Motion motion = new Motion();

    public static Physics insertDataForForce() {
        Physics physics = new Physics();

        System.out.print("Enter Mass: ");
        Double mass = scanner.nextDouble();
        physics.setMass(mass);
        System.out.print("Enter Acceleration: ");
        Double acceleration = scanner.nextDouble();
        motion.setAcceleration(acceleration);

        motion.setUnit("N");
        physics.setMotionData(motion); //notice use of composition

        return physics;
    }

    @Override
    public void calculate() {
        Physics physicsData = insertDataForForce();
        Double force = physicsData.getMass() * physicsData.getMotionData().getAcceleration();   //access Motion object first within Physics then acceleration that is stored in Motion
        System.out.println("Force = " + force + physicsData.getMotionData().getUnit());
    }
}
