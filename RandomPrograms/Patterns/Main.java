import java.util.*;
/*
*****
*****
*****
*****
*****
*
**
***
****
*****
1
12
123
1234
12345
1
22
333
4444
55555
*****
****
***
**
*
12345
1234
123
12
1
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
1
01
101
0101
10101
*****
****
***
**
*
1      1
12    21
123  321
12344321
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
        /*
         * 
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         * 
         * *
         * * *
         * * * *
         * * * * *
         * * * * *
         * * * *
         * * *
         * *
         * 
         */
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        /*
         * 
         * 1
         * 01
         * 101
         * 0101
         * 10101
         *****
         ****
         ***
         **
         *
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print((j % 2 == 0) ? '1' : '0');
                } else {
                    System.out.print((j % 2 == 0) ? '0' : '1');
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         * 1 1
         * 12 21
         * 123 321
         * 12344321
         */

        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + 1);
            }

            System.out.println();
        }
        //
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15

        int counter=1;
	    for(int i=0;i<5;i++){
	        for(int j=0;j<=i;j++){
	            System.out.print(counter+" ");
	            counter++;
	        }
	        System.out.println();
	    }
        // A 
        // A B 
        // A B C 
        // A B C D 
        // A B C D E         

        for(int i=0;i<5;i++){
	        char c='A';
	        for(int j=0;j<=i;j++){
	            System.out.print(c+" ");
	            c++;
	        }
	        System.out.println();
	    }        
        // A B C D E 
        // A B C D 
        // A B C 
        // A B 
        // A 
	    for(int i=0;i<5;i++){
	        char c='A';
	        for(int j=5;j>i;j--){
	            System.out.print(c+" ");
	            c++;
	        }
	        System.out.println();
	    }
        // A A A A A 
        // B B B B 
        // C C C 
        // D D 
        // E 
        char c='A';
	    for(int i=0;i<5;i++){

	        for(int j=5;j>i;j--){
	            System.out.print(c+" ");
	    
	        }
            c++;
	        System.out.println();
	    }
    //     A
    //     ABA
    //    ABCBA
    //   ABCDCBA    
    for (int i=0;i<4 ;i++ ){
        for(int j=4;j>i;j--){
            System.out.print(" ");
        }
        char c='A';
        for(int k=0;k<=i;k++){
            System.out.print(c);
            ++c;
        }
        c--;
        for(int l=0;l<i;l++){
            c--;
            System.out.print(c);
        }
        System.out.println();
    }     
    
    }

}