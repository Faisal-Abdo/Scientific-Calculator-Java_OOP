package ScientificCalculatorOOP.Calculators;

import ScientificCalculatorOOP.DataClasses.Motion;
import ScientificCalculatorOOP.DataClasses.Physics;
import ScientificCalculatorOOP.Interfaces.CalculatorInterface;
import ScientificCalculatorOOP.Interfaces.DataInput;

import java.util.Scanner;

public class ForceCalculator implements CalculatorInterface, DataInput {
    static Scanner scanner = new Scanner(System.in);
    ;

    @Override
    public Physics insertData() {
        Physics physics = new Physics();
        Motion motion = new Motion();
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
        Physics physicsData = insertData();
        Double force = physicsData.getMass() * physicsData.getMotionData().getAcceleration();   //access Motion object first within Physics then acceleration that is stored in Motion
        System.out.println("Force = " + force + physicsData.getMotionData().getUnit());
    }
}