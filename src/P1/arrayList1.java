package P1;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList1 {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();

        list.add("Jay");
        list.add("Mukesh");
        list.add("Patel");

        for (String s:list)
        {
            System.out.println(s);
        }

        for (int i=0;i<=2;i++)
        {
            System.out.println(list.get(i));
        }

        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
