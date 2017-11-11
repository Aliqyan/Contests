package com.bayviewglen.programmingclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HightideLowtide {

	public static void main(String[] args) throws IOException {
		
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String[] tokens = in.readLine().split(" ");
	int n = Integer.parseInt(tokens[0]);
	int[] nums = new int[n];
	String[] bat = in.readLine().split(" ");
	for(int i = 0; i< n ;i++) {
		nums[i] = Integer.parseInt(bat[i]);
	}
	Arrays.sort(nums);

	int mid = n/2;
	for(int i = 0; i< n/2 ;i++) {
		System.out.print(nums[mid-i-1] + " " + nums[i+mid] + " ");
	}
	}
}
