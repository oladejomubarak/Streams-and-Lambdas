package StreamEmployeeManipulation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ProcessingEmployee {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("Audu", "Lola", 4390.98, "Agric"),
                new Employee("Audu", "Lola", 2390.98, "Agric"),
                new Employee("Aud", "Lol", 4394, "Bus"),
                new Employee("Loyd", "Ola", 3490.98, "Engineering"),
                new Employee("Blaze", "Grace", 5290.98, "Nutrition"),
                new Employee("Udu", "Bola", 5690.97, "Agric"),
                new Employee("Land", "Gideon", 3897, "Accounting"),
                new Employee("Messi", "Lionel", 936790.98, "Football"),
                new Employee("Ahmad", "Blessing", 4543.23, "HR"),
        };

        List<Employee> employeeList = Arrays.asList(employees);
        System.out.println("Complete employee list: ");

        employeeList.stream().forEach(System.out::println);

        Predicate<Employee> range4kto6k = e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

        System.out.println("Employee earning salary in the range 4,000 and 6,000 sorted: ");

        employeeList.stream()
                .filter(range4kto6k)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        System.out.printf("Getting first employee that earns between 4k to 6k: %n%s%n",
                employeeList.stream()
                        .filter(range4kto6k)
                        .findFirst().get());

        Comparator<Employee> lastNameThenFirst = Comparator.comparing(Employee::getLastName)
                .thenComparing(Employee::getFirstName);

        System.out.printf("Printing employees sorted by last name then first if last name is same: %n");
                employeeList.stream().sorted(lastNameThenFirst).forEach(System.out::println);

        System.out.printf("Printing employees sorted by last name then first name in descending order: %n ");

        employeeList.stream().sorted(lastNameThenFirst.reversed()).forEach(System.out::println);

        System.out.printf("Printing Unique employee by their last names: %n");

        employeeList.stream().map(Employee::getLastName).distinct().forEach(System.out::println);
    }
}
