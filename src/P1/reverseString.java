package P1;

public class reverseString {

    String reverse(String a)   //NOTE: we cant use void because it does Not return value->
    // also we cant use void when we need to print in Main function
    {
        String temp="";
        for(int i=a.length()-1;i>=0;i--)
        {
            temp=temp+a.charAt(i);
        }
        return temp;
    }

    public static void main(String[] args) {
        reverseString r1=new reverseString();
        String str="This is reverse string";
        String st=r1.reverse(str);
        System.out.println(st);
        //  System.out.println(r1.reverse(str));


    }

}
