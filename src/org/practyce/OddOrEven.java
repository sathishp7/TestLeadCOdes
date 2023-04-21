package org.practyce;

public class OddOrEven {
public static void main(String[] args) {
	int input= 12;
	if(input%2==0) {
		System.out.println(input);
	}
	
	for(int i=1;i<10;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	
	//adding two numbers
	int a=10;
	int b=20;
	int c=0;
	c=a+b;
	System.out.println(c);
	
	
	
	//adding number from 1 to 10
	int sum=0;
	for(int i=1;i<=10;i++) {
		sum= sum+i;
		
	}
	System.out.println(sum);
	
	//count number from 1 to 10
	int count=0;
	for(int i=0;i<=10;i++) {
		count =i;
	}
	System.out.println(count);
	
	//count of even or odd numbers
	int numCount=0;
	for(int i=1;i<=10;i++) {
		if(i%2==0) {
			numCount=numCount+i;
		}
			}
	System.out.println(numCount); 
	
	int fact=1;
	for(int i=1;i<=5;i++) {
		fact=fact*i;
		
	}
System.out.println(fact);



}
}
