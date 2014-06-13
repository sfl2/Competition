package others;

import java.util.ArrayList;
import java.util.Arrays;

public class Prime {
	private int[] makeprimes(int N){
		boolean[] isprime = new boolean[N+1];
		Arrays.fill(isprime, true);
		ArrayList<Integer> list = new ArrayList<Integer>();

		int p = 2;
		while (p <= N){
			list.add(p);
			for (int i = p; i <= N; i+=p){
				isprime[i] = false;
			}
			while (p <= N && !isprime[p])p++;
		}


		int[] res = new int[list.size()];
		for (int i = 0; i < list.size(); i++){
			res[i] = list.get(i);
		}
		return res;
	}
}
