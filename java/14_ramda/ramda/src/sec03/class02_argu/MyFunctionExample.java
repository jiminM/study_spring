package sec03.class02_argu;

public class MyFunctionExample {
    public static void main(String[] args) throws Exception {
        
        MyFunctionalInterface mj;
        mj = (a) -> {
            int num = a;
            System.out.println(num);
        };
        mj.method(5);

        mj = (a) -> {
            int num = a;
            System.out.println(num*2);
        };
        mj.method(5);

        mj = new MyFunctionalInterface(){
            @Override
            public void method(int a) {
                int num = a;
            System.out.println(num*3);
            }
        };
        mj.method(6);
    }
}
