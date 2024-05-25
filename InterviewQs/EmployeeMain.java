package InterviewQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("ABC",30,"Female","HR"));
        employees.add(new Employee("PQR",25,"Male","IT"));
        employees.add(new Employee("LMN",30,"Male","HR"));
        employees.add(new Employee("XYZ",28,"Female","IT"));
        //QS1: Print the distinct department using java 8
        employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        //QS2: Count of employees in each department
        Map<String,Long> empCount = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(empCount);
        //QS3: Average age of Male and female employee
        Map<String,Double> averageAge = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(averageAge);


        Map<String,Double> strAvg=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingInt(Employee::getAge)));
        System.out.println(strAvg);
    }
}
