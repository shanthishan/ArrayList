
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<String> list= new ArrayList<>();
        list.add("chips");
        list.add("lays");
        list.add("kurkure");

        list.set(2, "Bingo");

        Collections.sort(list);

        list.remove(0);

        for(String items :list)
        {
            System.out.println(items);
        }

    }

}
