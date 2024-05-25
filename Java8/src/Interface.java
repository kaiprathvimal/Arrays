
interface Phone {
    void call();
    default void message() {
        System.out.println("message");
    }
}
interface laptop {
    static void lap(){
        System.out.println("lap");
    }
}
class AndroidPhone implements Phone {
    public void call() {
        System.out.println("Hi");
    }
}
public class Interface{
    public static void main(String[] args) {
        Phone p = new AndroidPhone();
        p.call();
        p.message();
        laptop.lap();
    }
}

