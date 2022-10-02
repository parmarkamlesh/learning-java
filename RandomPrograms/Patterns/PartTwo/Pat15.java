// ## Printing the pattern ##
// 5 4 3 2 1 
// 5 4 3 2 
// 5 4 3 
// 5 4 
// 5 
public class Pat15 {
    public static void main(String[] args) {
        int gCount=5;
        for(int i=0;i<5;i++){
            gCount=5;
            for(int j=5;j>i;j--){
                System.out.print(gCount+" ");
                gCount--;
            }
            System.out.println();
        }
    }
}
