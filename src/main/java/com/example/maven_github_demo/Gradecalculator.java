package com.example.maven_github_demo;

public class Gradecalculator {
	public static int calculatorTotal(int m1,int m2,int m3)
	{
		return m1+m2+m3;
		
	}
	public static double calculatorAverage(int m1,int m2,int m3)
	{
		return calculatorTotal(m1,m2,m3)/3.0;
	}
	public static boolean isPass(double average)
	{
		return average>=40.0;
		
	}
	public static void main(String[]args)
	{
		int m1=75;int m2=68;int m3=82;
		int total =calculatorTotal(m1,m2,m3);
		double average=calculatorAverage(m1,m2,m3);
		System.out.println("total:"+total);
		System.out.println("average:"+average);
		System.out.println("result:"+(isPass(average)?"PASS":"FAIL"));
	}
	

}