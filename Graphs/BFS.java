package DSA.Algorithms.Graps;

public class BFS {
 
 public static void main(String[] args){
 
   int[][] data = {
                {0,1,1,1,0,0,0},
                {1,0,1,0,0,0,0},
                {1,1,0,1,1,0,0},
                {1,0,1,0,1,0,0},
                {0,0,1,1,0,1,1},
                {0,0,0,0,1,0,0},
                {0,0,0,0,1,0,0},
        };

            BFS.bFS(data);
 
 
 }
 
 
 private static void bFS(int [][] data, int firstNode){
 
   
          int[] visited = {0,0,0,0,0,0,0};
          Queue queue = new PriorityQueue();
          queue.add(0);
      
          visited[0] = 1;
//        queue.add(5);
        while(!queue.isEmpty()){
      
            int node = (int) queue.remove();
            System.out.println(node);
      
            for (int i = 0; i < 7; i++) {
      
                if (data[node][i] == 1 && visited[i] == 0) {
         
                    queue.push(i);
                    visited[i] = 1;
         
                }
         
            }
       
        }
 }
 
}

