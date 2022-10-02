// ## Printing the pattern ##
// A 
// A B 
// A B C 
// A B C D 
// A B C D E 
public class Pat2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(65+j)+" ");
            }
            System.out.println(" ");
        }
    }
}

