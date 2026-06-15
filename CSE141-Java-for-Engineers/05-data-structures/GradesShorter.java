package com.ahmed;

import java.util.*;

public class GradesShorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> grades = new ArrayList<>
		(Arrays.asList(45, 78, 0, 92, 100, 99, 30));


        System.out.println("Grades: " + grades);

        Stack<Integer> passed = new Stack<>();
		
		
		for (int score : grades) {
		    if (score == 100) { break; }
		    if (score == 0)   { continue; }
		    if (score >= 50)  { passed.push(score); }

		}
        System.out.println("Grades: " + passed);

	}

}
