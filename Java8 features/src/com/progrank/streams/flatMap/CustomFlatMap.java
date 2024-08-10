package src.com.progrank.streams.flatMap;

import java.util.Arrays;
import java.util.List;

class NewStudent {
    int id;
    String name;
    char grades;

    public NewStudent(int id, String name, char grade) {
        this.id = id;
        this.name = name;
        this.grades = grade;
    }
}

public class CustomFlatMap {
    public static void main(String[] args) {

        List<NewStudent> lst1 = Arrays.asList(
                new NewStudent(25, "Smith", 'A'),
                new NewStudent(30, "Hari", 'B'));

        List<NewStudent> lst2 = Arrays.asList(
                new NewStudent(25, "Mill", 'B'),
                new NewStudent(30, "Siri", 'A'));

        List<List<NewStudent>> stdlst = Arrays.asList(lst1, lst2);

        stdlst.stream().flatMap(lst -> lst.stream().filter(studnt -> studnt.grades == 'A').map(student -> student.name))
                .forEach(student -> System.out.println(student));
    }

}
