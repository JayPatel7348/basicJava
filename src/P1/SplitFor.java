package P1;
import java.lang.reflect.Array;
public class SplitFor {


        // find character at different position ex. find char at 3 & length
        public static void main(String[] args) {
            String str="We are learning the java Language";

            String[] spStr=str.split(" ");
            for(int i=0;i<spStr.length;i++)
            {
                System.out.println(spStr[i]);
            }

        }


}
