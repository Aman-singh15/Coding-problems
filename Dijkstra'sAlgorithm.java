// Given an undirected, connected and weighted graph G(V, E) with V number of vertices (which are numbered from 0 to V-1) and E number of edges.
// Find and print the shortest distance from the source vertex (i.e. Vertex 0) to all other vertices (including source vertex also) using Dijkstra's Algorithm.
     import java.util.Scanner;

public class Solution {
  
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		int edges[][]=new int[V][V];
		for(int i=0;i<E;i++){
			int fv=s.nextInt();
			int sv=s.nextInt();
			int distance=s.nextInt();
			edges[fv][sv]=distance;
			edges[sv][fv]=distance;
		}
		boolean visited[]=new boolean[V];
		int []distance=new int[V];
		distance[0]=0;
		for(int i=1;i<V;i++){
			distance[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<V;i++){
				
			int mindistancevertex=mindistance(distance,visited);
			visited[mindistancevertex]=true;
			for(int k=0;k<V;k++){
				if(edges[mindistancevertex][k]!=0 && !visited[k]){
					int pathcost=distance[mindistancevertex]+edges[mindistancevertex][k];
					if(distance[k]>pathcost){
						distance[k]=pathcost;
					}
				}
			}
		}
		for(int i=0;i<edges.length;i++){
                System.out.println(i+" "+distance[i]); 
		}      
	}
	    public static int mindistance(int[]distance,boolean[]visited){
			    int minVertex=-1;
				for(int i=0;i<distance.length;i++){
					if(!visited[i] &&(minVertex==-1 ||distance[i]<distance[minVertex])){
						minVertex=i;
					}
				}
				return minVertex;
		}
}
