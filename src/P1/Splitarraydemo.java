package P1;

public class Splitarraydemo {

    public static void main(String[] args) {

        String str="I am learning selenium and appium";

        String[] strsp=str.split(" ");
        for(int i=0;i<strsp.length;i++)
        {
            System.out.println(strsp[i]);
        }

    }
}
