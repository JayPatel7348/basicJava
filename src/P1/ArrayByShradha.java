package P1;

import java.util.Scanner;

public class ArrayByShradha {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Define size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];

        System.out.println("Enter the "+size+" values for array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Value whose index to be found");
        int expected=sc.nextInt();
        for(int j=0;j<arr.length;j++)
        {
            if(expected==arr[j])
                System.out.println("index of expected enter value is "+j);
        }
    }
}
