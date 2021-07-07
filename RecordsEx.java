/**
 * Using Records
 */
public class RecordsEx {

    //Using Record
    public record Employee(String name,int age){}
    public static void main(String[] args) {
        Employee employee=new Employee("Sai",18);
        System.out.println(employee);
        System.out.println(employee.age);
        System.out.println(employee.name);

    }
}
