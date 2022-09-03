import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Map.Entry;
public class StringTokn {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        StringTokenizer st=new StringTokenizer("Water is wasted before 2 year ago, is that Water?");
        while(st.hasMoreTokens()){
            String onceinwhile=st.nextToken();
            hm.put(onceinwhile, hm.getOrDefault(onceinwhile,0)+1);
            System.out.println(onceinwhile);
        }
        //frequncy 
        System.out.println("//////////////////////////////////////////");
        for (Entry<String,Integer> s : hm.entrySet()) {
            System.out.println(s.getKey() + "=> "+ s.getValue());
        }

    }
}
