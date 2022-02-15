package Week4;

import java.util.Scanner;

public class BMIoutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BMI bmi = new BMI();
        bmi.setWeight(input);
        bmi.setHeight(input);
        bmi.calculateBMI();
    }
}