public class Main {
    public static void main(String[] args) {
    
         StringBuffer s1 = new StringBuffer("Hey! I hope you're doing well, Thankyou") ;
         StringBuffer s2 = new StringBuffer();

        for (int i = s1.length()-1; i >= 0 ; i--) {
            s2.append(s1.charAt(i));
        }
        System.out.println(s2);
    }
}
