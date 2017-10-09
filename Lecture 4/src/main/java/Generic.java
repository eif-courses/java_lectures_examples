public class Generic<TIPAS extends String> {
    private Object obj;
    private TIPAS tipas;

    public TIPAS getTipas() {
        return tipas;
    }



    public void getInfo(){
        System.out.println("Tipa kuri nurodeme:"+
                tipas.getClass().getName());
    }

    public void setTipas(TIPAS tipas) {
        this.tipas = tipas;
    }
}
