package InterviewQs;

import java.util.*;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));
        //QS: Find list of students whose first name starts with alphabet
        List<String>name = list.stream().map(Student::getFirstName).filter(x ->x.startsWith("A")).toList();
        System.out.println(name);

        //QS:Group The Student By Department Names
        Map<String,List<Student>> pri = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
        System.out.println(pri);
        //Find the total count of student using stream
        Long count = list.stream().count();
        System.out.println(count);
        //Find the max age of student
        OptionalInt ageMax = list.stream().mapToInt(Student::getAge).reduce(Integer::max);
        System.out.println(ageMax);
        //Find all departments names
        list.stream().map(Student::getDepartmantName).distinct().forEach(System.out::println);
        //Find the count of student in each department
        Map<String,Long>numberSU=list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.counting()));
        System.out.println(numberSU);
        //Find the list of students whose age is less than 30
        list.stream().filter(age -> age.getAge()<30).forEach(System.out::println);
        //Find the list of students whose rank is in between 50 and 100
        list.stream().filter(x -> x.getRank()>50 && x.getRank() <100).forEach(System.out::println);
        //Find the average age of male and female students
        Map<String,Double> averageGenderAge = list.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
        System.out.println(averageGenderAge);
        //Find the department who is having maximum number of students
        Map.Entry<String, Long> entry=list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(entry);
        //Find the Students who stays in Delhi and sort them by their names
       List<Student>listStu =  list.stream().filter(x -> x.getCity().startsWith("Delhi")).sorted(Comparator.comparing(Student::getFirstName)).toList();
        System.out.println(listStu);
        //Find the average rank in all departments
        Map<String,Double> studAvera=list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.averagingInt(Student::getRank)));
        System.out.println("Find the average rank in all departments" + studAvera);
        Map<String, Optional<Student>> studentData = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,
                Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println("Highest rank in each department  : "+studentData);
        List<Student> stuRankSorted = list.stream().sorted(Comparator.comparing(Student::getRank))
                .collect(Collectors.toList());
        System.out.println("List of students sorted by their rank  : "+stuRankSorted);
        Student student = list.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
        System.out.println("Second highest rank student  : "+student);
    }

}
