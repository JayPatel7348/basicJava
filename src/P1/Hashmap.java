package P1;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();

        map.put(7,"Jay");
        map.put(8,"Jinesh Patel");
        map.put(11,"Mukesh");
        map.put(12,"Pravina");

        System.out.println(map.get(7));
        System.out.println(map.get("Jay"));

        //foreach loop
        for(Map.Entry<Integer,String> e:map.entrySet())
        {
            System.out.println(e.getKey()+","+e.getValue());
        }
    }
}
