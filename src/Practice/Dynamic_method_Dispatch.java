package Practice;
class One{
    public  void great(){
        System.out.println("print hello");
    }
    public void name() {
        System.out.println("I am in class one");
    }
}
class Two extends One{
    public void bye(){
        System.out.println("Good bye");
    }
    public void name(){
        System.out.println("I am in class two");
    }
}
public class Dynamic_method_Dispatch {
    public static void main(String[] args) {
        One obj =new One();
        obj.name();

    }
}
