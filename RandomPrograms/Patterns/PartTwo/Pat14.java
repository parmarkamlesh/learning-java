// ## Printing the pattern ##
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1
public class Pat14 {
    public static void main(String[] args) {
        int gCount=1;
        for(int i=0;i<5;i++){
            gCount=1;
            for(int j=5;j>i;j--){
                System.out.print(gCount+" ");
                gCount++;
            }
            System.out.println();
        }
    }
}
