package Week4;
import java.util.Scanner;

public class BMI {
    private double weight;
    private double height;
    private static final double weightconversion = 0.45359237;
    private static final double heightconversion = 0.0254;

    public BMI(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public BMI(){
        this(50,100);
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(Scanner scan){
        System.out.print("Please enter weight in pounds: ");
        this.weight = scan.nextDouble()*weightconversion;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(Scanner scan){
        System.out.print("Please enter height in inches: ");
        this.height = scan.nextDouble()*heightconversion;
    }

    public void calculateBMI(){
        double bmi = this.weight/Math.pow(this.height, 2);
        System.out.println("BMI is "+ bmi);
        if ( bmi < 18.5 ){
            System.out.println("Underweight");
        }
        else if (bmi <25 && bmi >=18.5){
            System.out.println("Normal");
        }
        else if (bmi >= 25 && bmi < 30 ){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}