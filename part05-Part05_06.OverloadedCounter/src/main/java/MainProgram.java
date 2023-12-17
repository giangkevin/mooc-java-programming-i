
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here

        Counter a = new Counter(15);

        a.increase();
        a.increase();
        System.out.println(a.value());
        a.decrease();
        System.out.println(a.value());

        a.increase(16);
        System.out.println(a.value());

        a.decrease(-35);
        System.out.println(a.value());



    }
}
