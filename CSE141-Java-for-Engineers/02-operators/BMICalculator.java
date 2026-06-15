package operators;
public class BMICalculator {
    public static void main(String[] args) {

        double weight = 70;    // kg  <- change to test
        double height = 1.75;  // meters

        double bmi = weight / (height * height);
        System.out.printf("BMI: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 30.0) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }
    }
}
