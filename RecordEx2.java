/**
 * Example using Records
 * @author ashish
 */
public class RecordEx2 {
    public record Certificate(String name,int year)
    {
        public String certificateAsLowerCase(){
            return name.toLowerCase();
        }

    }
    public static void main(String[] args) {

        Certificate certificate=new Certificate("Sai",71);
        System.out.println(certificate.name());
        System.out.println(certificate.certificateAsLowerCase());


    }
}
