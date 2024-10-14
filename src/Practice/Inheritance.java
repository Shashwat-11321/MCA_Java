package Practice;
class A{
    int a=10;
    int b=20;
}
class B extends A{
    int c=30;
    int d=40;
}
public class Inheritance {
    public static void main(String[] args) {
        B obj = new  B();
        System.out.println(obj.a + obj.b);
        System.out.println(obj.c/obj.a);
    }
}
