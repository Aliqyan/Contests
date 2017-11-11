package com.tapia.dmojoctobercontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FujoNeko {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String xPos = "";
		String yPos = "";
		String[] tokens = in.readLine().split(" ");
		int x = Integer.parseInt(tokens[0]);
		int y = Integer.parseInt(tokens[1]);
		for (int i = 0; i < y; i++) {
			String[] data = in.readLine().split("");
			data.toString();
			for (int j = 0; j < x; j++) {
				if (data[j].equals("X")) {
					xPos += j + 1;
					yPos += i + 1;
				}
			}
		}
		int q = Integer.parseInt(in.readLine().split(" ")[0]);
		for (int i = 0; i < q; i++) {
			String[] temp = in.readLine().split(" ");
			String x1 = temp[0];
			String y1 = temp[1];
			if (xPos.indexOf(x1) != -1 || yPos.indexOf(y1) != -1) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		}
	}

}
