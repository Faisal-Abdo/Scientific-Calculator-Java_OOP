package ScientificCalculatorOOP.Calculators;

import ScientificCalculatorOOP.DataClasses.Interest;
import ScientificCalculatorOOP.Interfaces.CalculatorInterface;

import java.util.Scanner;

public class SimpleInterestCalculator implements CalculatorInterface {
    static Scanner scanner = new Scanner(System.in);

    public static Interest insertInterestData() {
        Interest interest = new Interest();
        System.out.print("Enter Principal: ");
        Double principal = scanner.nextDouble();
        interest.setPrincipal(principal);
        System.out.print("Enter Rate: ");
        Double rate = scanner.nextDouble();
        interest.setRate(rate);
        System.out.print("Enter Time: ");
        Double time = scanner.nextDouble();
        interest.setTime(time);

        //No unit needed here

        return interest;
    }

    public static void calculateCompoundInterest() {
        Interest interestData = insertInterestData();
        Double compoundInterest = interestData.getPrincipal() * Math.pow((1 + interestData.getRate() / 100), interestData.getTime()) - interestData.getPrincipal();
        System.out.println("Compound Interest = " + compoundInterest);
    }

    @Override
    public void calculate() {
        Interest interestData = insertInterestData();
        Double simpleInterest = (interestData.getPrincipal() * interestData.getRate() * interestData.getTime()) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
    }
}