package com.bayviewglen.programmingclub;

public class FactorSolitaire {

	public static void main(String[] args) {
		int[] soln = new int[5000000];
		soln[1] = 1;
		soln[2] = 2;
		int n = 10;
		for(int i = 2; i< n; i++) {
			int lowestCount = Integer.MAX_VALUE;
			System.out.println("a");
			if(soln[i] == 0) {
				for(int j = 1 ; j < i; j++) {
					int d = i - j;
					if(i == 5) {
					System.out.println(i +"-->" + j + ", " + (soln[j] + (i/j))  +", " + d + ", " + (i/j));
					System.out.println(d);
					System.out.println(soln[j] % d == 0);
					System.out.println(d-j <= 0);
					}
					if(j > 0 && soln[j] % d == 0 && d <= j)  {
						System.out.println(i +"-->" + (soln[j] + (i/j)) + ", " + j +", " + d + ", " + (i/j));
						lowestCount = Math.min(lowestCount, soln[j] + (i/j)) ;
					}
				}
				soln[i] = lowestCount;
			}		
		}
		
		for(int i = 0; i< n; i++) {
			System.out.println(i + " " + soln[i]);
		}
	}

}
