import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static void d() throws ArrayIndexOutOfBoundsException {

        List<Person> sarasas = new ArrayList<>();
        sarasas.add(new Person("Petrras", 58));
        sarasas.add(new Person("Asta", 95));
        sarasas.add(new Person("Paulius", 44));
        sarasas.add(new Person("Rokas"));
        sarasas.add(new Person("Ona", 33));

        Comparator<Person> pagalAmziu = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        for (Person p : sarasas
                ) {
            try {
                p.surastiPagalVarda("Marius");
            } catch (CourseException e) {
               // e.printStackTrace();
                e.getMessage();
            }
        }
    }




    public static void main(String[] args) {
        d();
    }

}
