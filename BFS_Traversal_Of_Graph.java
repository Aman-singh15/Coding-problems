//Given an undirected and disconnected graph G(V, E), print its BFS traversal.

// Note:
// 1. Here you need to consider that you need to print BFS path starting from vertex 0 only. 
// 2. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
// 3. E is the number of edges present in graph G.
// 4. Take graph input in the adjacency matrix.
// 5. Handle for Disconnected Graphs as well
// Sample Input 1:
// 4 4
// 0 1
// 0 3
// 1 2
// 2 3
// Sample Output 1:
// 0 1 3 2
import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 Scanner s= new Scanner(System.in);
		 int n=s.nextInt();
		 int e=s.nextInt();
		 int edges[][]=new int [n][n];
		 for(int i=0;i<e;i++){
			 int fv=s.nextInt();
			 int sv=s.nextInt();
			 edges[fv][sv]=1;
			 edges[sv][fv]=1;
		 }
		 print(edges);
	}
	public static void print(int [][]edges){
		boolean visited[]=new boolean[edges.length];
		for(int i=0;i<edges.length;i++){
			if(!visited[i]){
				printHelper(edges,i,visited);
			}
		}
	}
	public static void printHelper(int [][]edges,int sv,boolean visited[]){
		Queue<Integer>pq=new LinkedList<>();
	//	int front=sv;
		pq.add(sv);
		visited[sv]=true;
		while(!pq.isEmpty()){
			int firstelem=pq.remove();
			System.out.print(firstelem+" ");
			for(int i=0;i<edges.length;i++){
				if(edges[firstelem][i]==1 && !visited[i]){
					pq.add(i);
					visited[i]=true; 
				}
			}
		}
	}
}
