package ScientificCalculatorOOP.Calculators;

import ScientificCalculatorOOP.DataClasses.Interest;
import ScientificCalculatorOOP.Interfaces.CalculatorInterface;
import ScientificCalculatorOOP.Interfaces.DataInput;

import java.util.Scanner;

public class SimpleInterestCalculator implements CalculatorInterface, DataInput {
    static Scanner scanner = new Scanner(System.in);

    @Override
    public Interest insertData() {
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

    public void calculateCompoundInterest() {
        Interest interestData = insertData();
        Double compoundInterest = interestData.getPrincipal() * Math.pow((1 + interestData.getRate() / 100), interestData.getTime()) - interestData.getPrincipal();
        System.out.println("Compound Interest = " + compoundInterest);
    }

    @Override
    public void calculate() {
        Interest interestData = insertData();
        Double simpleInterest = (interestData.getPrincipal() * interestData.getRate() * interestData.getTime()) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
    }
}