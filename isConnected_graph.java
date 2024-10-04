//Given an undirected graph G(V,E), check if the graph G is connected graph or not.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int e=s.nextInt();
		 int edges[][]=new int[n][n];
		 for(int i=0;i<e;i++){
			 int fv=s.nextInt();
			 int sv=s.nextInt();
			 edges[fv][sv]=1;
			 edges[sv][fv]=1;
		 }
		 boolean[]visited=new boolean[n];
			 isConnected(edges,0,visited);
			 int i=0;
			for(;i<edges.length;i++){
				if(!visited[i]){
					System.out.print(false);
					break;
				}	
			}
			if(i==n)
			System.out.print(true);
	}
	public static void isConnected(int[][]edges,int sv,boolean visited[]){
		if(sv>edges.length-1){
			return;
		}
            visited[sv]=true;
			for(int i=0;i<edges.length;i++){
				if(edges[sv][i]==1 && !visited[i]){
					visited[i]=true;
					isConnected(edges, i, visited);
				}
			}     
  }
}
