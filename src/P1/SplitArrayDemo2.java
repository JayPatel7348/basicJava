package P1;

public class SplitArrayDemo2 {

    public static void main(String[] args) {

        String str="I am learning selenium and appium and selenium with java";
        int count = 0;
        String[] strsp=str.split(" ");
        for(int i=0;i<strsp.length;i++)
        {
            if(strsp[i].equals("selenium")) {
                System.out.println(strsp[i]);
                count++;
                System.out.println(count+" times founds");
            }
        }

    }
}
