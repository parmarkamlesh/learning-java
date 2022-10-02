// ## Printing the pattern ##
//     *
//    ***
//   *****
//  *******
// *********
public class Pat11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int b=n;b>i;b--){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
