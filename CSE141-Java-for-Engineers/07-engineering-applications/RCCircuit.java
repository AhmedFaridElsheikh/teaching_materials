import java.util.Scanner;

public class RCCircuit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter initial voltage V0: ");
        double V0 = input.nextDouble();

        System.out.print("Enter resistance R (ohms): ");
        double R = input.nextDouble();

        System.out.print("Enter capacitance C (farads): ");
        double C = input.nextDouble();

        System.out.print("Enter time t (seconds): ");
        double t = input.nextDouble();

        // Calculation
        double V = V0 * Math.exp(-t / (R * C));

        // Output
        System.out.println("--- RC Circuit Result ---");
        System.out.println("V0 = " + V0 + " V");
        System.out.println("R  = " + R  + " ohms");
        System.out.println("C  = " + C  + " farads");
        System.out.println("t  = " + t  + " seconds");
        System.out.println("V(t) = " + V + " V");

        input.close();
    }
}
```

Sample run:
```
Enter initial voltage V0: 5
Enter resistance R (ohms): 1000
Enter capacitance C (farads): 0.001
Enter time t (seconds): 2
--- RC Circuit Result ---
V0 = 5.0 V
R  = 1000.0 ohms
C  = 0.001 farads
t  = 2.0 seconds
V(t) = 0.6766764161830635 V