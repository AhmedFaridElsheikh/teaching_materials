public class RLCStepResponse {
    public static void main(String[] args) {
        
        // --- 1. DECLARATION & INITIALIZATION (Circuit Parameters) ---
        double R = 63.2;    // Resistance (Ohms)
        double L = 1e-3;     // Inductance (Henrys)
        double C = 1e-6;    // Capacitance (Farads)
        
        double dt = 0.00001;  // Simulation time step (1 millisecond)
        double inputVoltage = 5; // 5V DC Step Input (u)

        // --- 2. 1D ARRAY: The State Vector (x) ---
        // x[0] represents Capacitor Voltage (v_c)
        // x[1] represents Inductor Current (i_L)
        // We initialize both to 0 (completely discharged circuit)
        double[] x = {0.0, 0.0}; 

        // --- 3. 2D ARRAY: The System Matrix (A) ---
        // This 2x2 grid holds the internal dynamics of the circuit
        double[][] A = {
            { 0.0,      1.0 / C },     // Row 0: d(vc)/dt
            { -1.0 / L, -R / L  }      // Row 1: d(iL)/dt
        };

        // --- 4. 1D ARRAY: The Input Matrix (B) ---
        // Describes how the source voltage enters the system
        double[] B = {0.0, 1.0 / L};

        System.out.println("Time(s) \t Capacitor Voltage (V)");

        // --- 5. THE LOOP: Numerical Integration (Euler Method) ---
        // Simulating 0.2 seconds total (200 steps of 1ms each)
        for (int step = 0; step <= (20); step++) {
            
            double time = step * dt;
            
            // Print the current time and voltage
            System.out.println(time + " \t " + x[0]);

            // Math: dx/dt = (A * x) + (B * u)
            // We must calculate the matrix multiplication manually using array indices
            double dVoltage = (A[0][0] * x[0]) + (A[0][1] * x[1]) + (B[0] * inputVoltage);
            double dCurrent = (A[1][0] * x[0]) + (A[1][1] * x[1]) + (B[1] * inputVoltage);

            // Update the State Vector: x_new = x_old + (derivative * dt)
            x[0] = x[0] + (dVoltage * dt);
            x[1] = x[1] + (dCurrent * dt);
        }
    }
}