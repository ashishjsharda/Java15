final class Vehicle extends SealedTestClass {
    public String model(){

        return "Tesla";
    }


}
sealed abstract class SealedTestClass permits Toyota, Vehicle {

    public String getRegistrationNumber(){
        return "HPTR789ERTY";
    }
}

final class Toyota extends SealedTestClass{

    public String getMake(){
        return "Toyota";
    }

}

/**
 * Example using Sealed Class
 * @author ashish
 */
public class SealedClass {

    public static void main(String[] args) {
        SealedTestClass testClass=new Vehicle();
        System.out.println(testClass.getRegistrationNumber());
    }
}
