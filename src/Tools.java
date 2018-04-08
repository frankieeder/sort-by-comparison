import java.util.Scanner;

public class Tools {
    public static <T> boolean compare(T o1, T o2) {
        Scanner sc = new Scanner(System.in);
        System.out.println(o1 + " < " + o2 + "? (y/n)");
        String result = sc.nextLine();
        switch (result) {
            case "y": case "Y":
                return true;
            case "n": case "N":
                return false;
            default:
                throw new IllegalArgumentException();
        }
    }
}
