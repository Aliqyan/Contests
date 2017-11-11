package com.tapia.pastccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NailedIt {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	
		int n = Integer.parseInt(in.readLine());
		String[] line = in.readLine().split(" ");
		int[] wood = new int[n];
		for(int i = 0; i < n; i++) {
		    wood[i] = Integer.parseInt(line[i]);
		}
		Arrays.sort(wood);
		for(int i = 0; i < n; i++) {
			System.out.println(wood[i]);
		}
		*/
		int n = 1000;
		int length = 0;
		for(int i = 0; i < n; i++) {
			length += i;
		}
		System.out.println(length);
		
		
	}
	

}
