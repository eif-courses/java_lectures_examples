import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Generic<String> s = new Generic<>();
        s.setTipas("aweawe");
        s.getInfo();
        Generic<Integer> ii = new Generic<>();
        ii.setTipas(521);
        ii.getInfo();
        Generic f = new Generic();*/
        List<Integer> l = new ArrayList<>();
        l.add(10); l.add(50); l.add(90);
        info(l);
        List<String> ss = new ArrayList<>();
        ss.add("waeawe"); ss.add("aweawe"); ss.add("fs");
        //info(ss);
        ///pvz(ss);
        pvz(l);
           // return ;
        }
    public static void pvz(List<? extends Number> list){
        System.out.println("pvz() rezultatatas: "+list.get(0));
    }
    public static <TIPAS extends Integer> void info(List<TIPAS> sarasas){
        for (TIPAS sar : sarasas) {
            System.out.println(sar);
        }
        List<Integer> list = new ArrayList<>();

        list.add(new Integer(50));
        for (int i = 0; i < list.size(); i++) {
            Integer integer = (Integer) list.get(i);
            
        }
    }
}
