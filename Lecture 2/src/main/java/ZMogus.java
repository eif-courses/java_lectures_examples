public class ZMogus {
    private String name;
    static {
        System.out.println("statinis blokas");
    }
    static {
        System.out.println("statinis blokas2");
    }
    static {
        System.out.println("statinis blokas3");
    }
    public ZMogus(String name) {
        System.out.println("as esu konstruktorius");

    }
}
