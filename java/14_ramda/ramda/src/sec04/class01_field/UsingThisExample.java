package sec04.class01_field;

public class UsingThisExample {
    public static void main(String[] args) {
        UsingThis uthis = new UsingThis();
        UsingThis.InnerClass inner= uthis.new InnerClass();
        inner.method();
    }
}
