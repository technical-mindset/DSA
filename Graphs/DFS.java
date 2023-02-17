package DSA.Algorithms.Graps;

public class DFS {
 
 public static void main(String[] args){
 
     int[][] data = 
     {
                {0,1,1,1,0,0,0},
                {1,0,1,0,0,0,0},
                {1,1,0,1,1,0,0},
                {1,0,1,0,1,0,0},
                {0,0,1,1,0,1,1},
                {0,0,0,0,1,0,0},
                {0,0,0,0,1,0,0},
     
        };

            
            
            DFS.dFS(data);
 
 
 }
 
 
 private static void dFS(int [][] data, int firstNode){
 
   
        int[] visited = {0,0,0,0,0,0,0};
        
        Stack stack = new Stack<>();
        stack.push(0);

        visited[0] = 1;

        while(!stack.isEmpty()){

            int node = (int) stack.pop();
            System.out.println(node);

            for (int i = 0; i < 7; i++) {
                if (data[node][i] == 1 && visited[i] == 0) {
                    stack.push(i);
                    visited[i] = 1;
                }
            }
        }
 }
 
}

