package com.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class BJ_2263_트리의_순회 {

	 static int [] inOrder;
	 static int [] postOrder;
	 static int [] index;
	 static StringBuffer output = new StringBuffer();
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		input = new BufferedReader(new StringReader(src));
		StringTokenizer tokens;
		
		int n = Integer.parseInt(input.readLine());
		inOrder = new int[n+1];
		postOrder = new int[n+1];
		index = new int[n+1];
		
		String[] check = input.readLine().split(" ");
		for(int i = 0; i< n; ++i) {
			inOrder[i] = Integer.parseInt(check[i]);
			index[inOrder[i]] = i;
			
		}
		check = input.readLine().split(" ");
		
		for(int i = 0; i < n; ++i) {
			postOrder[i] = Integer.parseInt(check[i]);
		
			
		}
		preOrder(0, n-1, 0, n-1);
		System.out.println(output);

	}
	static String src="3\r\n" + 
			"1 2 3\r\n" + 
			"1 3 2";
	static void preOrder(int inStart, int inEnd, int postStart, int postEnd) {
		
		if(inStart > inEnd || postStart > postEnd) return;
		int root = postOrder[postEnd];
		output.append(root).append(" ");
		int idx = index[root];
		preOrder(inStart, idx-1, postStart, postStart+(idx-1-inStart));
		preOrder(idx+1, inEnd, postStart+(idx-inStart), postEnd-1);
	}

}
