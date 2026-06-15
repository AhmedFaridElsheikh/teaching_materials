// Create a database for students
/**
 * Store calculation
 * Inputs customer Name
 * the products specifcation and then calculate volume 
 * data
 * multiple heights
 * make reciete
 *  ax^2 +bx +c =0 solve this equation using general rule 
 * a = (-b +sqr(b^2 -4ac)/2*a
 */

 import java.util.Scanner;

public class QuadraticEquation{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        var firstCoff,secondCoff,thirdCoff,root;
        System.out.print("Enter first coff: ");
        firstCoff = input.nextDouble();
        System.out.print("Enter second coff: ");
        secondCoff = input.nextDouble();
        System.out.print("Enter third coff: ");
        thirdCoff = input.nextDouble();
        root = (-secondCoff+Math.sqrt(Math.pow(secondCoff,2)-(4*firstCoff*thirdCoff)))/(2*firstCoff);
        System.out.print("the solution is :" + root +"\t and "+-1*root);

        input.close();

        

    }
}