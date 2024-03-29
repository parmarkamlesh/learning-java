import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    /*
     * The important points about the Java ArrayList class are:
     * Java ArrayList class can contain duplicate elements.
     * Java ArrayList class maintains insertion order.
     * Java ArrayList class is non synchronized.
     * Java ArrayList allows random access because the array works on an index
     * basis.
     * In ArrayList, manipulation is a little bit slower than the LinkedList in Java
     * because a lot of shifting needs to occur if any element is removed from the
     * array list.
     * We can not create an array list of the primitive types, such as int, float,
     * char, etc. It is required to use the required wrapper class in such cases.
     * For example:
     */
    public static void main(String[] args) {
        // ArrayList<Integer> ar=new ArrayList<>();
        // ArrayList<Integer> ar=new ArrayList<>(5);
        ArrayList<Integer> ar=new ArrayList<>(5);
        ar.add(999);
        ar.add(0,1);
        if(ar.contains(1)){
            System.out.println("YO");
        }
        for (int x : ar) {
            System.out.println(x);
        }
    }
}
