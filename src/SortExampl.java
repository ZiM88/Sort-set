import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }
}

public class SortExampl {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(new Person(6));
        set.add(new Person(5));
        set.add(new Person(3));
        set.add(new Person(1));
        set.add(new Person(2));
        set.add(new Person(4));
        set.add(new Person(7));
        for (Object o : set) {
            System.out.println(o);
        }
    }
}
