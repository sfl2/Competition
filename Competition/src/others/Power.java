package others;

public class Power {
	
	int MOD = 1000000007;
	private int pow(int n, int m) {
		
		if(n == 0) return (m == 0) ? 1:0;
		int b = 1;
		long res = 1;
		long p = n;
		while(b <= m) {
			if((b & m) !=0) res=(res*p)%MOD;
			b = b<<1;
			p= (p*p)%MOD;
		}
		return (int)res;
	}
	
	public static void main(String[] args) {
		Power p = new Power();
		for(int i = 1; i < 11; i++){
			for(int j = 0; j < 11; j++)		System.out.println(p.pow(i, j));

		}
	}

}


