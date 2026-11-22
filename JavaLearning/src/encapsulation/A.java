package encapsulation;

public class A {

    static {
        System.out.println("static A1");
    }
    {
        System.out.println("instance A1");
    }
    A(){};
    A(int x){
        System.out.println("constructor A1");
    }
    static {
        System.out.println("static A2");
    }
    {
        System.out.println("instance A2");
    }

}

class B{
    static {
        System.out.println("Static B1");
    }
    {
        System.out.println("instance B1");
    }
//    static A a= new A(1);
    A aa = new A(2);
//    static A a2= new A(1);
//    {
//        System.out.println("instance B2");
//    }
}

class SIC{
    public static void main(String[] args){
        B b = new B();
//        A a = new A(5);
    }
}