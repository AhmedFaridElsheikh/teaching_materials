package com.ahmed;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		int sum =0;
		// TODO Auto-generated method stub
		ArrayList <Integer> numbers = new ArrayList<Integer>(Arrays.asList(-1,42, 32, 3, 51, 100, 99, 30));
		Stack <Integer> processedNumbers = new Stack <Integer> ();
		for(int i=0 ; i< numbers.size(); i++) {
			 if (numbers.get(i)>50)break;
			 else if(numbers.get(i) < 0)continue;
			if(numbers.get(i)%2 == 0) processedNumbers.push(numbers.get(i));

		}
		
		while(!processedNumbers.empty()) {
			sum += processedNumbers.pop();
		}
			System.out.println(sum);
	}

}
