import java.util.Scanner;

/**
 * Example using switch in Java 15
 * @author ashish
 */
public class SwitchEx {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner scanner=new Scanner(System.in);
        char c=scanner.next().charAt(0);
        switch (c){
            case  'a'-> System.out.println("In a");
            case 'b'-> System.out.println("In b");
            default -> System.out.println("In default");
        }
    }
}
