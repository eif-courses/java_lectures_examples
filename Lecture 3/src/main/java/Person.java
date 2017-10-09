import java.util.Comparator;

public class Person implements Comparator<Person>{
    private String name;
    private int age;

    void surastiPagalVarda(String name) throws CourseException {
        if(name.startsWith("M")){
            throw new CourseException("NEGERAS VARDAS");
    }
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
