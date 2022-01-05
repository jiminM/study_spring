package sec03.class03_return;

public class MyFunctionExample {

    public static void main(String[] args) throws Exception {
        
        MyFunctionalInterface mj;
        mj = (a,b) -> {
            int num = a;
            int num2 = b;
            return num+num2;
        };
        System.out.println(mj.method(25,17));

        mj = (a,b) -> sum(a,b);
        System.out.println(mj.method(25,170));


        mj = new MyFunctionalInterface(){
            @Override
            public int method(int a, int b) {
                int num = a;
                int num3 = b;
                return num*num3;
            }
        };
        mj.method(6,788);

        
    }
    public static int sum(int x, int y){
        return x+y;
    }
}
