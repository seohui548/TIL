package com.BaekJoon.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1330_두수 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		tokens = new StringTokenizer(input.readLine());
		
		int A = Integer.parseInt(tokens.nextToken());
		int B = Integer.parseInt(tokens.nextToken());
		
		if(A > B) {
			System.out.println(">");
		}
		else if(A < B) {
			System.out.println("<");
		}
		else if(A == B) {
			System.out.println("==");
		}

	}

}
