import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("c++");
        list.add("ruby");
        System.out.println(list);
        list.remove(0);
        list.remove(1);
        list.remove(0);
        list.remove(0);
        System.out.println(list);
        String arr[]=new String[]{"java", "Python", "C++", "Ruby"};
        for(int i=0;i< arr.length-1;i++)
        {
          System.out.println("the array elements are " + i  +arr[i]);
        }

        }
}
