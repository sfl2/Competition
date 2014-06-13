package others;

public class Combination {
	int MOD;
	int max = 1000;
	int[][] comb  = new int[max+1][max+1];
	private void makeCombinations() {
		comb[1][0] = 1;
		comb[1][1] = 1;
		
		for(int n = 2; n <= max; n++ ) {
			comb[n][0] = 1;
			for (int m = 1; m <=max; m++ ) {
				comb[n][m] = (comb[n-1][m-1]+comb[n-1][m])%MOD;
			}
		}
	
	}
	private int combination(int n, int m) {
		
		return comb[n][m];
	}
	
}
