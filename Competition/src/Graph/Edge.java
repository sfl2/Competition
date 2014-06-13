package Graph;


public class Edge {
	int to;
	int cost;
	int rev;
	int cap;
	
	public Edge(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}
	
	public Edge(int to, int cap,int rev) {
		this.to = to;
		this.cap = cap;
		this.rev = rev;
	}
}
