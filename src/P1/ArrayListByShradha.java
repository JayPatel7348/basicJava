package P1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListByShradha {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<Integer>();

        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);

        //Print all element
        System.out.println(list);

        //Sorting
        Collections.sort(list);
        System.out.println(list);

        //get element
        System.out.println(list.get(1));
        System.out.println(list);

        //add element at specific index
        list.add(1,6);
        System.out.println(list);

        //Set modify element
        list.set(1,7);
        System.out.println(list);

        //delete
        list.remove(1);
        System.out.println(list);

        //Size of list
        System.out.println(list.size());

        //Loop to print each element
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }


    }
}
