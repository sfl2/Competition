package Graph;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


public class Dijkstra {

	
	
	int V;
	List<List<Edge>> G;
	int[] d;
	
	public Dijkstra(int V, List<List<Edge>> G) {
		this.V = V;
		this.G = G;
	}
	
	public int[] leastlength(int s){//s : 郢ｧ�ｹ郢ｧ�ｿ郢晢ｽｼ郢晏現�ｽ騾｡�ｪ陷ｿ�ｷ
		
		Comparator<P> comparator = new Comparator<P>() {
			@Override
			public int compare(P p1	, P p2) {
				if(p1.mindistance != p2.mindistance){
				return p1.mindistance - p2.mindistance;
				}
				else return p1.n - p2.n;
			}
		}; 
		
		PriorityQueue<P> que = new PriorityQueue<P>(1, comparator); 
		d = new int[V];
		Arrays.fill(d, Integer.MAX_VALUE);
		d[s] = 0;
		que.add(new P(0,s));
		while (!que.isEmpty()){
			P p = que.poll();
			int v = p.n;
			if (d[v] < p.mindistance) continue;
			for (int i = 0; i < G.get(v).size(); i++){
				Edge e = G.get(v).get(i);
				if (d[e.to] > d[v] + e.cost){
					d[e.to] = d[v] + e.cost;
					que.add(new P(d[e.to],e.to));
				}
			}
		}
		
		return d;
	}
	
}

class P{
	int mindistance;
	int n;//鬯�ｉ縺帷ｸｺ�ｮ騾｡�ｪ陷ｿ�ｷ
	public P(int d,int n){
		this.mindistance = d;
		this.n = n;
	}
	
}

