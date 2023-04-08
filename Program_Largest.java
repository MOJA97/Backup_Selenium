package org.SeleniumIPT.com;

public class Program_Largest {
	
	public static int[] largest() {
		
		int sRan[] = new int [5];
		
		int n = 0;
		int n1 = 100;
		
		
		for (int i = 0; i < sRan.length; i++) {
			
		 sRan[i] = (int) ((Math.random()*n1-n)+n);
		 System.out.println(sRan[i]);
			
		}
		
		return sRan;
		
		
		
	}
	
	public static void main(String[] args) {
		
		int[] s = largest();
		
		int max = s[0];
		
		for (int i = 0; i < s.length; i++) {
			if (s[i++]>max) {
				
				int secondMax;
				secondMax = max;
				max = s[i++];
			}
		}
		
		System.out.println();
		System.out.println("Second largest value: "+ max);
		
		
		
		
	}

}
