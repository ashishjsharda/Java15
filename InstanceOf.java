/**
 * Example using instanceOf
 * @author ashish
 */
public class InstanceOf {
    public static void main(String[] args) {

        String text= """
                This is an example \
                showing multiline text
                """;
        if(text instanceof String ){
            System.out.println(text.length());
        }

    }
}
