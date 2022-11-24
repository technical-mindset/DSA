public class Conversion { 
    
    public int[][] ToArray(List<List<Integer>> arr){
       int row = -1;
       int col = -1;
       int i ,j;
       i = j = -1;
       for (List li: arr) {
           col = -1;
           row++;
           for (Object list: li) {
               col++;
           }
       }
//        System.out.println(row+" "+col+" ");
       int array [][] = new int[row+1][col+1];
       for (List li: arr) {
           i++;
           j = -1;
           for (Object list: li) {
               j++;
               array[i][j] =  (int)(list);
           }
       }
       return array;
   } 
}
