package com.ahmed;
import java.util.Scanner;
public class Functions{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int x= sc.nextInt();
                int y = sc.nextInt();
                System.out.println(Sum(x,y));
                sc.close();
        }
        static int Sum(int x, int y){
                int result = x+y;
                return result;
        }
}
