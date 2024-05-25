class Test {
    public void m1() {
        System.out.println("m1");
    }
    static void m2() {
        System.out.println("m2");
    }
}

public class MethodReferenceExample {
    public static void main(String[] args) {
        Test.m2();
        Test obj = new Test();
        obj.m1();

    }
}
