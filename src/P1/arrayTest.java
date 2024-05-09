package P1;

public class arrayTest {

    public static void main(String[] args)  {

        String[] str=new String[5];

        str[0]="I";
        str[1]="AM";
        str[2]="Learning";
        str[3]="Java";

        for(String x:str)
        {
            System.out.println(x);
        }

        String[] str1={"Jay", "Jinesh", "Shivani", "Sejal", "Gully","Jay"};

        for(String s:str1)
        {
            if(s=="Jay")
                System.out.println(s);
        }
        System.out.println("next foreach loop started...");
        for(String s:str1)
        {
            if(s!="Jay")
                System.out.println(s);
        }

        System.out.println("next for loop started...");
        for(int i=0;i<=str1.length;i++) {
            try {
                if (str1[i] != "Jay")
                    System.out.println(str1[i]);
            } catch (ArrayIndexOutOfBoundsException e)
            {
                e.getMessage();
            }


        }

    }

}
