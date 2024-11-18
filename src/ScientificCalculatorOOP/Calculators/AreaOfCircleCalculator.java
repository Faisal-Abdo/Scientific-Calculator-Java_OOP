package ScientificCalculatorOOP.Calculators;

import ScientificCalculatorOOP.DataClasses.BaseData;
import ScientificCalculatorOOP.DataClasses.Circle;
import ScientificCalculatorOOP.Interfaces.CalculatorInterface;

import java.util.Scanner;

public class AreaOfCircleCalculator implements CalculatorInterface {
    static Scanner scanner = new Scanner(System.in);
    static BaseData baseData = new BaseData();

    public static Circle insertCircleData() {
        Circle circle = new Circle();
        System.out.print("Enter radius: ");
        circle.setRadius(scanner.nextDouble());

        baseData.setUnit("m^2");
        circle.setBaseData(baseData);

        return circle;
    }

    @Override
    public void calculate() {
        Circle circleData = insertCircleData();
        Double areaOfCircle = Math.PI * Math.pow(circleData.getRadius(), 2);
        System.out.println("Area of Circle = " + areaOfCircle + circleData.getBaseData().getUnit());
    }
}
