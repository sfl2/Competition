package others;
import java.util.Arrays;


public class LCM {
	private int lcmlen(String a1, String a2) {
		int n = a1.length();
		int m = a2.length();
		int[][] mem = new int[n+1][m+1];

		for (int i = 1; i < n+1; i++) {
			for (int j = 1; j < m+1; j++) {
				if(a1.charAt(i) == a2.charAt(j)) {
					mem[i][j] = mem[i-1][j-1] + 1;
				} else {
						mem[i][j] = Math.max(mem[i][j-1] , mem[i-1][j]);

				}
			}
		}

		return mem[n][m];
	}


	private String lcmString(String a1, String a2) {
		int n = a1.length();
		int m = a2.length();
		String[][] mem = new String[n+1][m+1];
		for(int i = 0; i < n; i++) Arrays.fill(mem[i], "");
		for (int i = 1; i < n+1; i++) {
			for (int j = 1; j < m+1; j++) {
				if(a1.charAt(i-1) == a2.charAt(j-1)) {
					mem[i][j] = mem[i-1][j-1] + a1.charAt(i-1);
				} else {
						mem[i][j] = mem[i][j-1].length() > mem[i-1][j].length() ? mem[i][j-1] : mem[i-1][j];

				}
			}
		}

		return mem[n][m];
	}
}
