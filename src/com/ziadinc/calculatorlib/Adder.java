package com.ziadinc.calculatorlib;
public class Adder{
	public static void main(String[] args){
		int firstNum = 1;
		int secondNum = 2;
		
		if(args.length == 2){
			firstNum = Integer.parseInt(args[0]);
			secondNum = Integer.parseInt(args[1]);
		}
		int sum = firstNum + secondNum;
		System.out.println(sum);
	}
	
}
