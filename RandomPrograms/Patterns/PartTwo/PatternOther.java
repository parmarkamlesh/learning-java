// Input: 4
// Output:
//    A
//   ABA
//  ABCBA
// ABCDCBA
public class PatternOther {
    public static void main(String[] args) {
        int n = 5;
        int c = 65;
        // for(int i=1;i<n;i++){
        // for(int b=0;b<n-i;b++){
        // System.out.print(" ");
        // }
        // c=65;
        // for(int j=1;j<=i;j++){
        // System.out.print((char)(c));
        // c++;
        // }
        // c=c-2;
        // for(int k=i-1;k>0;k--){
        // System.out.print((char)(c));
        // c--;
        // }
        // System.out.println();
        // }
        // ===========
        // for(int i=0;i<5;i++){
        // c=65;
        // for(int j=0;j<=i;j++){
        // System.out.print((char)(c+5-1));
        // c--;
        // }
        // System.out.println();
        // }
        int cnt = 5;
        // for(int i=1;i<=5;i++){
        // for(int f=i;f<=5;f++){
        // System.out.print("*");
        // }
        // for(int s=1;s<=(i*2)-2;s++){
        // System.out.print(" ");
        // }
        // for(int f=i;f<=5;f++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for(int i=1;i<=5;i++){
        // for(int f=1;f<=i;f++){
        // System.out.print("*");
        // }
        // for(int s=i*2-2;s<(2*5)-2;s++){
        // System.out.print(" ");
        // }
        // for(int f=1;f<=i;f++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for(int i=1;i<5;i++){
        // for(int f=1;f<=i;f++){
        // System.out.print("*");
        // }
        // for(int s=i*2-2;s<(2*5)-2;s++){
        // System.out.print(" ");
        // }
        // for(int f=1;f<=i;f++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for(int i=1;i<=5;i++){
        // for(int f=i;f<=5;f++){
        // System.out.print("*");
        // }
        // for(int s=1;s<=(i*2)-2;s++){
        // System.out.print(" ");
        // }
        // for(int f=i;f<=5;f++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for(int i=1;i<=5;i++){
        // for(int f=1;f<=5;f++){
        // if( (i>1 && i<5) && (f!=1 && f!=5)){
        // System.out.print(" ");
        // }else
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        int countercopy = n;
        for (int i = 1; i <= (n * 2 - 1); i++) {
            for (int f = 1; f <= n * 2 - 1; f++) {
                System.out.print("*");
            }
            System.out.println();
            countercopy--;
        }
    }
}
