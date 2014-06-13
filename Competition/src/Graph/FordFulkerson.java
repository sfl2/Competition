package Graph;

import java.util.Arrays;
import java.util.List;


public class FordFulkerson {
	int MaxV;
	List<List<Edge>> G;
	boolean[] used;
	
	void add_edge(int from, int to, int cap){
		G.get(from).add(new Edge(to, cap,G.size()));
		G.get(to).add(new Edge(from, 0, G.size()-1));
	}
	
	int dfs(int v, int t, int f){
		if (v == t){
			return f;
		}
		
		used[v] = true;
		List<Edge> link = G.get(v);
		for (int i = 0; i < G.get(v).size(); i++){
			Edge e = link.get(i);
			if(!used[e.to] && e.cap >0){
				int d = dfs(e.to,t,Math.min(f,e.cap));
				if (d > 0){
					e.cap -= d;
					link.get(e.rev).cap+=d;
					return d;
				}
			}
		}
		
		return 0;
	}
	// s‚©‚çt‚Ö‚ÌÅ‘å—¬‚ğ‹‚ß‚é
	int maxFlow(int s, int t){
		int flow = 0;
		used = new boolean[G.size()];
		for(;;){
			Arrays.fill(used, false);
			int f = dfs(s,t,Integer.MAX_VALUE);
			if ( f == 0)return flow;
			flow+=f;
		}
	}
	
}
