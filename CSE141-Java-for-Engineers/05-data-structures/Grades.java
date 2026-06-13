package com.ahmed;
import java.util.*;

public class Grades {
    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            grades.add(rand.nextInt(101));
        }


        Stack<Integer> passed = new Stack<>();
        
        
        for (int i = 0; i < grades.size(); i++) {
        	int currentGrade = grades.get(i);
            if (currentGrade == 100) {       
                System.out.println("Score of 100 found at index " + i + ". Stopping.");
                break;
            } else if (currentGrade == 0) {  
                continue;
            } else if (currentGrade >= 50) { 
                passed.push(grades.get(i));
            }
        }

        System.out.println("Passed stack: " + passed);
    }
}