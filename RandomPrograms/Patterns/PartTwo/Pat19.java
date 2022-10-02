// ## Printing the pattern ##
// 5 4 3 2 1 
// 5 4 3 2 
// 5 4 3 
// 5 4 
// 5 
public class Pat19 {
    public static void main(String[] args) {
        int gCount=65;
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print((char)(gCount+j-1)+" ");
            }
            System.out.println();
        }
    }
}
