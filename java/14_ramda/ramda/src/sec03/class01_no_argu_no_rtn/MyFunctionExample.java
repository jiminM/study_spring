package sec03.class01_no_argu_no_rtn;

public class MyFunctionExample {
    public static void main(String[] args) throws Exception {
        
        MyFunctionalInterface mj;
        mj = () -> {
            String str = "interface1";
            System.out.println(str);
        };
        mj.method();

        mj = ()->{
            String str = "interface2";
            System.out.println(str);
        };
        mj.method();

        mj = ()->{
            String str = "interface3";
            System.out.println(str);
        };
        mj.method();

        mj = new MyFunctionalInterface(){
            @Override
            public void method() {
                String str ="interface 44";
                System.out.println(str);
            }
        };
        mj.method();
    }
}
