package P1;

public class recursion {

    static int factorial(int n){
        if(n==0)
        {
            return 1;  //because 0!==1
        }
        else{
        return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {

       // factorial(5);
        System.out.println(factorial(5));
    }
}
