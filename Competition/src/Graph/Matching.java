package Graph;


public class Matching {

	
	
	public void matching(){
		int N = -1;
		int K = -1;
		int s = N+K;
		int t = s+1;
		
		boolean[][] can = null;
		
		FordFulkerson ff = new FordFulkerson();
		
		for (int i = 0; i < N; i++) {
			ff.add_edge(s, i, 1);
		}
		
		for ( int i = 0; i < N; i++) {
			ff.add_edge(N+i, t, 1);
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				if(can[i][j]) {
					ff.add_edge(i, j, 1);
				}
			}
		}
	
		System.out.println(ff.maxFlow(s, t));
		
	}
	
	
}
