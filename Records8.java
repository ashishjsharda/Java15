/**
 * Example using Records
 * @author ashish
 */
public class Records8 {
    record Employee(String name, int age)    {   }
    public static void main(String[] args) {
        Employee employee=new Employee("John",52);
        System.out.println(employee.age());
        System.out.println(employee.name());
    }
}
