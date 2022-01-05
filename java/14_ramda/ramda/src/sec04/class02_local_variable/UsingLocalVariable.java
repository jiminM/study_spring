package sec04.class02_local_variable;

import sec03.class01_no_argu_no_rtn.MyFunctionalInterface;

public class UsingLocalVariable {
    void method(int arg){
        int localV = 100;

        // 람다식에 사용되는 매개변수나 지역변수들은 final로 자동으로 붙기에
        // 도중에 값 변경이 불가능
        //localV = 200;

        MyFunctionalInterface my = ()->{
            System.out.println(arg);
            System.out.println(localV);
        };
        my.method();
    }
    
}
