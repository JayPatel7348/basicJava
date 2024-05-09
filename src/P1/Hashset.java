package P1;
import java.util.HashSet;


public class Hashset {

    public static void main(String[] args) {

        HashSet<Integer> set=new HashSet<>();

        //Insert
        set.add(7);
        set.add(8);
        set.add(11);
        set.add(7);  //this value will Not get added due to duplicate

        //Print all elements
        System.out.println(set);

        //Set Size
        System.out.println("Size of the Set is "+set.size());

        //Search
        if(set.contains(7))
        System.out.println("does contain");
        if(!set.contains(5))
        System.out.println("does Not contain");

        //Delete
        set.remove(7);
        if(!set.contains(7))
        System.out.println("Does Not contain");
        System.out.println("Size of the Set after delete is "+set.size());




    }
}
