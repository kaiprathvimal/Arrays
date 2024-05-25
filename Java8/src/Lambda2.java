public class Lambda2  {
    public static void main(String[] args) {
//       Calculat cal = () -> System.out.println("Switched on");
//       cal.witchOn();
//         Calculat add1 = (System.out::println);
//         Calculat add =  i -> System.out.println(i);
//         add.calculate(8);
//         add1.calculate(10);
        Calculat sub =(i,j) -> {
            System.out.println(i-j);
            return i - j;
        };
        sub.substract(10,8);
    }
}
interface Calculat {
//    void switchOn();
//    void calculate(int i);
    int substract(int i, int j);
}
