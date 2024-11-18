package ScientificCalculatorOOP.Calculators;

import ScientificCalculatorOOP.DataClasses.Density;
import ScientificCalculatorOOP.DataClasses.Motion;
import ScientificCalculatorOOP.DataClasses.Physics;
import ScientificCalculatorOOP.Interfaces.CalculatorInterface;
import ScientificCalculatorOOP.Interfaces.DataInput;

import java.util.Scanner;

public class DensityCalculator implements CalculatorInterface, DataInput {
    static Scanner scanner = new Scanner(System.in);

    @Override
    public Density insertData() {
        Density density = new Density();
        Physics physics = new Physics();
        System.out.print("Enter Volume: ");
        density.setVolume(scanner.nextDouble());
        System.out.print("Enter Mass: ");
        physics.setMass(scanner.nextDouble());
        density.setPhysics(physics);

        density.setUnit("kg/m^3");

        return density;
    }

    @Override
    public void calculate() {
        Density densityData = insertData();
        Double density = densityData.getPhysics().getMass() / densityData.getVolume();
        System.out.println("Density = " + density + densityData.getUnit());
    }


}
