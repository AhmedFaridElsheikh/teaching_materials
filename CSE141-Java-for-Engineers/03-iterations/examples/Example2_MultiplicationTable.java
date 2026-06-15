// ============================================================
//  EXAMPLE 2 Print the multiplication table (1 to 10)
// ============================================================
public class Example2_MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();  // new line after each row
        }

    }
}

