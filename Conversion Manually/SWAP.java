package DSA.Algorithms;

public class Main {
 
 public static void main(String[] args){
 
     
        int a = 5;
        int b = 7;
     
     swapTwoVariable(a,b);
     
        System.out.println(a+" "+b);
        

    }
 

 public static void swapTwoVariable(int x, int y){

        x = x + y;
        y = x - y;
        x = x - y;

    }
 
 
 
}

