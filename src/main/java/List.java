

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<String> list= new ArrayList<>();
        list.add("Pizza");
        list.add("Panner");
        list.add("Burger");
        list.add("sandveg");
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.size());
        list.sort(null);
        System.out.println(list);
        list.set(2,"Musroom");
        System.out.println(list);
        for(int i=0;i<list.size()-1;i++)
        {
            System.out.println(list.get(i));
        }
    }



}
