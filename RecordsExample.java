
/**
 * Example using Records
 */
public class RecordsExample {

    public record Employee(String name,int id,int salary){}
    public static void main(String[] args) {

        Employee employee=new Employee("Sai",100,50000);
        System.out.println(employee.name());
        System.out.println(employee.salary());
        System.out.println(employee.id());
    }
}
