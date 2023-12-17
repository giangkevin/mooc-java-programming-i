
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.next());

        if (value<0){
            value = -1*value;
            System.out.println(+value);
        }else{
            System.out.println(+value);
        }

    }
}

/*import java.util.Scanner;
 
public class AbsoluteValue {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int value = Integer.valueOf(scanner.nextLine());
 
        if (value < 0) {
            value = value * -1;
        }
 
        System.out.println(value);
    }
}
  */