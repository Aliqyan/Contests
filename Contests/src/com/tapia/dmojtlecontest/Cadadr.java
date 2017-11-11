package com.tapia.dmojtlecontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cadadr {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		char[] text = new char[100000];
		int n = in.read(text) - 6;
		int act = n - 2;

		char[] soln = new char[act * 6 + 1];

		for (int i = 2; i < n; i++) {
			int j = i - 2;

			soln[j * 5] = '(';

			soln[j * 5 + 1] = 'c';
			if (text[i] == 'a') {
				soln[j * 5 + 2] = 'a';
			} else {
				soln[j * 5 + 2] = 'd';
			}
			soln[j * 5 + 3] = 'r';
			soln[j * 5 + 4] = ' ';

			if (i == n - 1) {
				soln[soln.length - act - 1] = 'x';
			}
			soln[soln.length - act + j] = ')';
		}
		for (int i = 0; i < soln.length; i++) {
			System.out.print(soln[i]);
		}

	}

	
}
