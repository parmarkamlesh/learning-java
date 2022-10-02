// ## Printing the pattern ##
//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * *

public class Pat6 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int blank = 0; blank < (5 - i); blank++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
