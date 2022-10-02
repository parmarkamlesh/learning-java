// ## Printing the pattern ##
//      A 
//     A B 
//    A B C 
//   A B C D 
//  A B C D E
public class Pat9 {
    public static void main(String[] args) {

        int alphabet = 65;
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char) (alphabet + k - 1) + " ");
            }
            System.out.println();
        }

    }
}
