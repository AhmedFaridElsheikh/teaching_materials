public class FloatingPoint {
    public static void main(String[] args) {

        // In real math: 0.1 + 0.2 == 0.3. Always. Obviously.
        System.out.println(0.1 + 0.2);         // 0.30000000000000004
        System.out.println(0.1 + 0.2 == 0.3);  // false !!

        // float precision: no float between 2^24 and 2^24+2
        float a = 16777216f;
        float b = a + 1;
        System.out.println(a == b); // true !!

        // associativity failure
        double x = 1e15, y = -1e15, z = 1.5;
        System.out.println((x + y) + z); // 1.5   ✓
        System.out.println(x + (y + z)); // 2.0   ✗

        // special values
        System.out.println(1.0 / 0.0);   // Infinity
        System.out.println(-1.0 / 0.0);  // -Infinity
        System.out.println(0.0 / 0.0);   // NaN

        // NaN is not equal to itself
        double nan = Double.NaN;
        System.out.println(nan == nan);        // false !!
        System.out.println(Double.isNaN(nan)); // true — correct way to check

        // overflow and precision
        System.out.println(1e308 + 1e308 + (-1e308));        // Infinity ✗
        System.out.println(1e308 + (1e308 + (-1e308)));      // 1.0E308  ✓

        double big = 1e17;
        System.out.println(big + 1.0 == big); // true — 1.0 below precision threshold
    }
}
