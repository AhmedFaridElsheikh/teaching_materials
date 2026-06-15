package com.ahmed;
import java.util.*;

public class StackExampleBetter {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-1, 42, 32, 3, 51, 100, 99, 30));
        Stack<Integer> processedNumbers = new Stack<>();

        // Processing
        for (int number : numbers) {      
            if (number > 50)  break;
            if (number < 0)   continue;
            if (number % 2 == 0) processedNumbers.push(number);
        }

        // Sum by popping
        int sum = 0;
        while (!processedNumbers.empty()) {
            sum += processedNumbers.pop();
        }

        System.out.println("Sum of stack elements: " + sum);
    }
}