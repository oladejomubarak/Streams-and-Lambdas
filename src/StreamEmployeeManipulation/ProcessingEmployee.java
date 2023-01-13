package StreamEmployeeManipulation;

import java.util.Arrays;
import java.util.List;

public class ProcessingEmployee {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("Audu", "Lola", 2390.98, "Agric"),
                new Employee("Audu", "Lola", 2390.98, "Agric"),
                new Employee("Aud", "Lol", 2394, "Bus"),
                new Employee("Loyd", "Ola", 3490.98, "Engineering"),
                new Employee("Blaze", "Grace", 3290.98, "Nutrition"),
                new Employee("Udu", "Bola", 7690.97, "Agric"),
                new Employee("Land", "Gideon", 3897, "Accounting"),
                new Employee("Messi", "Lionel", 936790.98, "Football"),
                new Employee("Ahmad", "Blessing", 76543.23, "HR"),
        };

        List<Employee> employeeList = Arrays.asList(employees);
        System.out.println("Complete employee list: ");

        employeeList.stream().forEach(System.out::println
        );
    }
}
