package src.com.progrank.parallelStrams;

import java.util.Arrays;
import java.util.List;

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }
}

public class ParallelStreams {
    public static void main(String[] args) {
        List<Student> lst = Arrays.asList(new Student("Ass", 83),
                new Student("kew", 87),
                new Student("Aewrss", 78),
                new Student("cds", 22),
                new Student("ded", 89),
                new Student("eerf", 90));

        lst.parallelStream().filter(s -> s.getScore() > 80).limit(3)
                .forEach(n -> System.out.println(n.getName() + " " + n.getScore()));
    }
}
