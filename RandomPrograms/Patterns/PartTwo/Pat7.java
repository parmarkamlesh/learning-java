// ## Printing the pattern ##
//     1 
//    1 2 
//   1 2 3 
//  1 2 3 4 
// 1 2 3 4 5

public class Pat7 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for(int blank=0;blank<(5-i);blank++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }

}