package sec04.class01_field;

public class UsingThis {
    public int field = 10;

    class InnerClass{
        public int field = 20;

        void method() {
            MyfunctionalInterface my = () -> {
                System.out.println("Jin");
                System.out.println("Outter : "+UsingThis.this.field);
                System.out.println("Inner: "+ this.field);
            };
            my.method();
        }
    }
}
