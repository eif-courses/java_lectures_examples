import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Zmogus {
    String vardas() default "Paulius";

    int[] svoris() default {10, 30, 40, 50};
}


@Zmogus
class Gyvunas {
    @Zmogus
    public static void statinis() {
        List<String> list = new ArrayList<>();
        list.add("Namas");
        list.add("Siena");
        list.add("Bankas");
        list.add("Policija");
        System.out.println("Rezultatas: ");
    }
}

public class Main {
    /**
     * @param args skirtas argumentui is konsoles
     */

    public static void main(String[] args) {


        Gyvunas g = new Gyvunas();
        Class<?> cl = g.getClass();
        Zmogus zmogus = cl.getAnnotation(Zmogus.class);
        System.out.println(zmogus.vardas());

        Method[] methods = Gyvunas.class.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Zmogus.class)) {
                Zmogus zm = method.getAnnotation(Zmogus.class);
                System.out.println(method);
            }
        }


    }   // TODO - sukurti algoritma
}
