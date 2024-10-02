//Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise.
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Create an adjacency list
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // Fill the adjacency list
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]); // Since it's an undirected graph
        }

        // BFS to find the path
        return bfs(graph, source, destination);
    }

    private boolean bfs(ArrayList<Integer>[] graph, int source, int destination) {
        if (source == destination) {
            return true; // Early return if source is destination
        }

        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            // Explore neighbors
            for (int neighbor : graph[current]) {
                if (!visited[neighbor]) {
                    if (neighbor == destination) {
                        return true; // Found the path
                    }
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        
        return false; // No path found
    }
}
//2nd Approach
class Solution {
    // public static void main(String[] args) throws NumberFormatException, IOException {
    //     /* Write Your Code Here
	// 	 * Complete the Rest of the Program
	// 	 * You have to take input and print the output yourself
	// 	 */
    //   Scanner s= new Scanner(System.in);
	// 	 int n=s.nextInt();
	// 	 int e=s.nextInt();
	// 	 int edges[][]=new int [n][n];
	// 	 for(int i=0;i<e;i++){
	// 		 int fv=s.nextInt();
	// 		 int sv=s.nextInt();
	// 		 edges[fv][sv]=1;
	// 		 edges[sv][fv]=1;
	// 	 }
	// 	 int v1=s.nextInt();
	// 	 int v2=s.nextInt();
	// 	 boolean ans=validPath(n,edges,v1,v2);
	// 	 System.out.print(ans);
	// }
//     public  boolean validPath(int n, int[][] edges, int source, int destination) {
//         boolean visited[]=new boolean[edges.length];
//         return validPath(edges,source,destination,visited);
//     }
//     public  boolean validPath(int[][]edges,int source,int destination,boolean[]visited){
//         if(edges.length==0 || edges.length==1 ||edges.length==2){
//             return true;
//         }
//         if(source> edges.length-1 || destination> edges.length-1){
//             return false;
//         }
//         // if(edges[source][destination]==1){
//         //     return true;
//         // }
//         if(source==destination){
//             return true;
//         }
//         Queue<Integer>pq=new LinkedList<>();
//         pq.add(source);
//         visited[source]=true;
//         while(!pq.isEmpty()){
//             int firstelem=pq.remove();
//             if(firstelem==destination){
//                 return true;
//             }
//             for(int i=0;i<edges.length;i++){
//                 // if(edges[firstelem][i]==1 && !visited[i]){
//                 if(!visited[i]){
//                 // if(i==destination){
//                 //     return true;
//                 // }else{
//                     pq.add(i);
//                     visited[i]=true;
//                 }
//                 //}
//             }
//         }
//         // if(visited[destination]==true){
//         //     return true;
//         // }else
//         return false;
//     }
// }
 
