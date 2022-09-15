import java.util.*;

public class MinHire {
    static void findFrontend(int frontendArr[], int frontendArrSize, int n,int backendArr[], int backendArrSize, int m) {
        int[] copy_frontendArr = Arrays.copyOf(frontendArr, frontendArrSize);
        Set<Integer> st=new HashSet<>();
        Arrays.sort(copy_frontendArr);
        int minsum=0;
        for (int i = 0; i < frontendArrSize; ++i) {
            if (Arrays.binarySearch(copy_frontendArr, 0, n, frontendArr[i]) > -1){
                st.add(i);
                minsum+=frontendArr[i];
            }
        }
        int[] copy_backendArr = Arrays.copyOf(backendArr, backendArrSize);
        Arrays.sort(copy_backendArr);

        for (int i = 0; i < backendArrSize; ++i) {
            if (Arrays.binarySearch(copy_backendArr, 0, m, backendArr[i]) > -1){
                if(!st.contains(i))
                    minsum+=backendArr[i];

            }
        }
        System.out.println(minsum);
    }
    public static void main(String[] args) {
        int n = 1, m = 2;
        int f[] = { 3, 4, 7 };
        int b[] = { 1, 5, 6 };
        findFrontend(f, 3, n, b, 3, m);
    }

}
