package com.tapia.dmojtlecontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UnluckyNumbers {
	public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int k = Integer.parseInt(in.readLine());
			String u = in.readLine();      //Split into String array by space
			int[] unlucky = new int[k];  //Create int array
			for(int i = 0; i<k;i++) {
				unlucky[i] = Integer.parseInt(u.split(" ")[i]);
			}

			int n = Integer.parseInt(in.readLine());
			int[] appts = new int[n];  //Create int array

			for(int i = 0; i<n;i++) {
				appts[i] = Integer.parseInt(in.readLine());
			}
			
			
			for(int i = 0; i<n;i++) {
				int c = appts[i];
				for(int j = 0; j<unlucky.length;j++) {
					if(appts[i] > unlucky[i]) {
						c--;
					}
				}
				System.out.println(c);
			}
		}

	

}
