import java.util.ArrayList;
import java.util.HashMap;

public class Arraylist1
{
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("c++");
        list.add("ruby");
        System.out.println("ArrayList 1: "+ list);
        list.remove(0);
        System.out.println(list);
      list.remove(1);
        System.out.println(list);
       list.remove(0);
        System.out.println(list);
         list.remove(0);
        System.out.println(list);

        ArrayList<String> list1= new ArrayList<>();
        list1.add(String.valueOf(101));
        list1.add(String.valueOf(102));
        list1.add(String.valueOf(103));
        list1.add(String.valueOf(104));
        System.out.println("ArrayList 1: "
                + list1);
        list1.remove(0);
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);


        HashMap<Integer,String>map=new HashMap<>();
        map.put(101,"Java");
        map.put(102,"Python");
        map.put(103,"C++");
        map.put(104,"Ruby");
        System.out.println(map);


    }
}
