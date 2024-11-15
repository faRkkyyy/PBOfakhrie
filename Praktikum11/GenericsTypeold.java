public class GenericsTypeOld {
    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }

    public static void main(String args[]) {
        GenericsTypeOld type = new GenericsTypeOld();
        type.set("Java");
        String str = (String) type.get(); // Type casting, bisa menyebabkan ClassCastException
        System.out.println("Value from GenericsTypeOld: " + str);
    }
}