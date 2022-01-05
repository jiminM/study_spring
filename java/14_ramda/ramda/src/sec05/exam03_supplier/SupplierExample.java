package sec05.exam03_supplier;

import java.util.function.IntSupplier;

public class SupplierExample {
    public static void main(String[] args) {
        IntSupplier intsupplier = () -> {
            int num = (int) (Math.random()*6)+1;
            return num;
        };
        int res = intsupplier.getAsInt();
        System.out.println(res);



    }
}
