// ## Printing the pattern ##
//      E 
//     D E 
//    C D E 
//   B C D E 
//  A B C D E
public class Pat10 {
    public static void main(String[] args) {
        int n=5;
        int c=65;
        for(int i=n;i>=1;i--){
            for(int b=1;b<=i;b++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print((char)(c+j-1)+" ");
            }
            System.out.println();
        }
    }
}
