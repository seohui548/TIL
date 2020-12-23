package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//해당 문제는 시간초과가 많이 나서 여러 곳에서 둘러보고 찾은 해결방법.다시 확인필요.
public class Baekjoon_1003 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		int[][] dp = new int[41][2];
		int[][] result = new int[n][2]; //0개수, 1개수 담을 배열
		
		dp[0][0] = 1; //0일때 0은 1개
		dp[1][1] = 1; //1일때 1은 1개
		
		int input = 0;
		for (int i=0; i<n; i++) {
			input = Integer.parseInt(reader.readLine());
			
			if (input <= 1) {
				result[i][0] = dp[input][0];
				result[i][1] = dp[input][1];
			} else {
				for (int j=2; j<=input; j++) {
					dp[j][0] = dp[j-2][0] + dp[j-1][0]; //-2번째 0의 개수와 -1번째 0의 개수를 더함
					dp[j][1] = dp[j-2][1] + dp[j-1][1]; //-2번째 1의 개수와 -1번째 1의 개수를 더함
				}
				result[i][0] = dp[input][0];
				result[i][1] = dp[input][1];
			}
			
		}//for
		
		for (int i=0; i<n; i++) {
			System.out.println(result[i][0] + " " + result[i][1]);
		}
		
	}
}