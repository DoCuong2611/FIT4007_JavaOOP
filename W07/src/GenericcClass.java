public class GenericcClass <T>{
    T ob;
    GenericcClass (T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
    void showType() {
        System.out.println("Kieu cua T: " + ob.getClass().getName());
    }
}
