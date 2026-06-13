# Engineering Applications

These examples were written specifically for electrical power engineering students — demonstrating that Java is directly useful in their field.

## RCCircuit.java
Calculates the capacitor voltage in an RC circuit at time t:

**V(t) = V₀ · e^(−t / RC)**

Takes R, C, V₀, and t as user input.

## RLCStepResponse.java
Simulates an RLC series circuit responding to a 5V DC step input.

Uses state-space representation:
- State vector **x** = [v_c, i_L] (capacitor voltage, inductor current)
- System matrix **A** (2×2)
- Input matrix **B**

Integrates with the **Euler method**: x_new = x_old + (dx/dt) · Δt

This is the same approach used in MATLAB/Simulink — just written from scratch in Java using 1D and 2D arrays.

## QuadraticEquation.java
Solves ax² + bx + c = 0 using the quadratic formula.
