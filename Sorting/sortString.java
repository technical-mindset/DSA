package DSA.Algorithms;


public class Main {
    public static void main(String[] args) {
     
     String[] s1 = {"Asad","Ali","Madiha","Zainab","Danish","Sagheer","Raza"};
     
        for (String s : s1){
        
            System.out.println(s);
     
        }
    
    }
    
    
    public static void sort(String[] strings){
     for (String str : strings){

         for (int j = 0; j < strings.length-1; j++) {

             if (strings[j].compareTo(strings[j+1]) >= (+1)) {

                 String temp = strings[j];
                 strings[j] = strings[j+1];
                 strings[j+1] = temp;
                 }
             }


          }

       }
  
  
  }
