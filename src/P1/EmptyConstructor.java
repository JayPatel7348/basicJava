package P1;

public class EmptyConstructor {
    int a;
    double d;
    char c;
    String str;

    //This is the Empty Constructor
    public EmptyConstructor() {

    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        EmptyConstructor ob = new EmptyConstructor();
        ob.display();

    }
}
