// ## Printing the pattern ##
//     A 
//    B B 
//   C C C 
//  D D D D 
// E E E E E
public class Pat13 {
    public static void main(String[] args) {
        int n=5;
        char c='A';
        for(int i=1;i<=n;i++){
            for(int b=n;b>i;b--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
            }
            c++;
            System.out.println();
        }
    }
}
