import java.util.*;

public class ConvXtoYFlipBit {
    public static void main(String[] args) {
        
        int n, x, y;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        
        System.out.println(countBits(x, y));
    }

    public static int countBits(int x, int y) {
        int c = 0;
        
        while (x > 0 || y > 0) {

            int lastbOfX = x & 1;
            int lastbOfY = y & 1;

            if (lastbOfX != lastbOfY)
                c++;

            x = x >> 1;
            y = y >> 1;
        }

        return c;
    }
}