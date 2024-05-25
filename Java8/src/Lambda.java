public class Lambda {
    public static void main(String[] args) {
        I obj;
//        obj = new I() {
//            @Override
//            public void show(int i) {
//                System.out.println("Good" + ":" + i);
//            }
//        };
        obj = i ->  System.out.println("hello lambda " + i);
        obj.show(6);
    }
}

interface  I {
    void show(int i);
}

//class Lam implements I {
//    public void show(int i) {
//        System.out.println("hello " + i);
//    }
//}