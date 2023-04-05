import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class ArrayListProg {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashMap <Integer,String>map = new HashMap<>();
        map.put(111,"ram");
        map.put(112, "divya");
        map.put(113, "priya");
        System.out.println(map);

        for (Map.Entry m: map.entrySet())
 {
 System.out.println(m);
 System.out.println(m.getKey());
 System.out.println(m.getValue());
        }

    }
}

